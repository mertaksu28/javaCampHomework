
public class ValidateUserManager implements ValidateUserService {

	@Override
	public boolean validate(int birthDay) {
		if (birthDay==1996) {
			return true;
		}else {
			return false;
		}
		
	}

}
