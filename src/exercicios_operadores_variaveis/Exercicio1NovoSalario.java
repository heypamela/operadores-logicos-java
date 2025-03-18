package exercicios_operadores_variaveis;

import java.util.Scanner;

public class Exercicio1NovoSalario {
    public static void main(String[] args) {
        Scanner lerValor = new Scanner(System.in);
        float salario, abono, novoSalario;

        System.out.println("Digite o Salário: ");
        salario = lerValor.nextFloat();

        lerValor.skip("\\R?");
        System.out.println("Digite o Abono: ");
        abono = lerValor.nextFloat();

        novoSalario = (salario + abono);

        System.out.printf("Novo Salário: %.2f", novoSalario);
    }
}
