package materia;

public class InsertionSort {
	public void ordenar(int vet[]) {
		long trocas = 0;
		
		for(int i = 1;i < vet.length;i ++) {
			int key = vet[i];
			int j = i - 1;
			while(j >= 0 && vet[j] > key){
				vet[j+1] = vet[j];
				j--;
			}
			vet[j+1] = key;
			trocas++;
		}
		System.out.println("\n\nOrdenação do vetor com InsertionSort");
		for(int i = 0; i < vet.length; i++){
			System.out.print(vet[i]);
			if(i < vet.length - 1)
				System.out.print(", ");
			else
				System.out.print("\nTrocas: " + trocas);
		}
	}
}
