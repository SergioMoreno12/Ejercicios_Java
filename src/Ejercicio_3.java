import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        System.out.println("Indice de Masa Corporal");
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cual es su peso?: ");
        double peso = teclado.nextDouble();
        System.out.println("¿Cual es su estatura?: ");
        double estatura = teclado.nextDouble();
        double IMC=peso/(estatura*estatura);
        System.out.println(IMC);
        if (IMC<18.5){
            System.out.println("Bajo peso");
        }else if (IMC>=18.5&&IMC<=24.9){
            System.out.println("Normal");
        }else if (IMC>=25&&IMC<=26.9){
            System.out.println("Sobrepeso grado 1");
        }else if (IMC>=27&&IMC<=29.9){
            System.out.println("Sobrepeso grado 2");
        }else if (IMC>=30&&IMC<=34.9){
            System.out.println("Obesidad tipo 1");
        }else if (IMC>=35&&IMC<=39.9){
            System.out.println("Obesidad tipo 2");
        }else if (IMC>=40&&IMC<=49.9){
            System.out.println("Obesidad tipo 3 (mórbida)");
        }else if (IMC>=50){
            System.out.println("Obesidad de tipo IV (extrema)");
        }
    }
}
