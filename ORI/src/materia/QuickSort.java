package materia;

public class QuickSort {

	private static long trocas = 0;
	
	public static void quickSort(int[] vetor, int inicio, int fim) {
		
		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivo - 1);
			quickSort(vetor, posicaoPivo + 1, fim);
		}
	}

	private static int separar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio + 1, f = fim;
		while (i <= f) {
			if (vetor[i] <= pivo)
				i++;
			else if (pivo < vetor[f])
				f--;
			else {
				int troca = vetor[i];
				vetor[i] = vetor[f];
				vetor[f] = troca;
				i++;
				f--;
				trocas ++;
				exibirVetorTemporario(vetor);
			}
		}
		vetor[inicio] = vetor[f];
		vetor[f] = pivo;
		return f;
	}
	
	private static void exibirVetorTemporario(int[] vetor) {
		for(int i = 0; i < vetor.length; i++){
			System.out.print(vetor[i]);
			if(i < vetor.length - 1)
				System.out.print(", ");
			else
				System.out.println();
		}
	}
	
	public static void exibirVetorOrdenado(int[] vetor) {
		for(int i = 0; i < vetor.length; i++){
			System.out.print(vetor[i]);
			if(i < vetor.length - 1)
				System.out.print(", ");
			else
				System.out.print("\nTrocas: " + trocas);
		}
	}
}
