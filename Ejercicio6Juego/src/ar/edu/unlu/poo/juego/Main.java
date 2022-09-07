package ar.edu.unlu.poo.juego;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] jugadores = {"Nichel", "Rinpin"};
		Juego juego1 = new Juego(jugadores);
		System.out.println(juego1.getGanador());
		
	}

}
