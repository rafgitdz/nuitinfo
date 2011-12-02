package application;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;

import model.Category;
import model.user.Wish;

@Stateless
public class UserService implements UserServiceRemote {

	@Override
	public Integer createAccount(String name, String lastname, Date birthday,
			String mail, String nickname, String pwd, Integer sex,
			List<Integer> friends, List<Wish> whislist) {

		Integer result = 1; // User.createUser(name,lastname,birthday,mail,nickname,pwd,sex,friends,whislist);
		return result;
	}

	@Override
	public String AddWish(Long _id, String _name, String _description,
			List<Category> _categories) {

		return "";
	}

	@Override
	public String DelWish(Long _id, String _name, String _description,
			List<Category> _categories) {
		return "";
	}

	@Override
	public String showMessage(String param) {
		return "Hello! " + param.toUpperCase();
	}
}
