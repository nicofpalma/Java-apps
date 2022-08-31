package ar.edu.unlu.poo.libros;

public class Libro {
	private String titulo;
	private String autor;
	private int numPaginas;
	private int numEjemplares;
	private int numEjemplaresPrestados;
	private static int prestamosTotales = 0;
	
	public Libro(String tituloLibro, String autorLibro, int paginasLibro, int ejemplaresLibro, int prestadosLibro) {
		this.titulo = tituloLibro;
		this.autor = autorLibro;
		this.numPaginas = paginasLibro;
		this.numEjemplares = ejemplaresLibro;
		this.numEjemplaresPrestados = prestadosLibro;
	}
	
	public boolean prestarLibro() {
		if (this.numEjemplares > 1) {
			this.numEjemplares--;
			this.numEjemplaresPrestados++;
			Libro.prestamosTotales++;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean devolverLibro() {
		if (this.numEjemplaresPrestados >= 1) {
			this.numEjemplares++;
			this.numEjemplaresPrestados--;
			return true;
		} else {
			return false;
		}
	}
	
	
	public String getInfo() {
		return "El libro " + this.titulo + " creado por el autor " + this.autor + " tiene " + this.numPaginas + 
				" paginas, quedan " + this.numEjemplares + " disponibles y se prestaron " + this.numEjemplaresPrestados + 
				".";
	}
	
	public int getPaginas() {
		return this.numPaginas;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public int getEjemplares() {
		return this.numEjemplares;
	}
	
	public int getEjemplaresPretados() {
		return this.numEjemplaresPrestados;
	}
	
	public static int getTotalDisponibles() {
		return Libro.prestamosTotales;
	}
	
}
