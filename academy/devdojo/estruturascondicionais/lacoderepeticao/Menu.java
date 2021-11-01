package academy.devdojo.estruturascondicionais.lacoderepeticao;

import java.util.Scanner;

/*
Como usuário eu gostaria de ter um menu visual que seja navegavel através de números. 
O menu deve ser exibido da seguinte forma:

1. Calcular imposto
2. Depositar salário
3. Sair

O menu deve ficar disponivel enquanto eu não digitar o número 3.
Dessa forma o sistema ficará em execução, evitando ter que ser reiniciado a cada operação.
*/
public class Menu {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("1. Calcular Imposto");
            System.out.println("2. Depositar Salário");
            System.out.println("3. Sair");
            opcao = sc.nextInt();
        }
        System.out.println("Programa encerrado");
    }
}
