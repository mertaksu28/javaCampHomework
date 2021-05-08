
public class GamerManager implements GamerService {

	private UserValidationService userValidationService;

	public GamerManager(UserValidationService userValidationService) {
		super();
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {

		if (userValidationService.Validate("123456")==true) {
			System.out.println("Kayýt oldu : " + gamer.getFirstName());
		} else {
			System.out.println("Doðrulama Baþarýsýz Kayýt Baþarýsýz");
		}

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kayýt Güncellendi : " + gamer.getFirstName());

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kayýt Silindi : " + gamer.getFirstName());

	}

}
