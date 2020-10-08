package aula3;

import java.util.Random;

public class Programa {

	public static void main(String[] args) {
		int numero, comparacoes = 0, voltas = 0;
		int[] vet = new int[100];
		final int target = 622;
        Random r = new Random();
        do
        {
        	comparacoes = 0;
        	voltas ++;
        	System.out.println("\n---------------------------- VOLTA " + voltas + " ----------------------------\n");
	        for(int i = 0; i < vet.length; i++){
	            numero = r.nextInt(1001);
	            for(int j = 0; j < vet.length; j++){
	                if(numero == vet[j] && j != i){
	                	numero = r.nextInt(1001);
	                }else{
	                    vet[i] = numero;
	                }
	            }
	        }
	        for(int i = 0; i < vet.length; i++){
	        	comparacoes ++;
	        	if(vet[i] == target) {
	        		System.out.println("Valor " + target + " encontrado na posição " + i + " do vetor!");
	        		break;
	        	}
	        	if(i == 99) {
	        		System.out.println("O valor " + target + " não foi encontrado em nenhuma posição do vetor!");
	        	}
	        }
	        System.out.println("Total de comparações: " + comparacoes);
        }while(voltas < 10);
	}
}
