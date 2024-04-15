//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        Libro libro1 = new Libro("Harry Potter", "J.K.Rowling" ,1997, 223  );

        libro1.mostrarInformacion();

        //Ejercicio 2

        Estudiante estudiante1 = new Estudiante("Jaime", 25, "Medicina");

        estudiante1.cambiarCarrera("Ingenieria");

        estudiante1.mostrarInformacion();

        //Ejercicio 3

        Circulo c1 = new Circulo(2.0);

        c1.calcularArea();
        c1.calcularPerimetro();
        c1.mostrarInformacion();

    }
}