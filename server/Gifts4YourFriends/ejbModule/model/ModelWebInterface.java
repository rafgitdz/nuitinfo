/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.List;

import model.user.User;

public class ModelWebInterface {
	private List<User> _users;

	public User getUserById(Long id) {
		for (User user : this._users)
			if (user.getId() == id)
				return user;
		return null;
	}

	public List<User> getUserByName(String name) {
		List<User> result = new ArrayList<User>();
		for (User user : this._users)
			if (user.getName() == null ? name == null : user.getName().equals(
					name))
				result.add(user);
		return result;
	}

	public List<User> getUserByLastName(String lastname) {
		List<User> result = new ArrayList<User>();
		for (User user : this._users)
			if (user.getLastname() == null ? lastname == null : user
					.getLastname().equals(lastname))
				result.add(user);
		return result;
	}
}
