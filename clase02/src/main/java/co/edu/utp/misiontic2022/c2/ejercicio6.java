package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;


public class ejercicio6 {

    public static void mian(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("Introduzca un número entero: ");
        N = sc.nextInt();

        if(N%10 == 0)
            System.out.println("Es multiplo de 10");
        else
            System.out.println("No es un multiplo de 10");
        
    } 
    
}