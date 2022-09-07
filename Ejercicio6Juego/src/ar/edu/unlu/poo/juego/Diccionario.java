package ar.edu.unlu.poo.juego;

public class Diccionario {
	private static String[] palabrasValidas;
	
	public Diccionario(String[] palabrasValidas) {
		Diccionario.palabrasValidas = palabrasValidas;
	}
	
	public static boolean validarPalabra(String palabra) {
		for (int i = 0; i < palabrasValidas.length; i++) {
			if (palabra.toUpperCase().equals(palabrasValidas[i].toUpperCase())) {
				return true;
			}
		}
		return false;
	}
	
	
}
