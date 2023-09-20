package desafio3;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class SistemaControlVuelo {

	private ArrayList<ObjetoVolador> listaVoladoresEnSistema;
	private Pista pista1, pista2;
	
	

	public SistemaControlVuelo(Pista pista1, Pista pista2) {
		super();
		this.listaVoladoresEnSistema = new ArrayList<>();
		this.pista1 = pista1;
		this.pista2 = pista2;
	}
	
	public void agregarObjetoVolador(ObjetoVolador volador) {
		this.listaVoladoresEnSistema.add(volador);
	}

	
	public void aterrizar() {
		
		for (ObjetoVolador objetoVolador : listaVoladoresEnSistema) {
			
			if(objetoVolador.esAterrizable() == 1) {
				this.pista1.agregarVoladorPista(objetoVolador);
				System.out.println("Se agrego un volador a la Pista 1");
			}else if(objetoVolador.esAterrizable() == 2) {
				this.pista2.agregarVoladorPista(objetoVolador);
				System.out.println("Se agrego un volador a la Pista 2");
			}else if(objetoVolador.esAterrizable() == 0) {
				System.out.println("Un objeto volador Sin pista");
			}
			
			
		}
	}

	



}