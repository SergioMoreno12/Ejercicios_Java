import java.util.Random;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        System.out.println("-------------------Calculadora--------------------");
        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();
        int numero1;
        int numero2;
        int desicion;
        double resultado;
        String operador;
        do{
            numero1 = ale.nextInt((100 - 1 + 1)) + 1;
            numero2 = ale.nextInt((100 - 1 + 1)) + 1;
            System.out.println("Numero 1: " + numero1 + " | " + "Numero 2: " + numero2);
            System.out.println("--------------------------------------------------");
            System.out.print("Ingrese un signo aritmético (+, -, *, /, ^, %): ");
            operador = teclado.next();
            switch (operador) {
                case "+":
                    resultado = numero1 + numero2;
                    System.out.println(numero1 + " + " + numero2 + " = " + resultado);
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    System.out.println(numero1 + " - " + numero2 + " = " + resultado);
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    System.out.println(numero1 + " * " + numero2 + " = " + resultado);
                    break;
                case "/":
                    resultado = numero1 / numero2;
                    System.out.println(numero1 + " / " + numero2 + " = " + resultado);
                    break;
                case "^":
                    resultado = Math.pow(numero1, numero2);
                    System.out.println(numero1 + " ^ " + numero2 + " = " + resultado);
                    break;
                case "%":
                    resultado = numero1 % numero2;
                    System.out.println(numero1 + " % " + numero2 + " = " + resultado);
                    break;
                default:
                    System.out.println("Operador inválido, intente nuevamente");
            }
            System.out.println("--------------------------------------------------");
            System.out.println("¿Desea realizar otra operación? 1 si, 2 no");
            desicion = teclado.nextInt();
            System.out.println("--------------------------------------------------");
        }while (desicion==1);
        System.out.println("Gracias por usar la calculadora");
    }
}
