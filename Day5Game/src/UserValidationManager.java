
public class UserValidationManager implements UserValidationService{

	@Override
	public boolean Validate(String tcNo) {
		if (tcNo=="123456") {
			return true;
		}
		else {
			return false;
		}
		
	}

}
