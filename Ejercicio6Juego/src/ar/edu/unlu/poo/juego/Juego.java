package ar.edu.unlu.poo.juego;

public class Juego {
	private String ganador;
	private String[] jugadores; // 2 a n
	
	public Juego(String[] jugadores) {
		this.ganador = jugadores[0];
		this.jugadores = jugadores;
		
		String[] palabrasDiccionario = {"hola", "si", "que", "policia"};
		
		Diccionario diccionario1 = new Diccionario(palabrasDiccionario);
		
		Jugador jugador1 = new Jugador(jugadores[0]);
		Jugador jugador2 = new Jugador(jugadores[1]);
		
		Palabra hola = new Palabra("hola");
		Palabra chau = new Palabra("chau");
		Palabra si = new Palabra("si");
		Palabra que = new Palabra("que");
		
		Palabra[] palabrasJugador1 = {hola, chau, si};
		Palabra[] palabrasJugador2 = {hola, chau, que};
		
		for (int i = 0; i < palabrasJugador1.length; i++) {
			jugador1.guardarPalabraValida(palabrasJugador1[i]);
			jugador2.guardarPalabraValida(palabrasJugador2[i]);
		}
		
		this.jugadorGanador(jugador1, jugador2);
		
 	}
	
	public void jugadorGanador(Jugador jugador1, Jugador jugador2) {
		if (jugador1.getPuntajeJugador() > jugador2.getPuntajeJugador()) {
			this.ganador = "El ganador es " + jugador1.getNombreJugador() + " con " + 
					String.valueOf(jugador1.getPuntajeJugador()) + " puntos.";
		} else {
			this.ganador = "El ganador es " + jugador2.getNombreJugador() + " con " + 
					String.valueOf(jugador2.getPuntajeJugador()) + " puntos.";
		}
	
	}
	
	public String getGanador() {
		return this.ganador;
	}
	
	

}
