package claseRedSocial;

public class Texto extends Publicacion implements Editable,Borrable{
	private String texto;

	public Texto(String autor, String fecha, String texto) {
		super(autor, fecha);
		this.texto = texto;
	}

	public Texto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Texto(String autor, String fecha) {
		super(autor, fecha);
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
		return "Texto [texto=" + texto + ", getAutor()=" + getAutor() + ", getFecha()=" + getFecha() + "]";
	}

	@Override
	public void borrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar() {
		// TODO Auto-generated method stub
		
	}
	
	

}
