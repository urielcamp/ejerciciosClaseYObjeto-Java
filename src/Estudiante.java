public class Estudiante {


    //Atributos
    private String nombre;
    private int edad;
    private String carrera;


    //Constructor Estudiante
    public Estudiante(String nombre, int edad, String carrera){

        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;

    }

    //Metodo cambiarCarrera()

    public void cambiarCarrera(String Ncarrera){
        carrera = Ncarrera;
    }


    //Metodo mostrarInformacion()

    public void mostrarInformacion(){
        System.out.println("Mostrar informacion Estudiante");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("-----------------------------------------");
    }

}
