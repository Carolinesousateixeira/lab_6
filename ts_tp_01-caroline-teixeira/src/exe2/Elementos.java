package exe2;

import java.util.Scanner;

public class Elementos {
	

	
	public static void main(String[] args){
        int[] elementos = new int[10];
        Scanner entrada = new Scanner(System.in);
        int [] soma=new int [1];
        Cardinalidade c= new Cardinalidade();
        
        

        for(int n=0 ; n < 10 ; n++){
            System.out.print("\nEntre com o elementos " + (n+1) + ": ");
            elementos[n] = entrada.nextInt();
        }
        
        for(int n=0 ; n < 10 ; n++) {
        	soma[0]=soma[0]+elementos[n];
       
        }
        System.out.print("\nA soma dos elementos é  " + (soma[0]) );
        
        System.out.print("\nA cardinalidade de entrada é  " + (c.cardEntrada(elementos)) );
        System.out.print("\nA cardinalidade de saida é  " + (c.cardinalidadeSaida(soma)) );
 }
}

