
public class GameSellManager implements GameSellService {
	
	CampaignManager campaignManager;

	public GameSellManager(CampaignManager campaignManager) {
		this.campaignManager = campaignManager;
	}

	@Override
	public void sell(Game game, User user, Campaign campaign) {
		campaignManager.useToCampaign(campaign);
		System.out.println(game.getName() +" Oyunu : " + user.getFirstName() + " �simli Ki�iye " + campaign.getName() + " ile " + campaign.getCampaignPrice() + " TL' ye Sat�ld�.");
		
	}


}
