package ar.edu.unlu.poo.futbol;

public class MainFutbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socio carlos = new Socio("Carlos Perez", "Hombre", "carlosperez@gmail.com", "Bach 9123", 3);
		Socio juan   = new Socio("Juan Gomez", "Hombre", "juangomez@gmail.com", "Lafauci 984", 2);
		Socio nico   = new Socio("Nicolas Fernandez Palma", "Hombre", "nicofpalmaa@gmail.com", "Vivaldi 2750", 3);
		Socio mateo  = new Socio("Mateo Rodriguez", "Hombre", "mateorod@gmail.com", "Hernandez 9987", 1);
		Socio romina = new Socio("Romina Lopez", "Mujer", "romilopez@gmail.com", "Italia 56", 1);
		Socio marcelo = new Socio("Marcelo Tinelli", "Hombre", "marcetinelli@gmail.com", "Corrientes 5456", 3);
		Socio gustavo = new Socio("Gustavo Hernandez", "Hombre", "gushernandez@gmail.com", "Lugano 7514", 1);
		Socio[] socios = {juan, nico, mateo, romina, marcelo, gustavo};
		SistemaFutbol sistema = new SistemaFutbol(socios);
		
		System.out.println(sistema.getSocios());
		System.out.println(sistema.getAllActividades());
		System.out.println(sistema.getSociosPorSuscripcion());
		
		
	}

}
