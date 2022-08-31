package ar.edu.unlu.poo.fechas;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;



public class Fecha {
	private String dia;
	
	public Fecha(String fecha) {
		this.dia = fecha;
	}
	
	public Date getFecha() throws ParseException {
		DateFormat sourceFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = sourceFormat.parse(this.dia);
		
		return date;
	}
	
	
}
