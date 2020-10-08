package materia;

import java.util.Random;

public class VetorAleatorio {
	
	public int [] gerarVetorAleatorio(int tamanho, int maiorNumero) {
		int numero;
		int[] vet = new int[tamanho];
		Random r = new Random();
        
        for(int i = 0; i < vet.length; i++){
            numero = r.nextInt(maiorNumero) + 1;
            for(int j = 0; j < vet.length; j++){
                if(numero == vet[j] && j != i){
                	numero = r.nextInt(maiorNumero) + 1;
                }else{
                    vet[i] = numero;
                }
            }
        }
        System.out.println("Vetor aleatório gerado!");
        return vet;
	}
}
