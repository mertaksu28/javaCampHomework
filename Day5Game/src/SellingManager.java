
public class SellingManager implements SellingService {
	
	private CampaingService campaingService;

	public SellingManager(CampaingService campaingService) {
		this.campaingService = campaingService;
	}

	@Override
	public void sell(Gamer gamer, Campaign campaign) {
		
		this.campaingService.add(campaign);
		
		System.out.println("Oyun satýn alýndý" + campaign.getName());
		
	}

}
