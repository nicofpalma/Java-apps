package ar.edu.unlu.poo.futbol;

public class SistemaFutbol {
	private Socio[] socios;
	private Actividad actividades;
	
	public SistemaFutbol(Socio[] socios) {
		this.socios = socios;
		String[] actBasicas = {"Cancha de 5", "Acceso al buffet", "Acceso a vestuarios"};
		String[] actIntermedias = {"Cancha de 5", "Cancha de 9",  "Acceso al buffet", "Acceso a vestuarios", "Descuento en productos seleccionados", "Acceso a piletas"};
		String[] actDestacadas = {"Cancha de 5", "Cancha de 9", "Cancha de 11",  "Acceso al buffet", "Acceso a vestuarios", "Descuento en productos seleccionados", "Acceso a piletas", "Creacion de club", "Estadia gratis fines de semana", "Club de pesca"};
		Actividad actividades = new Actividad(actBasicas, actIntermedias, actDestacadas);
		this.actividades = actividades;
	}
	
	public String getActividadesConSuscripcionBasica() {
		String s = "Actividades con suscripcion basica: \n";
		for (int i = 0; i < actividades.getActividadesBasicas().length; i++) {
			s = s + "- " + actividades.getActividadesBasicas()[i] + "\n";
		}
		return s;
	}
	
	public String getActividadesConSuscripcionIntermedia() {
		String s = "Actividades con suscripcion intermedia: \n";
		for (int i = 0; i < actividades.getActividadesIntermedias().length; i++) {
			s = s + "- " + actividades.getActividadesIntermedias()[i] + "\n";
		}
		return s;
	}
	
	public String getActividadesConSuscripcionDestacada() {
		String s = "Actividades con suscripcion destacada: \n";
		for (int i = 0; i < actividades.getActividadesDestacadas().length; i++) {
			s = s + "- " + actividades.getActividadesDestacadas()[i] + "\n";
		}
		return s;
	}
	
	public String getSocios() {
		String s = "";
		for (int i = 0; i < socios.length; i++) {
			s = s + socios[i].getDatosSocio();
			s = s + "\n-----------------------------\n\n";
		}
		return s;
	}
	
	public String getSociosPorSuscripcion() {
		String susBasica = "*** SOCIOS CON SUSCRIPCION BASICA ***\n";
		String susIntermedia = "*** SOCIOS CON SUSCRIPCION INTERMEDIA ***\n";
		String susDestacada = "*** SOCIOS CON SUSCRIPCION DESTACADA ***\n";
		for (int i = 0; i < socios.length; i++) {
			if (socios[i].getNivelSuscripcion() == 1) {
				susBasica = susBasica + socios[i].getDatosSocio() + "\n";
			} else {
				if (socios[i].getNivelSuscripcion() == 2) {
					susIntermedia = susIntermedia + socios[i].getDatosSocio() + "\n";
				} else {
					susDestacada = susDestacada + socios[i].getDatosSocio() + "\n";
				}
			}
		}
		String todos = susBasica  + "\n" + susIntermedia + "\n" +  susDestacada;
		return todos;
	}
	
	public String getAllActividades() {
		return this.getActividadesConSuscripcionBasica() + "\n" + this.getActividadesConSuscripcionIntermedia() + "\n" + this.getActividadesConSuscripcionDestacada();
	}

}
