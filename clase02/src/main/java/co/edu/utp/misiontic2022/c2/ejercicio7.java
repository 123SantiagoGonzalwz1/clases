package co.edu.utp.misiontic2022.c2;
import java.io.IOException;

public class ejercicio7 {

    public static void main(String[] args) throws IOException {
        char car;
        System.out.print("Ingrese un carácter: ");
        car = (char) System.in.read(); //lee un solo caracter

        if (Character.isUpperCase(car)) //utilizamos el método isUpperCase de la clase Character        
        {
            System.out.println("Es una letra mayúscula");
        } else {
            System.out.println("No es una letra mayúscula");
        }
    }
}
