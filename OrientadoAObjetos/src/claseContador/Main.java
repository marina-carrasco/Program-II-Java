package claseContador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] valores = new int[5];
		Contador contador = new Contador(valores);
		System.out.println(contador.toString());
		contador.incrementar();
		System.out.println(contador.toString());
		contador.decrementar();
		System.out.println(contador.toString());

	}

}
