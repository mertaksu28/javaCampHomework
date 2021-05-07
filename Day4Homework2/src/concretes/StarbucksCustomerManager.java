package concretes;
import java.rmi.RemoteException;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckIfService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckIfService customerCheckIfService;


	public StarbucksCustomerManager(CustomerCheckIfService customerCheckIfService) {
		this.customerCheckIfService = customerCheckIfService;
	}

	
	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		
		if(customerCheckIfService.CheckfPerson(customer.getNationaliyId(),customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth())) {
			System.out.println("Kaydedildi : " +customer.getFirstName());
		}
	 else {
	 			System.out.println("Gerçek Kiþi Deðil");
			}
		
		
	}

}
