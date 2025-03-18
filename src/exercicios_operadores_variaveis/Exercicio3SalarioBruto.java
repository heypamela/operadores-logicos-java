package exercicios_operadores_variaveis;

import java.util.Scanner;

public class Exercicio3SalarioBruto {
    public static void main(String[] args) {
        Scanner lerValor = new Scanner(System.in);
        float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

        System.out.println("Digite o salário bruto: ");
        salarioBruto = lerValor.nextFloat();

        lerValor.skip("\\R?");
        System.out.println("Digite o adicional noturno: ");
        adicionalNoturno = lerValor.nextFloat();

        lerValor.skip("\\R?");
        System.out.println("Digite as horas extras: ");
        horasExtras = lerValor.nextFloat();

        lerValor.skip("\\R?");
        System.out.println("Digite os descontos: ");
        descontos = lerValor.nextFloat();

        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        System.out.printf("Salário Líquido: %.2f", salarioLiquido);
    }
}
