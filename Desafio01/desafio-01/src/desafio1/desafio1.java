package desafio1;

import java.util.Date;
import java.util.Scanner;

public class desafio1 {
	

	public static boolean esFechaValida(int date, int topeInferior, int topeSuperior) {
		
		boolean esFechaValida = false;
		if(date >= topeInferior && date <= topeSuperior) {
			esFechaValida = true;
		}
		 
		return esFechaValida;
	}
	
	
	public static boolean esAnoBisiesto(int month, int year ) {
		/*Es divisible por 4.
		No es divisible por 100, a menos que también sea divisible por 400.
		 */
		boolean esBisiesto = false;
		
		  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	           esBisiesto = true;
	        } 
		
		
		return esBisiesto && month == 2 ;
	}
	
	

	
	 public static void main(String[] args) {
	        
		 	final int TOPE_MES_BISIESTO = 29;
		 	int day = 0, month  = 0, year = 0;
		 	Scanner scanner = new Scanner(System.in);
		 	int topeInferior, topeSuperior;
		 	String fechaIngresada;
		 	
		 	
			
			
			System.out.println("Ingresa una fecha en formato: dd/mm/yyyy");
			do {
				System.out.print("\nIngresa el Dia: ");
				day = scanner.nextInt();
				topeInferior  = 1;
				topeSuperior = 31;
			}while(!esFechaValida(day, topeInferior, topeSuperior));
			do {
				System.out.print("Ingresa el Mes: ");
				month = scanner.nextInt();
				topeInferior  = 1;
				topeSuperior = 12;
			}while(!esFechaValida(month, topeInferior, topeSuperior));

			do {
				System.out.print("Ingresa el año en formato completo: ");
				year = scanner.nextInt();
				topeInferior  = 1900;
				topeSuperior = 2099;
			}while(!esFechaValida(year, topeInferior, topeSuperior));
		 	
		 	
		 // Salida de datos 
			
			System.out.println("\n-----------------------------------");
		 	System.out.println("Fecha Ingresada: " + day + "/" + month + "/" + year);
		
		 	if(esAnoBisiesto(month, year) && day > TOPE_MES_BISIESTO) {
		 		System.out.println("Es año bisiesto Y hay un ERROR en la fecha, Febrero tiene 29 dias");
		 	
		 	}else if(esAnoBisiesto(month, year)){
		 		System.out.println("Es año bisiesto :)");
		 		
		 	}
		 
		 	System.out.println("\n-----------------------------------");
		 	
			
			
	    }
}
