
public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setFirstName("Mert");
		user.setLastName("AKSU");
		user.setBirthDay(1996);
		user.setNationalityId("1234567891011");
		
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setName("Yaz Kampanyasý");
		campaign.setDiscountRate(250);
		
		Game game = new Game();
		game.setId(1);
		game.setName("LOL");
		game.setPay(500);
		
		
		UserManager manager = new UserManager(new ValidateUserManager());
		manager.add(user);
		
		System.out.println();
		
		GameSellManager gameSellManager = new GameSellManager(new CampaignManager());
		
		gameSellManager.sell(game, user, campaign);
		
		
		System.out.println();
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addToNewCampaign(campaign);
		
		System.out.println();
		
		campaignManager.deleteToCampaign(campaign);
		
		System.out.println();
		
		campaignManager.updateToCampaign(campaign);
		
		
	}

}
