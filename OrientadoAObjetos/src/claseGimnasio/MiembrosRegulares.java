package claseGimnasio;

public class MiembrosRegulares extends Usuarios {
	private int edad;
	private String tipoDeMiembro;
	
	public MiembrosRegulares(String nombre, String direccion, String numeroTlf, String correo, int edad,
			String tipoDeMiembro) {
		super(nombre, direccion, numeroTlf, correo);
		this.edad = edad;
		this.tipoDeMiembro = tipoDeMiembro;
	}
	
	public MiembrosRegulares() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MiembrosRegulares(String nombre, String direccion, String numeroTlf, String correo) {
		super(nombre, direccion, numeroTlf, correo);
		// TODO Auto-generated constructor stub
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTipoDeMiembro() {
		return tipoDeMiembro;
	}
	public void setTipoDeMiembro(String tipoDeMiembro) {
		this.tipoDeMiembro = tipoDeMiembro;
	}
	
	@Override
	public String toString() {
		return "MiembrosRegulares [edad=" + edad + ", tipoDeMiembro=" + tipoDeMiembro + ", getNombre()=" + getNombre()
				+ ", getDireccion()=" + getDireccion() + ", getNumeroTlf()=" + getNumeroTlf() + ", getCorreo()="
				+ getCorreo() + "]";
	}
	
	
	
	

}
