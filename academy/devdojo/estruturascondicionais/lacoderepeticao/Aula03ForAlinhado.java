package academy.devdojo.estruturascondicionais.lacoderepeticao;

public class Aula03ForAlinhado {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Fazendo tabuada do número "+ i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " +(i*j));
            }
        }
    }
}
