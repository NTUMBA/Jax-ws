package services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import entities.Compte;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
	@WebMethod(operationName = "ConversionEuroToDh")
	public double conversion(@WebParam(name = "montant") double mt) {
		return mt * 11;
	}

	@WebMethod
	public Compte getCompte(@WebParam(name = "code") Long code) {
		return new Compte("CCP",code, 7000F, new Date());
	}

	@WebMethod
	public List<Compte> getComptes() {
		List<Compte> cptes = new ArrayList<Compte>();
		cptes.add(new Compte("LEP",1L, 7000F, new Date()));
		cptes.add(new Compte("Livret A",2L, 7000F, new Date()));
		return cptes;
	}
	// Ajouter un compte
	@WebMethod
	public List<Compte> addCompte(@WebParam(name = "compte") Compte compte) {
		List<Compte> cpte1 = new ArrayList<Compte>();
		compte.setNomCompte("CCP");
		compte.setCode(cpte1.size()+1L);
		compte.setDateCreation(new Date());
		cpte1.add(compte);
		return  cpte1;			
		}
	// Ajouter plusieurs comptes
	@WebMethod
	public List<Compte> addLotComptes(@WebParam(name = "compte") List<Compte> listCompte){
		List<Compte> cptes = new ArrayList<Compte>();
		/*for(Compte item : compte){
			cptes.add(item);
		}
		return cptes;*/
		Iterator<Compte> compteIt = listCompte.iterator();
		while (compteIt.hasNext()) {
			cptes.add(compteIt.next());
			
		}
		return cptes;
		
	
	}

	public BanqueService getBanqueServicePort() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
