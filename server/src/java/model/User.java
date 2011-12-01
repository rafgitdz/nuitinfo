/*
 * The user of our app
 */

package model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Michelle AVOMO, Milan Kabac
 *
 */
public class User {
    private Integer _id;
    private String _name;
    private String _lastname;
    private Date _birthDate;
    private String _email;
    private String _nickname;
    private String _password;
    private Boolean _sex;
    private List<Integer> _friends;
    private List<Wish> _wishList;

    public User() {
        _friends = new ArrayList<Integer>();
        _wishList = new ArrayList<Wish>();
    }

    public User(String name, String lastname, String email, String nickname,
                String password) {
        _name = name;
        _lastname = lastname;
        _email = email;
        _nickname = nickname;
        _password = password;
        _friends = new ArrayList<Integer>();
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
        _friends = new ArrayList<Integer>();
        _wishList = new ArrayList<Wish>();
    }
/******************************  GETTERS **************************************/
    public Date getBirthDate() {
        return _birthDate;
    }

    public String getEmail() {
        return _email;
    }

    public List<Integer> getFriends() {
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

    
    public Integer getId() {
        return _id;
    }

/******************************  SETTERS **************************************/

    public void setBirthDate(Date _birthDate) {
        this._birthDate = _birthDate;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public void setFriends(List<Integer> _friends) {
        this._friends = _friends;
    }

    public void setId(Integer _id) {
        this._id = _id;
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

    public void addFriend(Integer id) {
        _friends.add(id);
    }

    public void removeFriend(Integer id) {
        _friends.remove(id);
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
}
