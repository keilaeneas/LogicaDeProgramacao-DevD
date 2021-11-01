package academy.devdojo.estruturascondicionais.lacoderepeticao;

import java.util.Scanner;

public class ExercicioLogin {
    public static void main(String[] args) {
        final String login = "Luffy";
        final String password = "ReiDosPiratas";
        Scanner sc = new Scanner(System.in);
        boolean exibirTelaLogin = true;

        while (exibirTelaLogin) {
            System.out.println("Digite seu login ");
            String loginDigitado = sc.nextLine();
            System.out.println("Digite sua senha ");
            String passwordDigitado = sc.nextLine();
            if (login.equals(loginDigitado) && password.equals(passwordDigitado)) {
                System.out.println("ACESSO CONCEDIDO");
                exibirTelaLogin = false;
            } else {
                System.out.println("ACESSO NEGADO");
            }

        }
    }
}
