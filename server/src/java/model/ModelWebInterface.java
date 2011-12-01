/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asamie
 */
public class ModelWebInterface {
    private static List<User> _users;


    public static Integer CreateUser (String  name, String lastname,
            String nickname, String pwd, String mail, Integer birthday) {
            for (User user : _users)
                if (user.getNickname() == null ? nickname == null : user.getNickname().equals(nickname))
                    return 0;
            _users.add(new User(name, lastname, mail, nickname, pwd));
            return 1;
    }


    /****************************** GET USER ********************************/

    public User getUserById(Long id) {
        for (User user : this._users)
            if (user.getId() == id)
                return user;
        return null;
    }

    public List<User> getUserByName(String name) {
        List<User> result = new ArrayList<User>();
        for (User user : this._users)
            if (user.getName() == null ? name == null : user.getName().equals(name))
                result.add(user);
        return result;
    }

    public List<User> getUserByLastName(String lastname) {
        List<User> result = new ArrayList<User>();
        for (User user : this._users)
            if (user.getLastname() == null ? lastname == null : user.getLastname().equals(lastname))
                result.add(user);
        return result;
    }
}

