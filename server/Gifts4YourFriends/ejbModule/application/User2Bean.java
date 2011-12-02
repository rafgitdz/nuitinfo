package application;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface="org.jboss.tutorial.webservice.bean.User2")
public class User2Bean {
	
	public String sayHello(){
		return "Hello !";
	}

}
