public class Libro extends Publicacion {
    private String autor;

    public Libro(){

    }


    public Libro(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }


    @Override
    public String mostrasDatos(){
       return "Libro: " + getTitulo() + " | Autor: " + getAutor() + " | Año: " + getAñoPublicacion();
    }

    
    public String tipoPrestamo() {
    return "Préstamo por 15 días";
}
}
