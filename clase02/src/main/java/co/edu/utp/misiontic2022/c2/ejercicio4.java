package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double velocidad;

        System.out.println("Por favor introduzca la velocidad en Km/h: ");
        velocidad = sc.nextDouble();

        velocidad = velocidad*1000/3600;

        System.out.println("La velocidad en m/s es: " + velocidad);
    }
    
}
