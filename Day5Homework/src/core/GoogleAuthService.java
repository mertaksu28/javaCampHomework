package core;

import Entity.concretes.UserDto;

public interface GoogleAuthService {
	
	void register(String email);
	 void login(UserDto userDto);
	 void userExists(String email);

}
