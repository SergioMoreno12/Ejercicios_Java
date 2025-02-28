import java.util.Random;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();
        System.out.println("--------Aouesta y gana--------");
        System.out.println("Si sale 1, se multiplica por dos el dinero");
        System.out.println("Si sale 2, pierdes la mitad del dinero");
        System.out.println("si sale 3, pierdes todo el dinero");
        System.out.println("Ingresa la cantidad de dinero que quieres apostar:");
        double dinero = teclado.nextDouble();
        int numero=0;
        int desicion=0;
        do{
            numero = ale.nextInt((3 - 1 + 1)) + 1;
            System.out.println("El numero es: "+numero);
            if (numero==1){
                dinero=dinero*2;
                System.out.println("Se te multiplico por dos el dinero, ahora tienes: $"+dinero);
            }else if(numero==2){
                dinero=dinero/2;
                System.out.println("Ahora tienes la mitad del dinero: $"+dinero);
            }else{
                System.out.println("Perdiste todo el dinero");
                break;
            }
            System.out.println("¿Quieres continuar? 1 si, 2 no");
            desicion = teclado.nextInt();
        }while(desicion==1);

    }
}
