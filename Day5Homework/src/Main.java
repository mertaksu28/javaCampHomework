import java.util.Scanner;

import Entity.concretes.User;
import Entity.concretes.UserDto;
import business.concretes.AuthManager;
import business.concretes.UserManager;
import core.GoogleAdapters;
import dataAccess.concretes.HibernateUserDao;

public class Main {
	public static void main(String[] args) {
		
		User user = new User();
		user.setId(1);
		user.setFirstName("Mert");
		user.setLastName("AKSU");
		user.setEmail("mertaksu28@gmail.com");
		user.setPassword("123456");
		
		User user1 = new User();
		user1.setId(2);
		user1.setFirstName("Mert");
		user1.setLastName("AKSU");
		user1.setEmail("mert@gmail.com");
		user1.setPassword("648465948465");
		
		User user2 = new User();
		user2.setId(1);
		user2.setFirstName("Aksu");
		user2.setLastName("mert");
		user2.setEmail("aksu28@gmail.com");
		user2.setPassword("4645");
		
		User user3 = new User();
		user3.setId(1);
		user3.setFirstName("Engin");
		user3.setLastName("Demiroð");
		user3.setEmail("engin28@gmail.com");
		user3.setPassword("465461");

		UserManager userManager = new UserManager(new HibernateUserDao(), new GoogleAdapters());
		
		userManager.add(user);
		
		AuthManager authManager = new AuthManager(new UserManager(new HibernateUserDao(), new GoogleAdapters()));
		
		userManager.getAll();
		
		UserDto userDto = new UserDto();
		userDto.setEmail("mertaksu28@hotmail.com");
		userDto.setPassword("123456");
		
		authManager.login(userDto);
		
		UserDto userDto2 = new UserDto();
		
		userDto2.setEmail("engin28@gmail.com");
		userDto2.setPassword("132");
		
	
	}
	
}
