public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Biblioteca catalogo = new Biblioteca("Biblioteca Central", 4);

        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        Revista revista1 = new Revista();
        Revista revista2 = new Revista();
        Usuario usuario1 = new Usuario("Juan Perez");

        libro1.setTitulo("El principito");
        libro1.setAutor( "Antoine de Saint-Exupéry");
        libro1.setAñoPublicacion(1943);

        libro2.setTitulo("Los ojos del perro Siberiano");
        libro2.setAutor( "Santa Ana");
        libro2.setAñoPublicacion(1998);



        revista1.setTitulo("Gente");
        revista1.setNumeroEdicion(308);
        revista1.setAñoPublicacion(2022);

        revista2.setTitulo("Tiki-Tiki");
        revista2.setNumeroEdicion(100);
        revista2.setAñoPublicacion(2014);

        catalogo.agregarPublicacion(libro1);
        catalogo.agregarPublicacion(libro2);
        catalogo.agregarPublicacion(revista1);
        catalogo.agregarPublicacion(revista2);

        usuario1.agregarPrestamo(libro1);
        usuario1.agregarPrestamo(revista1);

        catalogo.mostrarCatalogo();
        catalogo.ordenarPorAnioDesc();
        usuario1.mostrarPrestamos();

    }

}
