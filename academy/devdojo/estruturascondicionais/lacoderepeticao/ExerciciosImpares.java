package academy.devdojo.estruturascondicionais.lacoderepeticao;

import java.util.Scanner;

public class ExerciciosImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor desejado: ");
        int valorFinal = sc.nextInt();
        int contador = 0;
        while (contador <= valorFinal) {
            if (contador % 2 != 0) {
                System.out.println("contador "+ contador);
            }
            contador++;
        }
    }
}
