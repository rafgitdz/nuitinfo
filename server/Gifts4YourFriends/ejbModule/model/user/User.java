
package model.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;



@Entity
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long _id;

  
    private String _name;

 
    private String _lastname;

    private Date _birthDate;

    private String _email;

    private String _nickname;

    private String _password;

    private Boolean _sex;
   
    @Transient
    private List<User> _friends;

  @Transient
    private List<Wish> _wishList;

    public User() {
        _friends = new ArrayList<User>();
        _wishList = new ArrayList<Wish>();
    }

    public User(String name, String lastname, String email, String nickname,
                String password, Integer sex) {
        _name = name;
        _lastname = lastname;
        _email = email;
        _nickname = nickname;
        _password = password;
        _friends = new ArrayList<User>();
        _wishList = new ArrayList<Wish>();
    }

    public User(String name, String lastname, Date birthDate, String email,
                String nickname, String password, Boolean sex) {
        _name = name;
        _lastname = lastname;
        _birthDate = birthDate;
        _email = email;
        _nickname = nickname;
        _password = password;
        _sex = sex;
        _friends = new ArrayList<User>();
        _wishList = new ArrayList<Wish>();
    }

     @Override
    public int hashCode() {
        int hash = 0;
        hash += (_id != null ? _id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this._id == null && other._id != null) || (this._id != null && !this._id.equals(other._id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.user[id=" + _id + "]";
    }
/******************************  GETTERS **************************************/
    public Date getBirthDate() {
        return _birthDate;
    }

    public String getEmail() {
        return _email;
    }

    public List<User> getFriends() {
        return _friends;
    }

    public String getLastname() {
        return _lastname;
    }

    public String getName () {
        return _name;
    }

    public String getNickname() {
        return _nickname;
    }

    public String getPassword() {
        return _password;
    }

    public Boolean getSex() {
        return _sex;
    }

    
    public Long getId() {
        return _id;
    }

/******************************  SETTERS **************************************/

    public void setBirthDate(Date _birthDate) {
        this._birthDate = _birthDate;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public void setFriends(List<User> _friends) {
        this._friends = _friends;
    }

    public void setId(Long id) {
        this._id = id;
    }

    public void setLastname(String _lastname) {
        this._lastname = _lastname;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setNickname(String _nickname) {
        this._nickname = _nickname;
    }

    public void setPassword(String _password) {
        this._password = _password;
    }

    public void setSex(Boolean _sex) {
        this._sex = _sex;
    }

/*****************************************************************************/

    public void addFriend(User friend) {
        _friends.add(friend);
    }

    public void removeFriend(User friend) {
        _friends.remove(friend);
    }

    public void addWish(Wish wish) {
        _wishList.add(wish);
    }

    public void removeWish(Wish wish) {
        _wishList.remove(wish);
    }

    public void removeWish(Integer position) {
        _wishList.remove(position);
    }

	public void setWishList(List<Wish> wishlist) {
		_wishList = wishlist;		
	}
}
