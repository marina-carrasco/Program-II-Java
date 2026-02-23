package claseFlota;

public class FlotaTransportes {
	private String matricula;
	private int anno;
	private String cv;
	private String modelo;
	
	public FlotaTransportes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlotaTransportes(String matricula, int anno, String cv, String modelo) {
		super();
		this.matricula = matricula;
		this.anno = anno;
		this.cv = cv;
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "FlotaTransportes [matricula=" + matricula + ", anno=" + anno + ", cv=" + cv + ", modelo=" + modelo
				+ "]";
	}
	
	
}
