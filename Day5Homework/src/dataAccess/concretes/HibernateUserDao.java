package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Entity.concretes.User;
import dataAccess.abstracts.UserDao;

public class HibernateUserDao implements UserDao {
	
	
	private List<User> users=new ArrayList<User>();
	
	public HibernateUserDao() {
		User user1=new User(1,"Mert","AKSu","mert@gmail.com","123456",true);
		User user2=new User(2,"Engin","Demiroð","engin@gmail.com","987654",true);
		
		users.add(user1);
		users.add(user2);
	}

	@Override
	public void join(User user) {
		System.out.println("Kullanýcý üye oldu : " +  user.getFirstName());
		
	}

	
	
	@Override
	public void add(User user) {
		System.out.println("Added "+ user.getFirstName());
		users.add(user);
		
	}

	@Override
	public void update(User user) {
		System.out.println("User updated " + user.getFirstName() );
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println("User deleted" +user.getFirstName() );
		
	}

	

	@Override
	public List<User> getAll() {
		 return users;
	}

	@Override
	public User getByEmail(String email) {
		for (User user:users) {
			if(user.getEmail()==email)
				return user;
		} 
		return null;
		
	}



	@Override
	public User getByEmailandPassword(String email, String password) {
		for(User user:users) {
			if(user.getEmail()==email&&user.getPassword()==password) {
				return user;
			}
		}
		return null;
	}

}
