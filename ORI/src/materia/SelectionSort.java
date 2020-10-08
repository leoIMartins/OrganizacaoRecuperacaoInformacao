package materia;

public class SelectionSort {

	public void ordenar(int vet[]) {
		int aux;
		long trocas = 0;
		
		for(int i = 0;i < vet.length - 1;i ++) {
			int menor = i;
			for(int j = i+1;j < vet.length;j ++) {
				if(vet[j] < vet[menor]) {
					menor = j;
					trocas ++;
				}
			}
			aux = vet[menor]; 
			vet[menor] = vet[i];
			vet[i] = aux;
		}
		System.out.println("\n\nOrdenação do vetor com SelectionSort");
		for(int i = 0; i < vet.length; i++){
			System.out.print(vet[i]);
			if(i < vet.length - 1)
				System.out.print(", ");
			else
				System.out.print("\nTrocas: " + trocas);
		}
	}
}
