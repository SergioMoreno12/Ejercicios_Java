import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio_1 {
    public static void main(String[] args) {
        int maxR=10;
        int minR=1;
        int R, D1, D2;
        int contadorD1=0;
        int contadorD2=0;

        Random ale = new Random();
        R = ale.nextInt((maxR - minR + 1)) + minR;
        System.out.println("Numero de rondas:" + R);

        for(int i = 1; i <= R; i++){
            D1 = ale.nextInt((6 - 1 + 1)) + 1;
            contadorD1 += D1;

            D2 = ale.nextInt((6 - 1 + 1)) + 1;
            contadorD2 += D2;

            System.out.println("D1: "+ D1 + " | D2: "+ D2);
        }

        System.out.println("Suma dado 1: " + contadorD1 + " | Suma dado 2: " +contadorD2);

        if (contadorD1>contadorD2){
            System.out.println("El ganador es el dado 1");
        }else if (contadorD1<contadorD2){
            System.out.println("El ganador es el dado 2");
        }else if (contadorD1==contadorD2){
            System.out.println("Es empate");
        }
    }
}