package revisao;

import java.util.Random;

public class BuscaSequencial {

	public static void main(String[] args) {
		// Definição das variáveis
		long tempoInicial, tempoFinal;
		int numero, aux;
		int[] vet = new int[500];
		final int target = 1001000;
        
		Random r = new Random();
        
		// Preenchendo o vetor com números aleatórios
        for(int i = 0; i < vet.length; i++){
            numero = r.nextInt(100000) + 1;
            for(int j = 0; j < vet.length; j++){
                if(numero == vet[j] && j != i){
                	numero = r.nextInt(100000) + 1;
                }else{
                    vet[i] = numero;
                }
            }
        }

        // Ordenando vet com SelectionSort
        /*for(int i = 0;i < vet.length - 1;i ++) {
			int menor = i;
			for(int j = i+1;j < vet.length;j ++) {
				if(vet[j] < vet[menor]) {
					menor = j;
				}
			}
			aux = vet[menor]; 
			vet[menor] = vet[i];
			vet[i] = aux;
		}*/
        
        tempoInicial = System.currentTimeMillis();

        // Efetuando a busca sequencial
        for(int i = 0; i < vet.length; i++){
        	if(vet[i] == target) {
        		System.out.println("Valor " + target + " encontrado na posição " + i + " do vetor!");
        		break;
        	}
        	if(i == 499) {
        		System.out.println("O valor " + target + " não foi encontrado em nenhuma posição do vetor!");
        	}
        }
        
        tempoFinal = System.currentTimeMillis();
        
        System.out.println("Tempo inicial: " + tempoInicial);
        System.out.println("Tempo final: " + tempoFinal);
        System.out.println("Tempo total de execução: " + (tempoFinal - tempoInicial));
	}
}
