package pkg1.pkg8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      double ancho;
      double largo;
      double valorm2;
      double metro2;
        System.out.println("Ingrese ancho: ");
        ancho = entrada.nextDouble();
        System.out.println("ingrese largo: ");
        largo = entrada.nextDouble();
        System.out.println("ingrese valor del m2: ");
        valorm2 = entrada.nextDouble();
        metro2 = ancho*largo;
        valorm2 = metro2 * valorm2;
        System.out.println("El valor para cercar el terreno será de $"+valorm2);
        ancho = ((ancho*2) + (largo*2)) *3;
        System.out.println("la cantidad necesaria de alambre para cercar el terreno es de "+ancho+" mts");
        
    }
    
}
