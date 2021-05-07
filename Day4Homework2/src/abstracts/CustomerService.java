package abstracts;

import java.rmi.RemoteException;

import entities.Customer;

public interface CustomerService {
	
	void save(Customer customer) throws NumberFormatException, RemoteException;
	

}
