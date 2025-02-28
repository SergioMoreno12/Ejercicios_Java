import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();
        int numero;
        int n=0;
        int contador=0;

        numero = ale.nextInt((50 - 1 + 1)) + 1;
        System.out.println("---Adivina el numero---");
        System.out.println("Solo tienes 3 intentos");
        do {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Digita el numero: ");
                n = teclado.nextInt();
                if (n < numero) {
                    System.out.println("El numero es mayor");
                } else if (n > numero) {
                    System.out.println("El numero es menor");
                } else {
                    System.out.println("Adivinaste el numero");
                    System.out.println("¡Ganaste!");
                    break;
                }
                contador++;
            }
        }while(contador<3);

        if(contador==3){
            System.out.println("Perdiste");
            System.out.println("Se acabaron tus intentos");
        }

        System.out.println("El numero era: " + numero);
    }
}
