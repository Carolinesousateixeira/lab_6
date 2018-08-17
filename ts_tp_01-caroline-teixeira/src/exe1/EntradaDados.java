package exe1;

import java.util.Scanner;

public class EntradaDados {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Digite o valor de n: ");
		int n = entrada.nextInt();
		System.out.printf("Digite o valor de p: ");
		int p = entrada.nextInt();
		
	CalcularComb c = new CalcularComb();
	System.out.print(c.Comb(n, p));
	
			
	
}
}
