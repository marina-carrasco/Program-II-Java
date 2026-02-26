package claseRedSocial;

public abstract class Publicacion {
	private String autor;
	private String fecha;
	
	public Publicacion(String autor, String fecha) {
		super();
		this.autor = autor;
		this.fecha = fecha;
	}
	
	public Publicacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Publicacion [autor=" + autor + ", fecha=" + fecha + "]";
	}
	

}
