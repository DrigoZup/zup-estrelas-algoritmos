package br.com.zup.estrelas.principal;

import java.util.Scanner;

public class Principal {

	public static void ordenaArray(int[] array) {

		int auxiliar = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {

				if (array[i] < array[j]) {
					auxiliar = array[i];
					array[i] = array[j];
					array[j] = auxiliar;
				}
			}
		}
	}

	public static int buscaNumeroArray(int[] array, int numeroProcurado) {
		for (int i = 0; i < array.length; i++) {

			if (array[i] == numeroProcurado) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] algoritmo = { 2, 5, 1, 95, 54, 33, 71, 115, 7, 9, 4 };

		ordenaArray(algoritmo);

		for (int alg : algoritmo) {
			System.out.print(alg + " ");
		}

		System.out.println("\n\nDigite um número a ser buscado na lista: ");
		int numeroBuscado = scanner.nextInt();
		
		int resultadoBusca = buscaNumeroArray(algoritmo, numeroBuscado);
		
		if (resultadoBusca == -1) {
			System.out.println("Número não encontrado");
		} else {
			System.out.println("A posição do número "+numeroBuscado+"\n"
					+ "é a posição"+resultadoBusca);
		}
		
		scanner.close();
	}
}
