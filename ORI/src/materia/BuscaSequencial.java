package materia;

public class BuscaSequencial {
	public void buscaSequencial(int[] vet, int target) {
		System.out.print("\n\nBusca sequencial");
		for(int i = 0; i < vet.length; i++){
        	if(vet[i] == target) {
        		System.out.print("\nValor " + target + " encontrado na posi��o " + i + " do vetor desordenado");
        		break;
        	}
        	if(i == vet.length-1) {
        		System.out.print("\nO valor " + target + " n�o foi encontrado em nenhuma posi��o do vetor!");
        	}
        }
	}
}
