package ar.edu.unlu.poo.billeteras;

public class CuentaNormal {
	private int saldo;
	private static int limiteDeGiro = 5000;
	private int saldoInvertido;
	
	public CuentaNormal() {
		this.saldo = 0;
		this.saldoInvertido = 0;
	}
	
	public void agregarSaldo(int monto) {
		this.saldo += monto;
		
	}
	
	public void invertirSaldo(int monto) {
		if (saldoInvertido == 0) {
			this.saldoInvertido = monto;
		}	
	}
	
	public void gasto(int monto) {
		if (monto < (this.saldo + CuentaNormal.limiteDeGiro)) {
			this.saldo -= monto;
		}
	}
	
	public int getSaldo() {
		return this.saldo;
	}
	
	// AGREGAR A "invertirSaldo" -> PASADO N DIAS, GENERA UN INTERES DEL 40%
	// SOLO SE PUEDE REALIZAR UNA INVERSION A LA VEZ
}
