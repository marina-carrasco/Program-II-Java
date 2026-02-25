package claseRedSocial;

public class Texto extends Publicacion implements Editable, Borrable {
	private String texto;

	public Texto(String texto) {
		super();
		this.texto = texto;
	}

	public Texto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Texto [texto=" + texto + "]";
	}

	@Override
	public void borrar(String borrarContenido) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(String editarContenido) {
		// TODO Auto-generated method stub
		
	}
	
	
}
