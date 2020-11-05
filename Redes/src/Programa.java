import javax.swing.JOptionPane;

public class Programa {
	public static void main(String[] args) {
		final int quantidadeVertices = 6;
		int[][] matriz = new int[6][6];

		for (int i = 0; i < quantidadeVertices; i++) {
			for (int j = 0; j < quantidadeVertices; j++) {
				if (i == j) {
					matriz[i][j] = 0;
				} else {
					matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("O v�rtice " + (i+1) + " possui liga��o com o v�rtice " + (j+1) + "?\n1 - Sim\n0 - N�o"));
				}
			}
		}
		System.out.println("Matriz de adjac�ncia:");
		for (int i = 0; i < quantidadeVertices; i++) {
			System.out.println();
			for (int j = 0; j < quantidadeVertices; j++) {
				System.out.print(matriz[i][j] + ", ");
			}
		}
	}
}
