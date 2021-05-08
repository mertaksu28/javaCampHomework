
public class CampaignManager implements CampaingService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Yeni Kampanya Eklendi" + campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi" + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya Güncellendi" + campaign.getName());
		
	}

}
