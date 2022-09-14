package ar.edu.unlu.poo.billeteraClase5;

import java.time.LocalDate;

public class CuentaNormal {
	private double saldo;
	private static double limiteDescubierto = 5000.0;
	private double montoInvertido;
	private double montoTotal;
	private LocalDate fechaDevolucionInversion;
	private boolean yaInvirtio;
	private int idCliente;
	
	public CuentaNormal(int idCliente) {
		this.saldo = 0;
		this.montoInvertido = 0;
		this.montoTotal = 0;
		this.yaInvirtio = false;
		this.idCliente = idCliente;
	}
	
	public double getSaldoCuentaNormal() {
		return this.saldo;
	}
	
	public void agregarSaldo(int monto) {
		this.saldo += monto;
	}
	
	public void invertirSaldo(int monto) {
		if (montoInvertido == 0.0) {
			this.montoInvertido = monto;
			this.yaInvirtio = true;
		}	
	}
	
	public void gasto(int monto) {
		if (monto < (this.saldo + CuentaNormal.limiteDescubierto)) {
			this.saldo -= monto;
		}
	}
	
	public double getSaldoTotal() {
		return this.saldo + this.montoInvertido;
	}
	
	

	
}
