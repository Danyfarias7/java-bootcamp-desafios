package desafio3;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Avion extends ObjetoVolador {

	private static final int CAPACIDAD_MINIMA_PISTA1 = 100;
	private String marca;
	private int anoModelo;
	private int capacidad;
	
	


	public Avion(double velocidadMaximaVuelo, String marca, int anoModelo, int capacidad) {
		super(velocidadMaximaVuelo);
		this.marca = marca;
		this.anoModelo = anoModelo;
		this.capacidad = capacidad;
	}









	@Override
	public int esAterrizable() {
		int pista = 0;
		if(super.esAterrizable() == 1 && this.capacidad > CAPACIDAD_MINIMA_PISTA1) {
			pista = 1;
		}else {
			pista = 2;
		}
		
		return pista;
	}

}