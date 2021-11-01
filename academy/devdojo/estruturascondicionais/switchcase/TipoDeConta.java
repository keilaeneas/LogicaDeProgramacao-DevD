package academy.devdojo.estruturascondicionais.switchcase;
/*
Como gerente eu gostaria que meus usuários pudessem digitar o tipo da conta e o sistema imprima qual a
porcentagem de juros que aquela conta irá oferecer. Com o intuito de agilizar o acesso as informações 
Os tipos das contas são:
CONTA_POUPANÇA 0.05%
CONTA_CORRENTE 0.02%
CONTA_INVESTIMENTO 0.01%
*/
public class TipoDeConta {
    public static void main(String[] args) {
        String conta = "Conta Poupança";

        switch (conta) {
            case "Conta Poupança":
                System.out.println("");
                break;
        
            default:
                break;
        }
    }
}
