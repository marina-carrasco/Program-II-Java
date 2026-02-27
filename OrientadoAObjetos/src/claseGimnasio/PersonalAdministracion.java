package claseGimnasio;

public class PersonalAdministracion extends Usuarios{
	private String puesto;
	private int horario;
	
	public PersonalAdministracion(String nombre, String direccion, String numeroTlf, String correo, String puesto,
			int horario) {
		super(nombre, direccion, numeroTlf, correo);
		this.puesto = puesto;
		this.horario = horario;
	}
	
	public PersonalAdministracion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonalAdministracion(String nombre, String direccion, String numeroTlf, String correo) {
		super(nombre, direccion, numeroTlf, correo);
		// TODO Auto-generated constructor stub
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	
	@Override
	public String toString() {
		return "PersonalAdministracion [puesto=" + puesto + ", horario=" + horario + ", getNombre()=" + getNombre()
				+ ", getDireccion()=" + getDireccion() + ", getNumeroTlf()=" + getNumeroTlf() + ", getCorreo()="
				+ getCorreo() + "]";
	}
	
	
	
	
	
}
