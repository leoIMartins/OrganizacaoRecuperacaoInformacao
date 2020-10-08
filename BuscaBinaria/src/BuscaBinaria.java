
public class BuscaBinaria {
	int BuscaBinaria(int vet[], int esq, int dir, int k){
		if(dir >= esq) {
			int centro = (esq + dir) / 2;
			if(vet[centro] == k)
				return centro;
			if(vet[centro] > k)
				return BuscaBinaria(vet, esq, centro - 1, k);
			return BuscaBinaria(vet, centro + 1, dir, k);
		}
		return -1;
	}
}
