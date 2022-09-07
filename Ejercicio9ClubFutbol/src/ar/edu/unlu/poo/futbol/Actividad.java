package ar.edu.unlu.poo.futbol;

public class Actividad {
	private String[] basicas;
	private String[] intermedias;
	private String[] destacadas;
	
	public Actividad(String[] basicas, String[] intermedias, String[] destacadas) {
		this.basicas = basicas;
		this.intermedias = intermedias;
		this.destacadas = destacadas;
	}
	
	public String actividadesPorSuscripcion(int suscripcion) {
		String s = "";
		if (suscripcion == 1) {
			for (int i = 0; i < basicas.length; i++) {
				s = s + basicas[i] + "\n";
			}
			return s;
		} else {
			if (suscripcion == 2) {
				for (int i = 0; i < intermedias.length; i++) {
					s = s + intermedias[i] + "\n";
				}
				return s;
			} else {
				for (int i = 0; i < destacadas.length; i++) {
					s = s + destacadas[i] + "\n";
				}
				return s;
			}
		}
	}
	
	public String[] getActividadesBasicas() {
		return this.basicas;
	}
	
	public String[] getActividadesIntermedias() {
		return this.intermedias;
	}
	
	public String[] getActividadesDestacadas() {
		return this.destacadas;
	}
} 
