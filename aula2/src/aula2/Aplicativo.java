package aula2;
import java.util.Random;

public class Aplicativo {
	public static void main(String[] args) {
		int numero, maior = 0, menor = 0;
		int[] vet = new int[20];
        Random r = new Random();
        
        for(int i = 0; i < vet.length; i++){
            numero = r.nextInt(100) + 1;
            for(int j = 0; j < vet.length; j++){
                if(numero == vet[j] && j != i){
                	numero = r.nextInt(100) + 1;
                }else{
                    vet[i] = numero;
                }
            }
        }
        for(int i = 0; i < vet.length; i++) {
        	if(i == 0) {
        		menor = vet[i];
        		maior = vet[i];
        	}
        	if(vet[i] > maior) {
        		maior = vet[i];
        	}
        	if(vet[i] < menor) {
        		menor = vet[i];
        	}
        }
        System.out.print("Vetor: ");
        for(int i = 0; i < vet.length; i++) {
        	System.out.print(vet[i] + "  ");
        }
        System.out.println("\nMenor: " + menor);
        System.out.println("Maior: " + maior);
	}
}