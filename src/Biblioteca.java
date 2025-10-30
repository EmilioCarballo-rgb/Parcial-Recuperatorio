public class Biblioteca extends Libro {
    private String nombre;
    private Publicacion[] catalogo;
    private int cantidad;

    public Biblioteca(String nombre, int tamanio) {
        this.nombre = nombre;
        catalogo = new Publicacion[tamanio];
        cantidad = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPublicacion(Publicacion p) {
        //Le saque el -1 porque sino nunca se va a llenar el arreglo
        if (cantidad < catalogo.length) {
            catalogo[cantidad] = p;
            cantidad++;
        } else {
            System.out.println("No hay espacio disponible");
        }
    }

    public void mostrarCatalogo() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(catalogo[i].mostrasDatos());

        }
    }

    public void ordenarPorAnioDesc() {
        //Le cambie la boquita de asi "<" a asi ">"
        for (int i = 0; i > cantidad - 1; i++) {
            for (int j = 0; j < cantidad - i - 1; j++) {
                if (catalogo[j].getAñoPublicacion() > catalogo[j + 1].getAñoPublicacion()) {
                    Publicacion aux = catalogo[j];
                    catalogo[j] = catalogo[j + 1];
                    catalogo[j + 1] = aux;
                }
            }
        }
    }

    public Publicacion buscarPorTitulo(String titulo) {
        for (int i = 0; i < cantidad; i++) {
            //Le cambie el getNombre() a getTitulo()
            if (catalogo[i].getTitulo().equalsIgnoreCase(titulo)) {
                return catalogo[i];
            }
        }
        return null;

}
}