package exe2;

public class Cardinalidade {
	int cardinalidadeEntrada = 0;
	int cardinalidadeSaida=0;
	int ncar=0;
	int k=0;
 //contando cardinalidade de entrada
	public int cardEntrada(int[] elementos) {
		while(ncar<elementos.length) {
			cardinalidadeEntrada++;
			ncar++;
    }
    	return cardinalidadeEntrada;
    }
   
    
    //contando a cardinalidade de saida
	public int cardinalidadeSaida(int [] soma) {
    while(k<soma.length) {
    	cardinalidadeSaida++;
    	k++;
    	}
    return cardinalidadeSaida;
    }
   
}

