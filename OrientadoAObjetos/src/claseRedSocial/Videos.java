package claseRedSocial;

public class Videos extends Publicacion implements Borrable{
	private float duracion;
	private float tamaño;
	
	public Videos(String autor, String fecha, float duracion, float tamaño) {
		super(autor, fecha);
		this.duracion = duracion;
		this.tamaño = tamaño;
	}
	public Videos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Videos(String autor, String fecha) {
		super(autor, fecha);
		// TODO Auto-generated constructor stub
	}
	public float getDuracion() {
		return duracion;
	}
	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	public float getTamaño() {
		return tamaño;
	}
	public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
	}
	
	@Override
	public String toString() {
		return "Videos [duracion=" + duracion + ", tamaño=" + tamaño + ", getAutor()=" + getAutor() + ", getFecha()="
				+ getFecha() + "]";
	}
	@Override
	public void borrar() {
		// TODO Auto-generated method stub
		
	}
	
	

}
