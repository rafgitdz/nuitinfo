package application;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import model.Category;
import model.user.Wish;

@Local
public interface UserServiceLocal{
	public String AddWish(Long _id, String _name, String _description, List<Category> _categories);
	public String DelWish(Long _id, String _name, String _description, List<Category> _categories);
	public Integer CreateAccount(
		    String name,
		    String lastname,
		    Date birthday,
		    String mail,
		    String nickname,
		    String pwd,
		    Integer sex,
		    List<Integer> friends,
		    List<Wish> whislist);
	public String sayHello();
}
