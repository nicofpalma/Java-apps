package ar.edu.unlu.poo.futbol;

public class Socio {
	private String nombre;
	private String sexo;
	private String email;
	private String direccion;
	private int nivelSuscripcion;
	
	public Socio(String nombre, String sexo, String email, String direccion, int suscripcion) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.email = email;
		this.direccion = direccion;
		this.nivelSuscripcion = suscripcion;
	}
	
	public int getNivelSuscripcion() {
		return this.nivelSuscripcion;
	}
	
	public String getDatosSocio() {
		String s = "\n*** DATOS DE SOCIO *** \n";
		s = s + "- Nombre: " + this.nombre + "\n";
		s = s + "- Sexo: " + this.sexo + "\n";
		s = s + "- E-mail: " + this.email + "\n";
		s = s + "- Direccion: " + this.direccion + "\n";
		if (this.nivelSuscripcion == 1) {
			s = s + "- Nivel de suscripcion: BASICA.\n" ;
		} else {
			if (this.nivelSuscripcion == 2) {
				s = s + "- Nivel de suscripcion: INTERMEDIA";
			} else {
				s = s + "- Nivel de suscripcion: DESTACADA";
			}
		}
		return s;
	}

}
