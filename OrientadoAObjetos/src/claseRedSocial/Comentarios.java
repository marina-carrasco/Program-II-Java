package claseRedSocial;

public class Comentarios {
	private String textoComent;

	public Comentarios(String textoComent) {
		super();
		this.textoComent = textoComent;
	}

	public Comentarios() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTextoComent() {
		return textoComent;
	}

	public void setTextoComent(String textoComent) {
		this.textoComent = textoComent;
	}

	@Override
	public String toString() {
		return "Comentarios [textoComent=" + textoComent + "]";
	}
	
	
	
	

}
