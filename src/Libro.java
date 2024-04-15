public class Libro {


    //Atributos

    private String titulo;
    private String autor;
    private int anioDePublicacion;
    private int numeroDePaginas;


    //Constructor
    public Libro(String titulo, String autor, int anioDePublicacion, int numeroDePaginas ){
            this.titulo = titulo;
            this.autor = autor;
            this.anioDePublicacion = anioDePublicacion;
            this.numeroDePaginas = numeroDePaginas;
    }


    //Metodo mostrarInformacion()
    public void mostrarInformacion(){

        System.out.println("Mostrar informacion");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + anioDePublicacion);
        System.out.println("Numero de paginas: " + numeroDePaginas);

    }




}
