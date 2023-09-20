package desafio3;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class AvionCarga extends AvionComercial  {

	private int capacidadCarga;
	private int cargaActual;
	
	
	public AvionCarga(double velocidadMaximaVuelo, String marca, int anoModelo, int capacidad, int pasajeros,
			int tripulacion, int capacidadCarga, int cargaActual) {
		super(velocidadMaximaVuelo, marca, anoModelo, capacidad, pasajeros, tripulacion);
		this.capacidadCarga = capacidadCarga;
		this.cargaActual = cargaActual;
	}
	
	

}