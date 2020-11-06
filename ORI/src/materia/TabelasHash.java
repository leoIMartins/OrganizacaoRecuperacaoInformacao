package materia;

public class TabelasHash {

	public static void main(String[] args) {
		int resto, target;
		final int ordem = 11;
		int[][] matriz = new int[ordem][ordem];
		int numeros[] = {225, 216, 918, 589, 899, 503, 552, 567, 591, 444, 343, 628, 240, 77, 421, 637, 380};
		
		for (int i = 0; i < numeros.length; i ++) {
			resto = numeros[i] % ordem;
			for (int j = 0; j < ordem; j ++) {
				if (matriz[resto][j] == 0) {
					matriz[resto][j] = numeros[i];
					break;
				}
			}
		}
		
		for (int i = 0; i < ordem; i ++) {
			System.out.println();
			for (int j = 0; j < ordem; j ++) {
				System.out.print(matriz[i][j] + "\t");
			}
		}
		
		target = 380;
		resto = target % ordem;
		for (int j = 0; j < ordem; j ++) {
			if (matriz[resto][j] == target) {
				System.out.print("\n\nO número " + target + " foi encontrado na linha " + (resto+1) + ", coluna " + (j+1));
				break;
			}
			if (j == (ordem-1)) {
				System.out.print("\n\nO número " + target + " não foi encontrado na matriz!");
			}
		}
	}
}
