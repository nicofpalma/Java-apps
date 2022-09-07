package ar.edu.unlu.poo.billeteras;

public class Cuenta {
	private int idCuenta;
	private int dniCliente;
	private CuentaNormal cuentaNormal;
	
	
	public Cuenta(int idCuenta, int dniCliente) {
		this.idCuenta = idCuenta;
		this.dniCliente = dniCliente;
	}
}
