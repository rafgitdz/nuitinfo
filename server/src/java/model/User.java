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

    public User(String name, String lastname, String email, String nickname,
                String password) {
        _name = name;
        _lastname = lastname;
        _email = email;
        _nickname = nickname;
        _password = password;
        _friends = new ArrayList<Integer>();
    }

    
    public Integer getId() {
        return _id;
    }

    public void setId(Integer id) {
        _id = id;
    }

    public String getName(){
        return null;
        
    }


    
    public void addFriend(Integer id) {
        _friends.add(id);
    }







}
