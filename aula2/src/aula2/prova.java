package aula2;

public class prova {
	public static void main(String[] args) {

		int auxiliarBubble, auxiliarSelection;
		long trocasBubble = 0, trocasSelection = 0;
		boolean troca = true;
		int vetorBubble[] = {85, 70, 17, 43, 13, 21, 97, 69, 82, 64, 56, 20, 6, 89, 55, 74, 36, 84, 47, 27, 58, 61, 68, 57, 25, 26, 1, 76, 75, 51, 91, 14, 18, 71, 73, 83, 92, 52, 95, 98, 10, 65, 41, 4, 38, 7, 35, 87, 94, 48, 40, 12, 88, 19, 44, 32, 23, 29, 42, 63, 54, 60, 22, 30};
		int[] vetorSelection = new int[64];
		
		for(int i = 0; i < vetorSelection.length; i++) {
	    	vetorSelection[i] = vetorBubble[i];
		}

		while(troca) {
			troca = false;
			for(int i = 0;i < vetorBubble.length - 1;i ++) {
				if(vetorBubble[i] > vetorBubble[i+1]) {
					auxiliarBubble = vetorBubble[i];
					vetorBubble[i] = vetorBubble[i+1];
					vetorBubble[i+1] = auxiliarBubble;
					troca = true;
					trocasBubble ++;
				}
			}
		}

		for(int i = 0;i < vetorSelection.length - 1;i ++) {
			int menor = i;
			for(int j = i+1;j < vetorSelection.length;j ++) {
				if(vetorSelection[j] < vetorSelection[menor]) {
					menor = j;
					trocasSelection ++;
				}
			}
			auxiliarSelection = vetorSelection[menor];
			vetorSelection[menor] = vetorSelection[i];
			vetorSelection[i] = auxiliarSelection;
		}
		System.out.print("Trocas com o BubbleSort: " + trocasBubble);
		System.out.print("\nTrocas com o SelectionSort: " + trocasSelection);
	}
}
