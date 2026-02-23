package claseLanzallamas;

public class Lanzallamas {
	
	private String usuario;
	private String color;
	private int numeroSerie;
	private static int contadorNumerosSerie = 10;
	public Lanzallamas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lanzallamas(String usuario, String color, int numeroSerie) {
		super();
		this.usuario = usuario;
		this.color = color;
		this.numeroSerie = numeroSerie;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumeroSerie() {
		return numeroSerie;
	}
	@Override
	public String toString() {
		return "Lanzallamas [usuario=" + usuario + ", color=" + color + ", numeroSerie=" + numeroSerie + "]";
	}
	
	
	
	
	

	
	
	
}