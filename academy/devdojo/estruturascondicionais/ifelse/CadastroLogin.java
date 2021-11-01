package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

/**
 * CadastroLogin
 */
public class CadastroLogin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        if(nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")){
            System.out.println("Usuário inválido!");
        }else{
            System.out.println(nome + " cadastrado com sucesso");
        }
    }
}