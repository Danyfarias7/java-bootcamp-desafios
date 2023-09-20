package desafio3;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

	public static void main(String[] args) {
		
		
		SistemaControlVuelo torreControl = new SistemaControlVuelo(new Pista(), new Pista());
		//Pruebas 
		torreControl.agregarObjetoVolador(new AvionComercial(300, "Marca1", 1998, 180, 120, 20));  // Pista 1 
		torreControl.agregarObjetoVolador(new AvionComercial(189, "Marca1", 1998, 180, 120, 20));  // Pista 2 
		torreControl.agregarObjetoVolador(new AvionCarga(180, "Marca2", 2010, 25, 5, 10, 1500, 1000));// Pista 2
		torreControl.agregarObjetoVolador(new Helicoptero(230, "HeliMarca")); // Pista 1
		torreControl.agregarObjetoVolador(new Helicoptero(200, "HeliMarca")); // Pista 1
		torreControl.agregarObjetoVolador(new Helicoptero(170, "HeliMarca"));// Pista 2
		torreControl.agregarObjetoVolador(new Dron(203, 40)); // Pista 1 
		torreControl.agregarObjetoVolador(new Dron(100, 40)); // Pista 0 - Sin pista 
		torreControl.agregarObjetoVolador(new Dron(75, 40)); // Pista 0 - Sin pista 
		
		
		// 4 pista 1 
		// 3 pista 2
		// 2 pista 0 - sin pista 
		
		torreControl.aterrizar();
	}

}