package materia;

public class BuscaSequencial {
	public void buscaSequencial(int[] vet, int target) {
		System.out.print("\n\nBusca sequencial");
		for(int i = 0; i < vet.length; i++){
        	if(vet[i] == target) {
        		System.out.print("\nValor " + target + " encontrado na posição " + i + " do vetor desordenado");
        		break;
        	}
        	if(i == vet.length-1) {
        		System.out.print("\nO valor " + target + " não foi encontrado em nenhuma posição do vetor!");
        	}
        }
	}
}
