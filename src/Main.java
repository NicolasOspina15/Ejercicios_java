import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Aleatorio

        Random aleatorio=new Random();
        int D1, D2, D3, sumaD1=0, sumaD2=0, sumaD3=0;

        for (int i=1; i<=20; i++) {

            D1=aleatorio.nextInt((6-1)+1)+1;
            System.out.println("Numero generado");
            sumaD1+=D1;
            System.out.println(+D1);

            D2=aleatorio.nextInt((6-1)+1)+1;
            System.out.println("Numero generado");
            sumaD2+=D2;
            System.out.println(+D2);

            D3=aleatorio.nextInt((6-1)+1)+1;
            System.out.println("Numero generado");
            sumaD3+=D3;
            System.out.println(+D3);
        }

        System.out.println("Suma de D1: "+sumaD1);
        System.out.println("Suma de D2: "+sumaD2);
        System.out.println("Suma de D3: "+sumaD3);

        if (sumaD1>sumaD2 && sumaD1>sumaD3) {
        System.out.println("Ganador: dado 1");
         if (sumaD2>sumaD3) {
            System.out.println("Medio: dado 2");
            System.out.println("Peor: dado 3");
        } else {
            System.out.println("Medio: dado 3");
            System.out.println("Peor: dado 2");
        }
        } else if (sumaD2>sumaD1 && sumaD2>sumaD3) {
            System.out.println("Ganador: dado 2");
         if (sumaD1>sumaD3) {
            System.out.println("Medio: dado 1");
            System.out.println("Peor: dado 3");
        } else {
            System.out.println("Medio: dado 3");
            System.out.println("Peor: dado 1");
        }
        } else {
            System.out.println("Ganador: Dado 3");
         if (sumaD1>sumaD2) {
            System.out.println("Medio: dado 1");
            System.out.println("Peor: dado 2");
        } else {
            System.out.println("Medio: dado 2");
            System.out.println("Peor: dado 1");
        }
        }
    }
}