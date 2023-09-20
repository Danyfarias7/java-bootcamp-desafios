package desafio3;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class ObjetoVolador implements Volador{

	private static final double VELOCIDAD_MAX_PISTA1 = 200;
	private double velocidadMaximaVuelo;




	
	public ObjetoVolador(double velocidadMaximaVuelo) {
		super();
		this.velocidadMaximaVuelo = velocidadMaximaVuelo;
	}


	public double getVelocidadMaximaVuelo() {
		return velocidadMaximaVuelo;
	}


	@Override
	public int esAterrizable() {
		int pista = 0;
		if(this.velocidadMaximaVuelo >= VELOCIDAD_MAX_PISTA1) {
			pista = 1;
		}else {
			pista = 2;
		}
		
		return pista;
	}
	
}