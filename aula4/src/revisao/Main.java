package revisao;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        int numero;
        int x = 0;
        int qtdTroca = 0;
        int posicao = 0;
        int[] num = new int[50000];
        Random r = new Random();
        
        Scanner mostrar = new Scanner(System.in);
        
        //long tempoInicial = System.currentTimeMillis();
        
        x = 622;

	        for(int i = 0; i < num.length; i++){
	        	
	            numero = r.nextInt(100) + 1;
	            
	            for(int j=0; j < num.length; j++){
	            	
	                if(numero == num[j] && j != i){
	                	
	                    numero = r.nextInt(100) + 1;
	                }else{
	                	
	                    num[i] = numero;
	                }
	            }
	            
	        }
	        System.out.print("Vetor : ");
	        for(int i = 0; i < num.length; i++){
	            System.out.print(num[i]+" ");
	        }
	        System.out.println(" ");

	        BubbleSort(num);
	        long tempoInicial = System.currentTimeMillis();
	        
	        //buscaSequencial(num, x);
	        
		     long tempoFinal = System.currentTimeMillis();

		     System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
        
    }
    
	public static void BubbleSort(int[] vetor) {
	    boolean troca = true;
	    int aux;
	    int qtdTroca = 0;
	    
	    while(troca) {
	    	troca = false;
	    	
	    	for(int i = 0; i < vetor.length - 1; i++) {
	    		if(vetor[i] > vetor[i + 1]) {
	    			aux = vetor[i];
	    			vetor[i] = vetor[i + 1];
	    			vetor[i + 1] = aux;
	    			troca = true;
	    			qtdTroca++;
	    		}
	    	}
	    }
	    System.out.println("Quantidade de troca: " + (qtdTroca));
	}
    
    public static void buscaSequencial(int[] vetor,int valor) {
    	boolean verificacao = false;
    	int posicao = 0;
    	int qtdVerificacao = 0;
    	
        for(int i = 0 ; i < vetor.length; i++) {
        	
        	qtdVerificacao++;
        	
        	if(vetor[i] == valor) {
        		
        		posicao = i;
        		verificacao = true;
        		break; 
        		
        	}

        }
        
        if(verificacao == false) {
        	System.out.println("Número não encontrado");
        }else {
        	System.out.println("Número " + (valor) +" encontrado na posição " + (posicao) );
        }
        System.out.println("Quantidade de verificação: "+ (qtdVerificacao));
        
    }

}
