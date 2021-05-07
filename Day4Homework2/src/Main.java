import java.rmi.RemoteException;

import Adapters.MernisServiceAdapter;
import abstracts.BaseCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException  {
		
		Customer customer = new Customer();
		
		customer.setId(1);
		customer.setFirstName("Mert");
		customer.setLastName("AKSU");
		customer.setDateOfBirth(1996);
		customer.setNationaliyId("4646");
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.save(customer);
		
		

	
	}

}
