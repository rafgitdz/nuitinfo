package model.user;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import model.user.exceptions.cannotAddSameUserTwiceException;
import model.user.exceptions.friendNotInTheListException;

@Entity
public class Group implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final String USER_NOT_EXIST = "Can't remove, User doesn't exist !";
	private static final String USER_ALREADY_EXIST = "User already exists !";
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long _id;

	private String _groupName;

	private String Description;

	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST }, targetEntity = User.class)
	private List<User> listUsers;

	/******************************* GETTERS AND SETTERS *****************************/

	public Group() {

	}

	public Group(Long id, String name, String description) {
		this._id = id;
		this._groupName = name;
		this.Description = description;

	}

	/**
	 * We want to add a user in a group. We have to check that that user is not
	 * already in the list
	 */
	public void addUser() throws cannotAddSameUserTwiceException {
		for (User u : listUsers) {
			if (listUsers.contains(u))
				throw new cannotAddSameUserTwiceException(USER_ALREADY_EXIST);
			else {
				u = new User();
				listUsers.add(u);
			}
		}
	}

	public void removeUser(User friend) throws friendNotInTheListException {
		if (!listUsers.contains(friend))
			throw new friendNotInTheListException(USER_NOT_EXIST);
		else {
			listUsers.remove(friend);
		}
	}

	public Long get_id() {
		return _id;
	}

	public void set_id(Long _id) {
		this._id = _id;
	}

	public String get_groupName() {
		return _groupName;
	}

	public void set_groupName(String _groupName) {
		this._groupName = _groupName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public List<User> getListUsers() {
		return listUsers;
	}

	public void setListUsers(List<User> listUsers) {
		this.listUsers = listUsers;
	}

}
