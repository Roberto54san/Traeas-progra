/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareasprog;

/**
 *
 * @author Robert
 */
public class palíndromo {
  public static void main(String[] args) {
		String[] cadenas = { "La ruta natural", "Esto no es", "Parzibyte", "Hola", "Sol", "Ana", "Oro", "Oso",
				"A ti no, bonita",
				"Adivina ya te opina, ya ni miles origina, ya ni cetro me domina, ya ni monarcas, a repaso ni mulato carreta, acaso nicotina, ya ni cita vecino, anima cocina, pedazo gallina, cedazo terso nos retoza de canilla goza, de pánico camina, ónice vaticina, ya ni tocino saca, a terracota luminosa pera, sacra nómina y ánimo de mortecina, ya ni giros elimina, ya ni poeta, ya ni vida",
				"A mamá, Roma le aviva el amor a papá y a papá, Roma le aviva el amor a Mamá", "Me gusta programar en Java" };
		for (String cadena : cadenas) {
			System.out.println("¿'" + cadena + "' es palíndromo? " + esPalindromo(cadena));
		}
	}
	public static boolean esPalindromo(String cadena) {
	

		cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
				.replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
		
		String invertida = new StringBuilder(cadena).reverse().toString();
		
		return invertida.equals(cadena);
	}
}

