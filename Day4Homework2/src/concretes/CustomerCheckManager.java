package concretes;

import java.rmi.RemoteException;

import abstracts.CustomerCheckIfService;

public class CustomerCheckManager implements CustomerCheckIfService {

	@Override
	public boolean CheckfPerson(String tc, String firstName, String lastName, int birtDate) throws RemoteException {
		System.out.println("Müşteri id doðrulandi");
		return true;
		
	}

}
