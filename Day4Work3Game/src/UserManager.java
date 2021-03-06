
public class UserManager implements UserService {
	
	ValidateUserManager validateUserManager;
	

	public UserManager(ValidateUserManager validateUserManager) {
		this.validateUserManager = validateUserManager;
	}

	@Override
	public void add(User user) {
		if (validateUserManager.validate(user.getBirthDay())) {
			System.out.println("Kullanıcı doğrulandı, Oyuncu Eklendi : " + user.getFirstName());
		}
		else {
			System.out.println("Kullanıcı doğrulanamadı : " + user.getFirstName());
		}
		
		
	}

	@Override
	public void update(User user) {
		System.out.println("Oyuncu güncellendi : " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Oyuncu Silindi : " + user.getFirstName());
		
	}

}
