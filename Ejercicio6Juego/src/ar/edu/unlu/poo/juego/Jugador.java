package ar.edu.unlu.poo.juego;


public class Jugador {
	private String nombreJugador;
	//private String[] palabrasValidadas;
	private int puntajeJugador;
	
	public Jugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
		this.puntajeJugador = 0;
	}
	
	public void guardarPalabraValida(Palabra posiblePalabraValida) {
		int puntajePalabra = posiblePalabraValida.calculoPuntaje();
		
		if (puntajePalabra != 0) {
			//this.palabrasValidadas[palabrasValidadas.length] = posiblePalabraValida.toString();
			this.puntajeJugador = this.puntajeJugador + puntajePalabra;
		}
		
	}
	
	// GETTERS --------------------------
	public String getNombreJugador() {
		return this.nombreJugador;
	}
	
	public int getPuntajeJugador() {
		return this.puntajeJugador;
	}
	// ---------------------------------
}
