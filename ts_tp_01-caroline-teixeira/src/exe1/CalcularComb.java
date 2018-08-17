package exe1;

public class CalcularComb {

	public int Comb (int n, int p){
		CalcularFatorial stub = new CalcularFatorial ();
		return (stub.fat(n) / (stub.fat(p)*stub.fat(n-p)));
	}
	
	
}
