package materia;

public class BubbleSort {

	public void ordenar(int[] vet) {
		boolean troca = true;
		int aux;
		long trocas = 0;
		
		while(troca) {
			troca = false;
			for(int i = 0;i < vet.length - 1;i ++) {
				if(vet[i] > vet[i+1]) {
					aux = vet[i];
					vet[i] = vet[i+1];
					vet[i+1] = aux;
					troca = true;
					trocas ++;
				}
			}
		}
		System.out.println("\n\nOrdena��o do vetor com BubbleSort");
		for(int i = 0; i < vet.length; i++){
			System.out.print(vet[i]);
			if(i < vet.length - 1)
				System.out.print(", ");
			else
				System.out.print("\nTrocas: " + trocas);
		}
	}
}