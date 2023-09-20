package desafio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Escuela escuela;
		int cantAlumnos;
		int i = 0, nroMenu;
		String nombre, apellido;
		int nroExamen, nota;
		
		Scanner scanner = new Scanner(System.in);
		
		
		// --------------------- Carga de Datos ------------------------------
		System.out.print("Ingresa la cantidad de alumnos a procesar: ");
		cantAlumnos = scanner.nextInt();
		escuela = new Escuela(cantAlumnos);
		
		
		
		while(i < cantAlumnos) {
			System.out.println("------------------------------------------------------");
			System.out.print("Ingresa el nombre del alumno Nro " + (i + 1) + ": ");
			nombre = scanner.next();
			System.out.print("Ingresa el apellido del alumno Nro " + (i + 1) + ": ");
			apellido = scanner.next();
			

			System.out.print("Ingresa el numero de examenes: ");
			nroExamen = scanner.nextInt();
			
			Alumno alumno = new  Alumno(nombre, apellido, nroExamen);
			escuela.agregarAlumnos(alumno);
			int e = 0;
			
			while( e < nroExamen) {
				
				do {
					System.out.print("Ingresa la nota Nro  "+(e+1)+" que obtuvo el alumno (Entre 0 - 10) : ");
					nota = scanner.nextInt();
					
					if(nota >= 0 && nota <= 10) {
						alumno.agregarNota(nota);						
						e++;
					}
					
				}while((nota < 0 || nota > 10));
				
				
			}
			
		i++;
		}
		
		System.out.println("------------------------------------------------------");
		System.out.println("Lista Alumnos agregados");
		escuela.mostrarListaAlumnos();
		
		
		
		// --------------------- Menu de Opciones ------------------------------
		
		
		do {
			System.out.println("\n --------------- MENU DE OPCIONES ---------------");
			System.out.println("1- alumno/s con la calificación más alta");
			System.out.println("2- alumno/s con la calificación más baja");
			System.out.println("3- alumnos que promocionan, aquellos que obtuvieron un promedio >= 7");
			System.out.println("4- alumnos que deben recursar la materia, aquellos que obtuvieron un promedio < 7");
			System.out.print("Selecciona una opcion: ");
			nroMenu = scanner.nextInt();
		if(nroMenu < 1 || nroMenu > 4) {
			System.out.println("\nNo existe esa opcion de Menu, Intenta de nuevo");
		}
		
		}while(nroMenu < 1 || nroMenu > 4);
		
		System.out.println("\n----------------- MOSTRANDO RESULTADOS ---------------------------");
		switch (nroMenu) {

		case 1: 
			System.out.println("Alumnos con calificacion mas alta ");
		mostrarResultados(escuela.alumConMayorNota());
		break;
		
		case 2:	
			System.out.println("Alumnos con calificacion mas baja ");
			mostrarResultados(escuela.alumConMenorNota());
		break;
		case 3:
			System.out.println("Alumnos que han promocionado ");
			escuela.alumPromocionados();
		break;
		case 4:
			System.out.println("Alumnos que recursan");
			escuela.alumQueRecursan();
		break;
		}
		
	
		

		 
		
		
		
		
		

}
	public static void mostrarResultados(ArrayList<Alumno> alumno) {
		
		for (Alumno a : alumno) {
			System.out.println(a);
		}
	} 
	

}
