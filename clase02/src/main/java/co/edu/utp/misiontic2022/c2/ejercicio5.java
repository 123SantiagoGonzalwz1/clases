package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double cateto1, cateto2, hipotenusa;

        System.out.print("Por favor introduzca el valor del primer cateto: ");
        cateto1 = sc.nextDouble();
        System.out.print("Por favor introduzca el valor del segundo cateto: ");
        cateto2 = sc.nextDouble();

        hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2, 2));

        System.out.println("El valor de la hipotenusa es: " + hipotenusa);
    }
    
}
