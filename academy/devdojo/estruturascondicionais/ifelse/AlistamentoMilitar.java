package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

/*
Como secretário de alistamento militar eu gostaria que meu sistema aceitasse os seguintes parâmetros para 
que eu possa agilizar o meu processo de cadastramento:
sexo, sendo válido apenas M ou F e idade.
Se o sexo for masculino e a idade for maior ou igual a 18 o sistema deve imprimir alistamento obrigatório
Se o sexo for masculino e a idade for menor que 8 o sistema deve imprimir, alistamento não permitido
Se o sexo for feminino e a idade for igual a 18 o sistema deve perguntar se a pessoa deseja se alistar
Se o sexo for feminino e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido,
*/
public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu sexo: ");
        String sexo = sc.next();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if ((sexo.equals("F") || sexo.equals("M")) && (idade < 18)) {
            System.out.println("Alistamento não permitido");
        }else if (sexo.equals("M") && idade >= 18) {
            System.out.println("Alistamento obrigatório");
        }else if (sexo.equals("F") && idade > 18) {
            System.out.println("Deseja se alistar?");
        }
    }
}
