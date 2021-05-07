package Adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckIfService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckIfService {

	@Override
	public boolean CheckfPerson(String tc,String firstName,String lastName,int birtDate) throws RemoteException  {
		
		KPSPublicSoapProxy merniss=new KPSPublicSoapProxy();
		boolean result=true;
		result=merniss.TCKimlikNoDogrula(Long.parseLong(tc), firstName, lastName, birtDate);
		return result;
		 
	}

}
