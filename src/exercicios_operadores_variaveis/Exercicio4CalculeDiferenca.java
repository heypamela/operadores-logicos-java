package exercicios_operadores_variaveis;

import java.util.Scanner;

public class Exercicio4CalculeDiferenca {
    public static void main(String[] args) {
        Scanner lerValor = new Scanner(System.in);

        float numero1, numero2, numero3, numero4, diferenca;

        System.out.println("Digite numero 1: ");
        numero1 = lerValor.nextFloat();

        lerValor.skip("\\R?");
        System.out.println("Digite numero 2: ");
        numero2 = lerValor.nextFloat();

        lerValor.skip("\\R?");
        System.out.println("Digite numero 3: ");
        numero3 = lerValor.nextFloat();

        lerValor.skip("\\R?");
        System.out.println("Digite numero 4: ");
        numero4 = lerValor.nextFloat();
        
        diferenca = (numero1 * numero2) - (numero3 * numero4) ;

        System.out.printf("Diferença: %.1f", diferenca);
    }
}
