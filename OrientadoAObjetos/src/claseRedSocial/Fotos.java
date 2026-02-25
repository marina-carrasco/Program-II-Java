package claseRedSocial;

public class Fotos extends Publicacion implements Borrable {
	public float tamaño;
	public String formato;
	
	public Fotos(float tamaño, String formato) {
		super();
		this.tamaño = tamaño;
		this.formato = formato;
	}

	public Fotos() {
		super();
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
		return "Fotos [tamaño=" + tamaño + ", formato=" + formato + "]";
	}

	@Override
	public void borrar(String borrarContenido) {
		// TODO Auto-generated method stub
		
	}

	
	
}
