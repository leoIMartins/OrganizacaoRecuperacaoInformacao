package materia;

public class BuscaBinaria {
	public int buscaBinaria(int vet[], int esq, int dir, int k){
		if(dir >= esq) {
			int centro = (esq + dir) / 2;
			if(vet[centro] == k)
				return centro;
			if(vet[centro] > k)
				return buscaBinaria(vet, esq, centro - 1, k);
			return buscaBinaria(vet, centro + 1, dir, k);
		}
		return -1;
	}
}
