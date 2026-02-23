package claseFlota;

public class Taxi extends FlotaTransportes {
	private String licencia;

	public Taxi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Taxi(String matricula, int anno, String cv, String modelo) {
		super(matricula, anno, cv, modelo);
		// TODO Auto-generated constructor stub
	}

	public Taxi(String matricula, int anno, String cv, String modelo, String licencia) {
		super(matricula, anno, cv, modelo);
		this.licencia = licencia;
	}
	
	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	@Override
	public String toString() {
		return "Taxi [licencia=" + licencia + ", getMatricula()=" + getMatricula() + ", getAnno()=" + getAnno()
				+ ", getCv()=" + getCv() + ", getModelo()=" + getModelo() + "]";
	}

	
	
}
