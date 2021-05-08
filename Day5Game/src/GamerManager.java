
public class GamerManager implements GamerService {

	private UserValidationService userValidationService;

	public GamerManager(UserValidationService userValidationService) {
		super();
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {

		if (userValidationService.Validate("123456")==true) {
			System.out.println("Kay�t oldu : " + gamer.getFirstName());
		} else {
			System.out.println("Do�rulama Ba�ar�s�z Kay�t Ba�ar�s�z");
		}

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kay�t G�ncellendi : " + gamer.getFirstName());

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kay�t Silindi : " + gamer.getFirstName());

	}

}
