package ar.edu.unlu.poo.billeteraClase5;

import java.time.LocalDate;

public class Compra {
	private boolean estaPagado;
	private int idCompra;
	private double monto;
	private LocalDate fecha;
	
	public Compra(boolean estaPagado, int idCompra, double monto, LocalDate fecha) {
		this.estaPagado = estaPagado;
		this.idCompra = idCompra;
		this.monto = monto;
		this.fecha = fecha;
	}
	
	public int getIdCompra() {
		return this.idCompra;
	}
	
	public LocalDate getFechaCompra() {
		return this.fecha;
	}
	
	public double montoCompra() {
		return this.monto;
	}
	
	
}
