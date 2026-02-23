package claseFlota;

public class Bus extends FlotaTransportes {

	private int plazas;
	
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(String matricula, int anno, String cv, String modelo) {
		super(matricula, anno, cv, modelo);
		// TODO Auto-generated constructor stub
	}

	public Bus(String matricula, int anno, String cv, String modelo, int plazas) {
		super(matricula, anno, cv, modelo);
		this.plazas = plazas;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	@Override
	public String toString() {
		return "Bus [plazas=" + plazas + ", getMatricula()=" + getMatricula() + ", getAnno()=" + getAnno()
				+ ", getCv()=" + getCv() + ", getModelo()=" + getModelo() + "]";
	}
	
	

}
