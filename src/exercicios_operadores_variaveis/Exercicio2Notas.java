package exercicios_operadores_variaveis;

import java.util.Scanner;

public class Exercicio2Notas {
    public static void main(String[] args) {
        Scanner lerValor = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, mediaFinal;

        System.out.println("Digite nota 1: ");
        nota1 = lerValor.nextFloat();

        lerValor.skip("\\R?");
        System.out.println("Digite nota 2: ");
        nota2 = lerValor.nextFloat();

        lerValor.skip("\\R?");
        System.out.println("Digite nota 3: ");
        nota3 = lerValor.nextFloat();

        lerValor.skip("\\R?");
        System.out.println("Digite nota 4: ");
        nota4 = lerValor.nextFloat();
        
        mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Média final: %.1f", mediaFinal);
    }
}
