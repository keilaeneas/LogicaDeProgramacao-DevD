package academy.devdojo.estruturascondicionais.ifelse;

/*
Dado um determinado salário 
se o salário for maior que 4500 imprima 30% do valor
senão imprima 15% do valor
*/
public class CalcularImpostoCondicional {
    public static void main(String[] args) {
        float salario = 4700f;
        float resultado = 0f;
        if(salario > 4500){
            resultado = salario * 0.3f;
            System.out.println("30% = " + resultado);
        }else{
            resultado = salario * 0.1f;
            System.out.println("10% = " + resultado);
        }
    }
}