public class Circulo {



    //Atributos

    private double radio;
    private static double PI = 3.1415;
    private double area;
    private double perimetro;
    //Constructor

    public Circulo(double radio){
        this.radio = radio;
    }

    //Metodo calcularArea()

    public double calcularArea(){
         area = (radio * radio) * PI;
        return area;
    }

    //Metodo calcularPerimetro()

    public double calcularPerimetro(){

         perimetro = 2*radio*PI;
        return perimetro;
    }

    //Metodo mostrarInformacion()

    public void mostrarInformacion(){
        System.out.println("Mostrar informacion circulo");
        System.out.println("radio: " + radio);
        System.out.println("Area: " + area);
        System.out.println("Pi: " + PI);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("----------------------------------------");
    }

}






