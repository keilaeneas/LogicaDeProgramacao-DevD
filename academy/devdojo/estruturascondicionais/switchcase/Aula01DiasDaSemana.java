package academy.devdojo.estruturascondicionais.switchcase;

public class Aula01DiasDaSemana {
    public static void main(String[] args) {
        int dia = 1;
        switch (dia) {
            case 1:
                System.out.println("segunda");
                break;
            case 2:
                System.out.println("terça");
                break;
            case 3:
                System.out.println("quarta");
            case 4:
                System.out.println("quinta");
                break;
            case 5:
                System.out.println("sexta");
                break;
            case 6:
                System.out.println("sábado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("dia inválido");
                break;
        }
        System.out.println("fim do programa");
    }
}
