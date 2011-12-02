package model.user;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

@Local
public interface UserFactoryLocal {

	public User newUser(String name, String lastname, Date birthday,
			String mail, String nickname, String pwd, Integer sex,
			List<User> friends, List<Wish> wishlist);

}
