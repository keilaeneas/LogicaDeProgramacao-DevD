package academy.devdojo.estruturascondicionais.ifelse;

/*
Eu como usuário gostaria de ter o nome e a idade de participantes de um torneio de natação e que o sistema imprimisse da seguinte forma
Menor que 10 anos: <Nome> participará da categoria infantil
Entre 11 e 15 anos: <Nome> participará da categoria juvenil
Entre 16 e 19 anos: <Nome> participará da categoria Pré-adulto
Acima de 20 anos: <Nome> participará da categoria adulto
Para que eu possa rapidamente classificar todos os participantes
*/

public class TorneioNatacao {
    public static void main(String[] args) {
        String nome = "Luffy";
        int idade = 19;
        if(idade <= 10){
            System.out.println(nome + " participará da categoria infantil");
        }else if(idade >= 11 && idade <= 15){
            System.out.println(nome + " participará da categoria juvenil");
        }else if(idade >= 16 && idade <= 19){
            System.out.println(nome + " participará da categoria pré-adulto");
        }else{
            System.out.println(nome + " participará da categoria adulto");
        }
    }
}