package claseFlota;

import java.util.ArrayList;

public class AgenciaTransportes {
	private ArrayList<FlotaTransportes> flotaTransportes;

	public AgenciaTransportes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgenciaTransportes(ArrayList<FlotaTransportes> flotaTransportes) {
		super();
		this.flotaTransportes = flotaTransportes;
	}

	public ArrayList<FlotaTransportes> getFlotaTransportes() {
		return flotaTransportes;
	}

	public void setFlotaTransportes(ArrayList<FlotaTransportes> flotaTransportes) {
		this.flotaTransportes = flotaTransportes;
	}

	@Override
	public String toString() {
		return "AgenciaTransportes [flotaTransportes=" + flotaTransportes + "]";
	}
	
	
	
	
	
}
