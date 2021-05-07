package abstracts;

import java.rmi.RemoteException;


public interface CustomerCheckIfService {
	
	boolean CheckfPerson(String tc,String firstName,String lastName,int birtDate) throws RemoteException;

}
