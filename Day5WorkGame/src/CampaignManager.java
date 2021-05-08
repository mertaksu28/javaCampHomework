
public class CampaignManager implements CampaignService {

	@Override
	public void addToNewCampaign(Campaign campaign) {
		System.out.println("Yeni Kampanya Eklendi : " + campaign.getName());
		
	}

	@Override
	public void deleteToCampaign(Campaign campaign) {
		System.out.println("Kampanya Silindi : " + campaign.getName());
		
	}

	@Override
	public void updateToCampaign(Campaign campaign) {
		System.out.println("Kampanya G�ncelendi : " + campaign.getName());
		
	}

	@Override
	public void useToCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " : �simli Kampanya Kullan�ld�");
		
	}

}
