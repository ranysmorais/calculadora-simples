package br.com.calculadora;

import java.util.Scanner;
import br.com.calculadora.formula.Calculos;

public class index {

	public static void main(String[] args) {

		Scanner lerDado = new Scanner(System.in);
		Calculos calc = new Calculos();
		Integer opt;
		Integer flag;
		do {
			flag = 0;
			System.out.println("-- Calculadora Simples --" +
			"\n escolha uma opção: \n"+
			" 1-Somar\n 2-Subtrair\n 3-Multiplicar\n 4-Dividir\n" +
			" opção: ");			
			opt = lerDado.nextInt();

			if (opt < 1 || opt > 4) {
				System.out.println("\n -- Opção Inválida --\n");
				flag = 1;
			}

		} while (flag != 0);

		System.out.println("-- Informe os Valores --");

		System.out.println("\n Valor1: ");
		Double v1 = lerDado.nextDouble();

		System.out.println("\n Valor1: ");
		Double v2 = lerDado.nextDouble();

		switch (opt) {
		case 1:
			calc.Soma(v1, v2);
			System.out.println("\n Resultado: " + calc.Resultado());
			System.out.println("-----\n");
			break;
		case 2:
			calc.Subtrai(v1, v2);
			System.out.println("\n Resultado: " + calc.Resultado());
			System.out.println("-----\n");
			break;
		case 3:
			calc.Multiplica(v1, v2);
			System.out.println("\n Resultado: " + calc.Resultado());
			System.out.println("-----\n");
			break;
		case 4:
			calc.Divide(v1, v2);
			System.out.println("\n Resultado: " + calc.Resultado());
			System.out.println("-----\n");
			break;
		}
	}

}
