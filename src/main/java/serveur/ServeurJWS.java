package serveur;
import javax.xml.ws.Endpoint;

import services.BanqueService;



public class ServeurJWS {
	
	public static void main(String[] args) {
	String url="http://localhost:8586/";
	Endpoint.publish(url, new BanqueService());
	
	System.out.println(url);
	}
}
