package exe1;


import java.util.Scanner;

public class Combinação {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Digite o valor de n: ");
		int n = entrada.nextInt();
		System.out.printf("Digite o valor de p: ");
		int p = entrada.nextInt();
		
	
		                   
		                                  
		int comb = fat(n)/ fat(p) * fat(n-p);
		
		System.out.println(comb);
		
	}
	
	static int fat(int num) {                    
		int x = 1;
		while(num > 0) {
			x = x * num;
			num--;
		}
		return x;
	}

}
