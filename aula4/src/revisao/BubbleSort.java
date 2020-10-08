package revisao;

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		// Definição das variáveis
		long tempoInicial, tempoFinal;
		int numero, aux;
		boolean troca = true;
		int[] vet = new int[5000];

		Random r = new Random();
		
		// Preenchendo o vetor com números aleatórios
		for(int i = 0;i < vet.length;i ++){
			numero = r.nextInt(100000) + 1;
			for(int j = 0; j < vet.length; j++){
				if(numero == vet[j] && j != i){
					numero = r.nextInt(100000) + 1;
				}else{
					vet[i] = numero;
				}
			}
		}
		
		tempoInicial = System.currentTimeMillis();
		// Ordenando vet com BubbleSort
		while(troca) {
			troca = false;
			for(int i = 0;i < vet.length - 1;i ++) {
				if(vet[i] > vet[i+1]) {
					aux = vet[i];
					vet[i] = vet[i+1];
					vet[i+1] = aux;
					troca = true;
				}
			}
		}
		
		tempoFinal = System.currentTimeMillis();
		
		System.out.println("Tempo inicial: " + tempoInicial);
        System.out.println("Tempo final: " + tempoFinal);
        System.out.println("Tempo total de execução: " + (tempoFinal - tempoInicial));
	}
}