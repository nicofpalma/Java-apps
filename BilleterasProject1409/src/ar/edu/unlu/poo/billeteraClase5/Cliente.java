package ar.edu.unlu.poo.billeteraClase5;

public class Cliente {
	private String nombre;
	private static int idCliente = 0;
	private CuentaNormal cuentaNormal;
	private CuentaCredito cuentaCredito;
	
	//implementar GetSaldoTotal();
	public Cliente(String nombre, boolean cuentaCredito) {
		this.nombre = nombre;
		Cliente.idCliente = Cliente.idCliente++;
		this.cuentaNormal = new CuentaNormal(Cliente.idCliente);
		if (cuentaCredito == true) {
			this.cuentaCredito = new CuentaCredito(Cliente.idCliente);
		}
	}
	
	public double getSaldoTotal() {
		double saldoNormal = this.cuentaNormal.getSaldoCuentaNormal();
		double saldoCredito = this.cuentaCredito.getSaldoCuentaCredito();
		
		return saldoNormal - saldoCredito;
	}
	
	
}
