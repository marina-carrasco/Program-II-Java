package claseRedSocial;


public class MainRedSocial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Publicacion post1 = new Texto("Hola, este es mi primer post!");
        Publicacion post2 = new Fotos(3.5f, "jpg");
        Publicacion post3 = new Video(120, 500.5f);
        
        Usuarios usuario1 = new Usuarios("ProgramadorArt", "dev@correo.com", null, null);
        
        Comentario com1 = new Comentario();
        
      
        usuario1.getListaPublicaciones().add(post1);
        usuario1.getListaPublicaciones().add(post2);
        usuario1.getListaPublicaciones().add(post3);
        
        
        usuario1.getListaComentarios().add(com1);

        
        if (post1 instanceof Editable) {
            ((Editable) post1).editar("Texto corregido");
        }


        System.out.println(usuario1.toString());

	}

}
