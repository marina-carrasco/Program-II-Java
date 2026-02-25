package claseRedSocial;

public class Video extends Publicacion implements Borrable {
	public float duracion;
	public float tamaño;
	
	public Video(float duracion, float tamaño) {
		super();
		this.duracion = duracion;
		this.tamaño = tamaño;
	}

	public Video() {
		super();
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
		return "Video [duracion=" + duracion + ", tamaño=" + tamaño + "]";
	}

	@Override
	public void borrar(String borrarContenido) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
