package claseFlota;

import java.util.ArrayList;

public class MainTransportes {

	public static void main(String[] args) {
		// Se puede hacer de 2 maneras.
		FlotaTransportes taxi1 = new Taxi("3844JGJ", 1931, "SSS", "WWW", "3894784HK");
		
		Taxi taxi2 = new Taxi("147412HJH", 1961, "YYY", "SWS", "295489GHY");
		
		FlotaTransportes bus1 = new Bus("3431341j", 1093, "ddd", "34141", 25);
		
		Bus bus2 = new Bus("43894KWDJ", 2525, "JJJ", "12092", 30);
		Bus bus3 = new Bus("214123VEW", 1293, "WWW", "6326", 25);
		
		System.out.println(taxi1.toString());
		System.out.println(taxi2.toString());
		System.out.println(bus1.toString());
		System.out.println(bus2.toString());
		System.out.println(bus3.toString());
		
		AgenciaTransportes agencia = new AgenciaTransportes();
		ArrayList<FlotaTransportes> flota = new ArrayList<FlotaTransportes>();
		flota.add(taxi1);
		flota.add(taxi2);
		flota.add(bus1);
		flota.add(bus2);
		flota.add(bus3);
		
		agencia.setFlotaTransportes(flota);
		
		System.out.println(agencia.toString());
		
		
		int cantidadTaxis = 0;
		for (int i = 0; i < flota.size(); i++) {
			if (flota.get(i) instanceof Taxi) {
				cantidadTaxis++;
			}
		}
		System.out.println(cantidadTaxis);
		
		
	}

}
