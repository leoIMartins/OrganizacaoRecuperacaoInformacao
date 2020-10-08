package aula2;

import java.util.Random;

public class Comparacao {

	public static void main(String[] args) {
		// Definição das variáveis
		int numero, auxB, auxS;
		long trocasB = 0, trocasS = 0;
		boolean troca = true;
		int[] vetB = new int[1000];
		int[] vetS = new int[1000];

		Random r = new Random();

		// Preenchendo o vetor vetB com números aleatórios
		for(int i = 0;i < vetB.length;i ++){
			numero = r.nextInt(9000) + 1;
			for(int j = 0; j < vetB.length; j++){
				if(numero == vetB[j] && j != i){
					numero = r.nextInt(9000) + 1;
				}else{
					vetB[i] = numero;
				}
			}
		}
		// Copiando os valores de vetB para vetS
		for(int i = 0; i < vetS.length; i++) {
        	vetS[i] = vetB[i];
		}
		
		// Ordenando vetB com BubbleSort
		while(troca) {
			troca = false;
			for(int i = 0;i < vetB.length - 1;i ++) {
				if(vetB[i] > vetB[i+1]) {
					auxB = vetB[i];
					vetB[i] = vetB[i+1];
					vetB[i+1] = auxB;
					troca = true;
					trocasB ++;
				}
			}
		}
		
		// Ordenando vetS com SelectionSort
		for(int i = 0;i < vetS.length - 1;i ++) {
			int menor = i;
			for(int j = i+1;j < vetS.length;j ++) {
				if(vetS[j] < vetS[menor]) {
					menor = j;
					trocasS ++;
				}
			}
			auxS = vetS[menor]; 
			vetS[menor] = vetS[i];
			vetS[i] = auxS;
		}

		// Relatório final
		System.out.println("Número de trocas com o BubbleSort: " + trocasB);
		System.out.println("Número de trocas com o SelectionSort: " + trocasS);
	}
}