package business.abstracts;

import Entity.concretes.User;
import Entity.concretes.UserDto;

public interface AuthService {

	void register(User user);

	void login(UserDto userDto);

	boolean userExist(String email);

}
