package trabs;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double prestacao, valor, taxa, tempo;

		System.out.println("QUAL O VALOR DA PRESTAÇÃO: ");
		valor = in.nextDouble();
		
		System.out.println("QUAL O VALOR DA TAXA DE JUROS)");
		taxa = in.nextDouble();
		
		System.out.println("Qual o tempo de atraso");
		tempo = in.nextDouble();
		
		prestacao = valor +(valor * (taxa/100)*tempo );
		System.out.println("O valor da prestação com juros é: R$" + prestacao);
	}

}
