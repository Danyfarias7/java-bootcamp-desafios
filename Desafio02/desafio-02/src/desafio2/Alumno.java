package desafio2;

import java.util.ArrayList;
import java.util.Arrays;

public class Alumno {
	
	private final int NOTA_MINIMA = 0;
	private final int NOTA_MAXIMA = 10;
	
	private String nombre;
	private String apellido;
	private int nroExamen;
	private int i =0;
	private int[] arrayNotas;
	
	
	public Alumno(String nombre, String apellido, int nroExamen) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroExamen = nroExamen;
		this.arrayNotas = new int[nroExamen];
	}
	
	
	public void agregarNota(int nota) {
		if(i < this.arrayNotas.length) {
			System.out.println("Se agrego la nota");
			this.arrayNotas[i] = nota;
			i++;
			
			
		}
	} 
	
	public double damePromedio() {
		int acumulador = 0;
		for (int nota : this.arrayNotas) {
			 acumulador += nota;
			
		}
		
		return acumulador / this.arrayNotas.length;
	}


	public int dameNotaMasAlta(){
		int notaMax = Integer.MIN_VALUE;
			
		for (int nota : arrayNotas) {
			
			if(nota > notaMax) {
				notaMax = nota;
			}
		
		}
		
		return notaMax;
	}

	
	public int dameNotaMasBaja(){
		int notaMin = Integer.MAX_VALUE;
			
		for (int nota : arrayNotas) {
			
			if(nota < notaMin) {
				notaMin = nota;
			}
		
		}
		
		return notaMin;
	}


	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", notas=" + Arrays.toString(arrayNotas)
				+ "]";
	}


	

	

}
