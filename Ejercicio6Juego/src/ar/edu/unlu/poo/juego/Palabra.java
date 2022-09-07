package ar.edu.unlu.poo.juego;

public class Palabra {
	private String palabraAConfirmar;
	private int puntajePalabra;
	
	public Palabra(String palabraAConfirmar) {
		this.palabraAConfirmar = palabraAConfirmar;
		this.puntajePalabra = 0;
	}
	
	public int calculoPuntaje() {

		char c;
		 if (Diccionario.validarPalabra(this.palabraAConfirmar)) {
			 this.palabraAConfirmar = palabraAConfirmar.toUpperCase();
			 
			 for (int i = 0; i < this.palabraAConfirmar.length(); i++) {
				c = this.palabraAConfirmar.charAt(i);
				
				if (c != 'K' && c != 'Z' && c != 'X' && c != 'Y' && c != 'W'
					&& c != 'Q') {
					this.puntajePalabra++;
				} else {
					this.puntajePalabra += 2;
				}
			}

			 return this.puntajePalabra;
		 } else {
			 return this.puntajePalabra;
		 }
		
		
	}
	

	
	
}
