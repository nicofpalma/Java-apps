package ar.edu.unlu.poo.ecuacion;
import java.lang.Math;

public class EcuacionSegundoGrado {
	private int a;
	private int b;
	private int c;
	
	public EcuacionSegundoGrado(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String getResultado() {			
		// ((b^2)-4*a*c) Discriminante
		double x1;
		double x2;
		String resultado;
		
		double calculoDiscriminante = (Math.pow(this.b, 2)) - 4 * this.a * this.c;
		
		if (calculoDiscriminante == 0.0) {
			x1 = ((-this.b) - (Math.sqrt(calculoDiscriminante))) / 2 * this.a;
			resultado = "X = " + String.valueOf(x1); 
		} else {
			// (-b±√(discriminante))/(2*a)
			x1 = ((-this.b) - (Math.sqrt(calculoDiscriminante))) / 2 * this.a;
			x2 = ((-this.b) + (Math.sqrt(calculoDiscriminante))) / 2 * this.a;
			resultado = "X1 = " + String.valueOf(x1) + "\nX2 = " + String.valueOf(x2);
		}
		
		return resultado;
	}
	
	
}
