package br.com.zup.estrelas.principal;

public class Principal {

	public static void main(String[] args) {
		
		
		int [] algoritmo = {2, 5, 1, 95, 54, 33, 71, 115, 7, 9, 4 };
		int auxiliar = 0;

		for (int i = 0; i < algoritmo.length; i++) {
			for (int j = 0;  j < algoritmo.length; j++) {
				
				if (algoritmo[i] < algoritmo[j]) {
					auxiliar = algoritmo[i];    
	                algoritmo[i] = algoritmo[j];    
	                 algoritmo[j] = auxiliar;    
				}
			}
		}
		
		
		for (int alg : algoritmo) {
			
			System.out.println(alg);
		}
	}
}
