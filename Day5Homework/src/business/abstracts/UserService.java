package business.abstracts;

import java.util.List;

import Entity.concretes.User;

public interface UserService {
	
	void add(User user);
	 User getByMail(String email);
	 List<User> getAll();


}
