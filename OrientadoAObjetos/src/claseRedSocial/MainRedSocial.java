package claseRedSocial;

import java.util.ArrayList;

public class MainRedSocial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Publicacion publicacion1 = new Texto("Pepe", "20 de mayo", "Hola, amigos!");
		Publicacion publicacion2 = new Fotos("Marina", "11 de junio", 20, "PNG");
		Publicacion publicacion3 = new Videos("Manolo", "19 de enero", 1, 200);
		Publicacion publicacion4 = new Texto("Lucía", "14 de febrero", "¡Feliz día a todos!");
		Publicacion publicacion5 = new Fotos("Carlos", "24 de diciembre", 12, "JPG");
		Publicacion publicacion6 = new Videos("Elena", "01 de agosto", 5, 1080);
		
		Comentarios comentario1 = new Comentarios("Me gusta mucho la playa");
		Comentarios comentario2 = new Comentarios("¡Qué buen entrenamiento el de hoy!");
		Comentarios comentario3 = new Comentarios("¿A qué hora empieza la clase de Yoga?");
		Comentarios comentario4 = new Comentarios("Excelente instructor, muy recomendado.");
		Comentarios comentario5 = new Comentarios("Me encantaría que hubiera más cupos para Pilates.");
		Comentarios comentario6 = new Comentarios("¡Esa foto del gimnasio quedó genial!");
		
		ArrayList<Publicacion> listaPublicaciones = new ArrayList<Publicacion>();
		
		listaPublicaciones.add(publicacion1);
		listaPublicaciones.add(publicacion2);
		listaPublicaciones.add(publicacion3);
		listaPublicaciones.add(publicacion4);
		listaPublicaciones.add(publicacion5);
		listaPublicaciones.add(publicacion6);
		
		
		ArrayList<Comentarios> listaComentarios = new ArrayList<Comentarios>();
		
		listaComentarios.add(comentario1);
		listaComentarios.add(comentario2);
		listaComentarios.add(comentario3);
		listaComentarios.add(comentario4);
		listaComentarios.add(comentario5);
		listaComentarios.add(comentario6);
		
		Usuarios usuario1 = new Usuarios("tenshi11", "tenshi@gmail.com", listaPublicaciones, listaComentarios);

		RedSocial redSocial = new RedSocial();
		
		ArrayList<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
		
		listaUsuarios.add(usuario1);
		
		redSocial.setListaUsuarios(listaUsuarios);
		
		System.out.println(redSocial.toString());

	}

}
