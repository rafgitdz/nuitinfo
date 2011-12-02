package application;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;

import model.Category;
import model.user.Wish;

@Stateless
public class UserService implements UserServiceLocal{

	public Integer createAccount(
		    String name,
		    String lastname,
		    Date birthday,
		    String mail,
		    String nickname,
		    String pwd,
		    Integer sex,
		    List<Integer> friends,
		    List<Wish> whislist) {

		    Integer result = 1; //User.createUser(name,lastname,birthday,mail,nickname,pwd,sex,friends,whislist);
		        return result;
		    }
	
	public String AddWish(Long _id, String _name, String _description, List<Category> _categories){
		
		return "";
	}
	
	public String DelWish(Long _id, String _name, String _description, List<Category> _categories){
		return "";
	}
	
	public String sayHello() {
        return ("Hello!");
    }
}
