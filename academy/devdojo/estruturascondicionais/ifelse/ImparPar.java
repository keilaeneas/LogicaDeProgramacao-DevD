package academy.devdojo.estruturascondicionais.ifelse;

/*
Dado um determinado número inteiro
imprima se ele é impar ou par
*/

public class ImparPar {
    public static void main(String[] args) {
        int numero = 129;
        
        if((numero % 2) == 0)       {
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
    }
}