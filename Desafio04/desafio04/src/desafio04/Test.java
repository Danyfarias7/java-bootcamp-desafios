package desafio04;

public class Test {
	
	public static void main(String[] args) {
		
		 CollectionCustom<String> miColeccion = new CollectionCustom<>(10);
		 
		 System.out.println("\n------- add metodo----------");
		 miColeccion.add("Elemento metodo add");
		 miColeccion.add("Elemento metodo add");
		 miColeccion.add("Elemento metodo add");
;
		 miColeccion.mostrarArray();
		 System.out.println("Usados: " + miColeccion.size());
		 
		 // Metodo addFirst 
		 System.out.println("\n------- addFirst metodo----------");
		 miColeccion.addFirst("Elemento metodo addFirst");
		 miColeccion.addFirst("Elemento metodo addFirst");
		 miColeccion.addFirst(null);
		 miColeccion.add("Ocupo el primer NULL - metood add");
		 miColeccion.mostrarArray();
		 System.out.println("Usados: " + miColeccion.size());


		 System.out.println("\n------- addLast metodo----------");
		 miColeccion.addlast("Elemento metodo addLast");
		 miColeccion.addlast("Elemento metodo addLast");

	
		 miColeccion.mostrarArray();
		 System.out.println("Usados: " + miColeccion.size());

		 System.out.println("\n------- metodo remove ----------");
		 System.out.println("Elemento Eliminado: " + miColeccion.remove(5));
		 System.out.println("");
		 miColeccion.mostrarArray();
		 System.out.println("Usados: " + miColeccion.size());
		 
		 System.out.println("\n------- metodo removeAll ----------");
		    String[] miArray = new String[5];

	        // Llenar el array con cadenas de texto
	        miArray[0] = "Hola";
	        miArray[1] = "Mundo";
	        miArray[2] = "en";
	        miArray[3] = "Java";
	        miArray[4] = "!";
	        
	        System.out.println("Despues de borrar: " + miArray.length);
	        for (int i = 0; i < miArray.length; i++) {
	            System.out.println(miArray[i]);
	        }
	        
	        // Lo borramos 
	        miColeccion.removeAll(miArray);
	        
	       System.out.println("Despues de borrar: " + miArray.length);
	       for (int i = 0; i < miArray.length; i++) {
	            System.out.println(miArray[i]);
	        }
		 
	       System.out.println("\n------- metodo empty ----------");
	       System.out.println(miColeccion.empty());
	}
}
