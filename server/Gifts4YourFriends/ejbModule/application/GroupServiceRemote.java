package application;

import javax.ejb.Remote;

import model.user.User;

@Remote
public interface GroupServiceRemote {
	void addFriend(); 
	void removeFriend(User friend);
	void createGroup(String name, String Description);
	
	

}
