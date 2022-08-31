package ar.edu.unlu.poo.libros;

public class MainLibro {

	public static void main(String[] args) {
		//                              Titulo                 Autor          Npag   Nejem   NPrest
		Libro libroMagia = new Libro("Magia para chicos", "Marcos Rodriguez", 352,   25,     5);
		Libro libroBiologia = new Libro("Biologia introductoria", "Marcela Perez", 893, 1, 6);
		System.out.println("Informacion de los libros: ");
		System.out.println(libroMagia.getInfo());
		System.out.println(libroBiologia.getInfo());
		System.out.println("*****************************************************************************************\n\n");
		
		System.out.println("Quien tiene mas paginas?");
		int l1 = libroMagia.getPaginas();
		int l2 = libroBiologia.getPaginas();
		
		// Determinar que libro tiene mas paginas.
		if (l1 > l2) {
			System.out.println("El libro '" + libroMagia.getTitulo() + "' tiene mas paginas.");
		} else {
			System.out.println("El libro '" + libroBiologia.getTitulo() + "' tiene mas paginas.");
		}
		
		// Libro con muchos ejemplares, se prestan.
		libroMagia.prestarLibro();
		libroMagia.prestarLibro();
		libroMagia.prestarLibro();
		libroMagia.prestarLibro();
		System.out.println("\n" + libroMagia.getInfo());
		
		
 		// Libro con un solo ejemplar, no se presta.
		libroBiologia.prestarLibro();
		System.out.println(libroBiologia.getInfo());

		libroBiologia.devolverLibro();
		libroBiologia.devolverLibro();
		System.out.println("Se prestaron un total de " + Libro.getTotalDisponibles() + " libros.");
		

	}

}
