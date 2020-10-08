import java.util.Random;

public class Comparacao {

	public static void main(String[] args) {
		
		// Definição das variáveis
		final int target = 23067;
		long tInicialLinear, tFinalLinear, tInicialBinaria, tFinalBinaria;
		int numero, aux, res;
		boolean troca = true;
		int[] vetL = new int[100000];
		int[] vetB = new int[100000];
		BuscaBinaria buscaBinaria = new BuscaBinaria();

		Random r = new Random();

		// Preenchendo o vetor vetL com números aleatórios
		for(int i = 0;i < vetL.length;i ++){
			numero = r.nextInt(1000000) + 1;
			//for(int j = 0; j < vetL.length; j++){
			//	if(numero == vetL[j] && j != i){
			//		numero = r.nextInt(1000000) + 1;
			//	}else{
					vetL[i] = numero;
			//	}
			//}
		}
		
		// Copiando os valores de vetL para vetB
		for(int i = 0; i < vetB.length; i++) {
        	vetB[i] = vetL[i];
		}
		
		// Efetuando a busca linear em vetL
		tInicialLinear = System.currentTimeMillis();
        for(int i = 0; i < vetL.length; i++){
        	if(vetL[i] == target) {
        		System.out.println("Valor " + target + " encontrado na posição " + i + " do vetor!");
        		break;
        	}
        	if(i == vetL.length - 1) {
        		System.out.println("O valor " + target + " não foi encontrado em nenhuma posição do vetor!");
        	}
        }
		tFinalLinear = System.currentTimeMillis();
		
		tInicialBinaria = System.currentTimeMillis();
		// Ordenando vetB com SelectionSort
		for(int i = 0;i < vetB.length - 1;i ++) {
			int menor = i;
			for(int j = i+1;j < vetB.length;j ++) {
				if(vetB[j] < vetB[menor]) {
					menor = j;
				}
			}
			aux = vetB[menor]; 
			vetB[menor] = vetB[i];
			vetB[i] = aux;
		}
		
		/*while(troca) {
			troca = false;
			for(int i = 0;i < vetB.length - 1;i ++) {
				if(vetB[i] > vetB[i+1]) {
					aux = vetB[i];
					vetB[i] = vetB[i+1];
					vetB[i+1] = aux;
					troca = true;
				}
			}
		}*/
		
		res = buscaBinaria.BuscaBinaria(vetB, 0, vetB.length, target);
		
		tFinalBinaria = System.currentTimeMillis();
		
		// Relatório final
		System.out.println("Tempo total com a busca linear: " + (tFinalLinear - tInicialLinear));
		System.out.println("Tempo total com a ordenação e busca binária: " + (tFinalBinaria - tInicialBinaria));
		if(res != -1)
			System.out.println("Target encontrado na posição " + res + " do vetor ordenado");
		else
			System.out.println("Target não encontrado no vetor ordenado");
	}

}
