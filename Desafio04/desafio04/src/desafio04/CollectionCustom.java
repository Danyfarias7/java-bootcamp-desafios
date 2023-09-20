package desafio04;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

public class CollectionCustom<T> {
	
	private T[] arrayElementos;
	private int size;
	private int tamanoTotalArray;
	
	public CollectionCustom(int tamanoTotalArray) {
		super();
		this.arrayElementos = (T[]) new Object[tamanoTotalArray]; // hacemos donwcasting 
		this.tamanoTotalArray = tamanoTotalArray;
		this.size = 0; // El size esta vacio pq no hemos usado espacio de la memoria 
		

	}
	
	
	public void mostrarArray() {
		System.out.println("lenght: " + arrayElementos.length);
		for (T t : arrayElementos) {
			System.out.println(t);
		}
		
	}
	
	
	
	
	// CANTIDAD ESPACIOS USADOS 
	public int size() {

		int cont = 0;
		for(int i = 0; i < this.arrayElementos.length; i++ ) {
			
			if(this.arrayElementos[i] != null) {
				cont++;
			}
	
		}
		
		return cont;
	}
	
	private void  moverPosicionArrayUnEspacioALaDerecha() {
		int usados = size();
		for (int i = usados; i > 0 ; i--) {
			T aux =  arrayElementos[i - 1]; // Aux almacena  el ultimo 
			this.arrayElementos[i]  = aux; // Lo mueve a la derecha y lo guarda en esa posicion 
	}
	}
	
	// ------ AGREGA DE PRIMERO -----------
	public void addFirst(T dato) {
		
		// Si entra no hay que refactoriarlo 
		if(this.size() < this.arrayElementos.length) {
			this.moverPosicionArrayUnEspacioALaDerecha();
			this.arrayElementos[0] = dato; // añadimos el dato de primero en el espacio vacio
		
			
		}else {
			// Hay que crear un arrayGrande
			int masEspacios = this.arrayElementos.length * 2;
			T[] nuevoArray = (T[]) new Object[masEspacios];
			
			nuevoArray[0] = dato;
			System.out.println(nuevoArray.length);
			for (int i = 0; i < arrayElementos.length; i++) {
				T viejo = arrayElementos[i];
				nuevoArray[i + 1] = viejo;
				
			}
			
			arrayElementos = nuevoArray;
			
			
		}
	}
	
	private void agregarUltimo(T dato, T[] array) {
		int i = array.length ;
		boolean esNull = false;
		
		while(i > 0 && !esNull) {
			// Recorre del ultimo al primero, cuando consigue un elemnto
			// que eno sea null, le suma 1 a esa posicion y lo añade de ultimo
			if(array[i - 1] == null) {
				i--;
			}else {
				array[i] = dato;
				esNull = true;
			}
	
		}
	}
	
	// ------ AGREGA DE ULTIMO -----------
	public void addlast(T dato) {
		
		// Si entra no hay que refactoriarlo 
		if(this.size() < this.arrayElementos.length) {
			
			this.agregarUltimo(dato, this.arrayElementos);
			
		}else {
			// Hay que crear un arrayGrande
			int masEspacios = this.arrayElementos.length * 2;
			T[] nuevoArray = (T[]) new Object[masEspacios];
			
			

			for (int i = 0; i < arrayElementos.length; i++) {
				T viejo = arrayElementos[i];
				nuevoArray[i] = viejo;

			}

			// Despues que se añadan todos a la lista añadimos al ultimo :)
			this.agregarUltimo(dato, nuevoArray);
			arrayElementos = nuevoArray;
			
			
		}
	}
	
	// ------ AGREGA EN LA PRIMERA POSICION DISPONIBLE -----------
	// Este metodo NO tiene refactoring - podria hacerlo pero estoy sin tiempo 
	public void add(T dato) {
		int i = 0;
		boolean esNull = false;
		
		while(i < this.arrayElementos.length && !esNull) {
			
			if(this.arrayElementos[i] == null) {
				this.arrayElementos[i] = dato;
				esNull = true;
			}else {
				i++;
			}
	
		}
	}
	
	
	// ------ Elimina el primer elemento indicado por parametro -----------
	public T remove(int datoEliminar) {
		T t = null;
		
		if(datoEliminar >= 0 && datoEliminar <= (this.arrayElementos.length - 1)) {
			t =  this.arrayElementos[datoEliminar];
			this.arrayElementos[datoEliminar] = null;
		}
		
		
		return t;
	}
	
	// ------ Elimina el primer elemento indicado por parametro -----------
	// En el desafio dice que le llega por paramtro, lo hice asi pero
	//me parece raro pq pense que trabajabamos con nustro propio []
	
		public void removeAll(T[] c) {
	    for (int i = 0; i < c.length; i++) {
	        c[i] = null;
	    }
	}

// ------ Elimina el primer elemento indicado por parametro -----------
	
	public boolean empty() {
		return this.size() == 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
