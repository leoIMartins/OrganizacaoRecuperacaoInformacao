package aleatorios;
import java.util.Random;

public class Aleatorios {
    public static void main(String[] args) {
    	long tempoInicial = System.currentTimeMillis();
    	System.out.println("Tempo inicial: " + tempoInicial);
    	int numero, aux, trocas = 0;
        int[] num = new int[20];
        boolean troca = true;
        Random r = new Random();
        
        for(int i = 0; i < num.length; i++){
            numero = r.nextInt(1000) + 1;
            for(int j = 0; j < num.length; j++){
                if(numero == num[j] && j != i){
                	numero = r.nextInt(100) + 1;
                }else{
                    num[i] = numero;
                }
            }
        }
        long tempoFinal = System.currentTimeMillis();
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
        System.out.println("Tempo final: " + tempoFinal);
        System.out.println("Tempo total de execução: " + (tempoFinal - tempoInicial));
        
        while(troca) {
        	troca = false;
        	for(int i = 0;i < num.length - 1;i ++) {
        		if(num[i] > num[i+1]) {
        			aux = num[i];
        			num[i] = num[i+1];
        			num[i+1] = aux;
        			troca = true;
        			trocas ++;
        		}
        	}
        }
        System.out.println("Vetor ordenado: ");
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
        System.out.println("Número de trocas na ordenação: " + trocas);
    }
}