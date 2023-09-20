package desafio2;

import java.util.ArrayList;

public class Escuela {
	
	private static final int NOTA_PROMOCION = 7;
	private Alumno[] arrayAlumnos;
	private int i = 0;

	public Escuela(int cantArray) {
	
		this.arrayAlumnos =  new Alumno[cantArray];
	}
	
	
	
	public void agregarAlumnos(Alumno alumno) {
		if(i < this.arrayAlumnos.length) {
			this.arrayAlumnos[i] = alumno;
			i++;
			
			
		}
	}
	
	public void mostrarListaAlumnos() {
		
		for (Alumno alumno : arrayAlumnos) {
			System.out.println(alumno);
		}
	}
	
	
	public ArrayList<Alumno> alumConMayorNota(){
			ArrayList<Alumno> listaAlum = new ArrayList<>();
			int notaMax = Integer.MIN_VALUE;
		
		for (Alumno alumno : arrayAlumnos) {
			System.out.println(alumno.dameNotaMasAlta());
			
			if(alumno.dameNotaMasAlta() == notaMax) {
				listaAlum.add(alumno);
				
			}else {
				
				if(alumno.dameNotaMasAlta() > notaMax ) {
					notaMax = alumno.dameNotaMasAlta() ;
					System.out.println(notaMax + "NotaMax");
					listaAlum.clear();
					listaAlum.add(alumno);
				}
			}
			
			
		}
		
		return listaAlum;
	}
	
	public ArrayList<Alumno> alumConMenorNota(){
		ArrayList<Alumno> listaAlum = new ArrayList<>();
		int notaMin = Integer.MAX_VALUE;
	
	for (Alumno alumno : arrayAlumnos) {
		
		if(alumno.dameNotaMasBaja() == notaMin) {
			
			listaAlum.add(alumno);
			System.out.println(alumno);
			
		}else {
			
			if(alumno.dameNotaMasBaja() < notaMin ) {
				notaMin = alumno.dameNotaMasBaja();
				listaAlum.clear();
				listaAlum.add(alumno);
			}
		}
		
		
	}
	
	return listaAlum;
}

	
	
	public void alumPromocionados(){
		
	
		for (Alumno alumno : arrayAlumnos) {
			
			if(alumno.damePromedio() >= NOTA_PROMOCION) {
				System.out.println(alumno);
			}
		}
	}
	
	
	
	public void alumQueRecursan(){
		
		for (Alumno alumno : arrayAlumnos) {
			if(alumno.damePromedio() < NOTA_PROMOCION) {
				System.out.println(alumno);
			}
		}
	}
	

}
