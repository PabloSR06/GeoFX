package dad.GeoFX.main;

import java.io.IOException;

import dad.GeoFX.api.IpifyService;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IpifyService service = new IpifyService();
		try {
			System.out.println(service.getIp());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
