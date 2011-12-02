package application;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import model.Category;
import model.user.Wish;

@Remote
public interface UserServiceRemote {

	public String AddWish(Long _id, String _name, String _description,
			List<Category> _categories);

	public String DelWish(Long _id, String _name, String _description,
			List<Category> _categories);

	public Integer createAccount(String name, String lastname, Date birthday,
			String mail, String nickname, String pwd, Integer sex,
			List<Integer> friends, List<Wish> whislist);
	
	public String showMessage(String msg);
}
