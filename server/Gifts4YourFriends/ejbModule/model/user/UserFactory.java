package model.user;

import java.util.Date;
import java.util.List;

public class UserFactory {

	public User newUser(String name, String lastname, Date birthday, String mail,String nickname,String pwd,Integer sex, List<User> friends,
		    List<Wish> wishlist) {
		
		User usr = new User(name, lastname, mail, nickname, pwd, sex);
		for (User friend : friends)
			usr.addFriend(friend);
		usr.setWishList(wishlist);
		
		return null;
		
	}
	
}
