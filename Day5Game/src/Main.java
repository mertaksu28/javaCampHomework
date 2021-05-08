
public class Main {

	public static void main(String[] args) {

		GamerManager gamerManager = new GamerManager(new UserValidationManager());
		
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Mert");
		gamer.setLastName("AKSU");
		gamer.setBirthDay(1996);
		gamer.setIdentityNumber(123456);
		
		gamerManager.add(gamer);
		

	}

}
