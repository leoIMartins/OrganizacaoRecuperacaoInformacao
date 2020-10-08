import java.util.Random;

public class Comparacao {

	public static void main(String[] args) {
		
		// Defini��o das vari�veis
		final int target = 23067;
		long tInicialLinear, tFinalLinear, tInicialBinaria, tFinalBinaria;
		int numero, aux, res;
		boolean troca = true;
		int[] vetL = new int[100000];
		int[] vetB = new int[100000];
		BuscaBinaria buscaBinaria = new BuscaBinaria();

		Random r = new Random();

		// Preenchendo o vetor vetL com n�meros aleat�rios
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
        		System.out.println("Valor " + target + " encontrado na posi��o " + i + " do vetor!");
        		break;
        	}
        	if(i == vetL.length - 1) {
        		System.out.println("O valor " + target + " n�o foi encontrado em nenhuma posi��o do vetor!");
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
		
		// Relat�rio final
		System.out.println("Tempo total com a busca linear: " + (tFinalLinear - tInicialLinear));
		System.out.println("Tempo total com a ordena��o e busca bin�ria: " + (tFinalBinaria - tInicialBinaria));
		if(res != -1)
			System.out.println("Target encontrado na posi��o " + res + " do vetor ordenado");
		else
			System.out.println("Target n�o encontrado no vetor ordenado");
	}

}
