package claseRedSocial;

public class Fotos extends Publicacion implements Borrable {
	private float tamaño;
	private String formato;
	public Fotos(String autor, String fecha, float tamaño, String formato) {
		super(autor, fecha);
		this.tamaño = tamaño;
		this.formato = formato;
	}
	
	public Fotos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fotos(String autor, String fecha) {
		super(autor, fecha);
		// TODO Auto-generated constructor stub
	}

	public float getTamaño() {
		return tamaño;
	}

	public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	@Override
	public String toString() {
		return "Fotos [tamaño=" + tamaño + ", formato=" + formato + ", getAutor()=" + getAutor() + ", getFecha()="
				+ getFecha() + "]";
	}

	@Override
	public void borrar() {
		// TODO Auto-generated method stub
		
	}
	

}
