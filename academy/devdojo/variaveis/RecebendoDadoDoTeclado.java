package academy.devdojo.variaveis;

import java.util.Scanner;

public class RecebendoDadoDoTeclado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("o nome digitado foi "+ nome + " e a idade é "+ idade);
        
    }
}