package concretes;

import abstracts.BaseCustomerManager;
import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
		
		System.out.println("Neroya Müþteri Eklendi : " + customer.getFirstName());
		
	}
	
	

}
