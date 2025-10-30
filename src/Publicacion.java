public class Publicacion {
    private String titulo;
    private int añoPublicacion;


    public Publicacion(){

    }


    public Publicacion(String titulo, int añoPublicacion){
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public int getAñoPublicacion(){
        return añoPublicacion;
    }
    public void setAñoPublicacion(int añoPublicacion){
        this.añoPublicacion = añoPublicacion;
    }


    public String mostrasDatos(){
       return "Publicacion:" + getTitulo() + "| Año:" + getAñoPublicacion();
    }

    

}