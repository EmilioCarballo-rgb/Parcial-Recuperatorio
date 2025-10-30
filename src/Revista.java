public class Revista extends Libro{
    private int numeroEdicion;

    public Revista(){

    }

    public Revista(String titulo,int añoPublicacion,int numeroEdicion) {
        super(titulo, añoPublicacion);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion(){
        return this.numeroEdicion;
    }
    public void setNumeroEdicion(int numeroEdicion){
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public String mostrasDatos(){
       return "Revista: " + getTitulo() + " | Edicion N°: " + getNumeroEdicion() + " | Año: " + getAñoPublicacion();
    }

    public String tipoPrestamo() {
    return "Préstamo por 7 días";
}
}

