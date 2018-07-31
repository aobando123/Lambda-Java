package com.cenfotec.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class EjemploLambda {
	public static void main(String[] args) {

		Saludos buenosDias = (n) -> "Buenos dias " + n ;
		Saludos buenasNochesAlReves = (n) -> {
			String nombreAlReves = "";
			
			for(int i = n.length()-1; i >= 0 ; i--) {
				nombreAlReves +=  n.charAt(i);
			}
			
			return "Buenas noches " + n + "!, su nombre al reves es " +  nombreAlReves;
			
		}; 
		
		
		System.out.println(buenasNochesAlReves.mostrarSaludo("Gary"));
		mostrarSaludo(buenosDias, "Adrian");
		ejemploConArrays();

	}
	
	
	public static void mostrarSaludo (Saludos saludo, String mensaje) {
		
		System.out.println(saludo.mostrarSaludo("Adrian"));
	}
	
	public static void ejemploConArrays() {
		

		ArrayList<Integer> mayores = (ArrayList<Integer>) Arrays
				.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
				// se crea el stream
				.stream()
				//filtro para obtener los números mayores a 5 y dentro se utiliza la expresión lambda (x -> x > 5)
				.filter(x -> x > 5)
				//pone los elementos que se filtró dentro de una nueva lista, dentro se utiliza una expresión lambda  
				.collect(
						Collectors.toCollection(() -> new ArrayList<Integer>()));
 
		mayores.forEach(e -> System.out.println(e));
	}

}
