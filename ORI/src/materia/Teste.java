package materia;

public class Teste {

	public static void main(String[] args) {
		long tempoInicial = System.currentTimeMillis();
		int tamanho = 1000, maiorNumero = 100, target = 15;
		int[] vetA = new int[tamanho];
		int[] vetB = new int[tamanho];
		int[] vetC = new int[tamanho];
		int[] vetD = new int[tamanho];
		VetorAleatorio vetor = new VetorAleatorio();
		BubbleSort bubble = new BubbleSort();
		SelectionSort selection = new SelectionSort();
		BuscaSequencial buscaSequencial = new BuscaSequencial();
		BuscaBinaria buscaBinaria = new BuscaBinaria();
		InsertionSort insertionSort = new InsertionSort();
		
		vetA = vetor.gerarVetorAleatorio(tamanho, maiorNumero);
		
		for(int i = 0; i < vetA.length; i++) {
        	vetB[i] = vetA[i];
        	vetC[i] = vetA[i];
        	vetD[i] = vetA[i];
		}
		
		for(int i = 0; i < vetA.length; i++){
			System.out.print(vetA[i]);
			if(i < vetA.length - 1)
				System.out.print(", ");
		}
		
		bubble.ordenar(vetA);
		
		selection.ordenar(vetB);
		
		buscaSequencial.buscaSequencial(vetC, target);
		
		int buscaB = buscaBinaria.buscaBinaria(vetA, 0, vetA.length, target);
		System.out.println("\n\nBusca bin�ria");
		if(buscaB != -1)
			System.out.print("Target encontrado na posi��o " + buscaB + " do vetor ordenado");
		else
			System.out.print("Target n�o encontrado no vetor ordenado");
		
		insertionSort.ordenar(vetD);
		long tempoFinal = System.currentTimeMillis();
		
		System.out.println("\nTempo total: " + (tempoFinal - tempoInicial));
	}

}