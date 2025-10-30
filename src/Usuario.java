public class Usuario implements IGestionPrestamos {
    String nombre;
    Publicacion[] prestamos;
    int cantidadMaxPrestamos;

    public Usuario(String nombre){
        this.nombre = nombre;
        
    }

    @Override
    public void agregarPrestamo(Publicacion p) {
        if (cantidadMaxPrestamos < prestamos.length - 1) {
            prestamos[cantidadMaxPrestamos] = p;
            cantidadMaxPrestamos++;
        } else {
            System.out.println("No puede tomar más préstamos");
        }
    }

    @Override
    public void mostrarPrestamos() {
        System.out.println("Préstamos de " + nombre + ":");
        for (int i = 0; i < cantidadMaxPrestamos; i++) {
            Publicacion p = prestamos[i];
            String tipo = "";
            if (p instanceof Libro) {
                tipo = ((Libro)p).tipoPrestamo();
            } else if (p instanceof Revista) {
                tipo = ((Revista)p).tipoPrestamo();
            }
            System.out.println(p.mostrasDatos() + " → " + tipo);
        }
    }
}
