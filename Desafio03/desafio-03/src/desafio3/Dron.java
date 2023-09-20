package desafio3;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Dron extends ObjetoVolador {

	private static final double VELOCIDAD_MAXIMA_SIN_PISTA = 200;
	private double bateria;
	
	
	

	public Dron(double velocidadMaximaVuelo, double bateria) {
		super(velocidadMaximaVuelo);
		this.bateria = bateria;
	}



	@Override
	public int esAterrizable() {
		int pista = 0;
		
		if(super.esAterrizable() == 2) {
			pista = 0; // Drones con velocidad menor a 200 no tienen pista 
		
		}else if(super.esAterrizable() == 1) {
			pista = 1;
		}
		
		return pista;
	}

	

}