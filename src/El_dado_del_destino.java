import java.util.Random;
import java.util.Scanner;
public class El_dado_del_destino {
    public static void main(String[] args) {
        Random ale = new Random();
        Scanner teclado = new Scanner(System.in);
        System.out.println("-----El dado del destino-----");
        int vidas=5;
        int puntos=0;
        int dado;
        int lanzar=0;
        int ronda=0;
        System.out.println("si sale:");
        System.out.println("1 | pierdes una vida");
        System.out.println("2 | ganas un punto");
        System.out.println("3 | no pasa nada");
        System.out.println("4 | ganas un punto");
        System.out.println("5 | no pasa nada");
        System.out.println("6 | ganas 3 puntos");
        System.out.println("Tines: " + puntos + " puntos" + " y " + vidas + " vidas");
        do{
            System.out.println("------------------------------");
            System.out.println("Presiona 1 para lanzar el dado");
            lanzar = teclado.nextInt();
            if (lanzar==1){
                dado = ale.nextInt((6 - 1 + 1)) + 1;
                System.out.println("Salio " + dado);
                System.out.println("------------------------------");
                ronda++;
                System.out.println("Ronda " + ronda);
                if (dado==1){
                    vidas=vidas-1;
                    System.out.println("Persidte una vida");
                    System.out.println("Vidas= " + vidas + " | Puntos= " + puntos);
                }else if (dado==2){
                    puntos=puntos+1;
                    System.out.println("Ganaste un punto");
                    System.out.println("Vidas= " + vidas + " | Puntos= " + puntos);
                }else if (dado==3){
                    System.out.println("No pasa nada");
                    System.out.println("Vidas= " + vidas + " | Puntos= " + puntos);
                }else if (dado==4){
                    puntos=puntos+1;
                    System.out.println("Ganaste un punto");
                    System.out.println("Vidas= " + vidas + " | Puntos= " + puntos);
                }else if (dado==5){
                    System.out.println("No pasa nada");
                    System.out.println("Vidas= " + vidas + " | Puntos= " + puntos);
                }else if (dado==6){
                    puntos=puntos+3;
                    System.out.println("Ganaste tres puntos");
                    System.out.println("Vidas= " + vidas + " | Puntos= " + puntos);
                }
            }else{
                System.out.println("Numero invalido");
            }
            if (vidas==0){
                System.out.println("Perdiste :(");
            } else if (puntos>10){
                System.out.println("Ganaste");
            }
        }while(vidas>0 && puntos<=10);
    }
}