package ar.edu.unlu.poo.billeteraClase5;

import java.util.ArrayList;

public class CuentaCredito {
	private static double limiteGasto = 50000.0;
	private double saldoDeudor;
	private ArrayList<Compra> compras;
	private int idCliente;
	
	public CuentaCredito(int idCliente) {
		this.saldoDeudor = 0.0;
		this.compras = new ArrayList<Compra>();
		this.idCliente = idCliente;
	}
	
	public double getSaldoCuentaCredito() {
		return this.saldoDeudor;
	}
	
	public double getLimiteGasto() {
		return CuentaCredito.limiteGasto;
	}
	
	public ArrayList<Compra> getCompras() {
		return compras;
	}
	
	
}
