package ar.edu.unlu.poo.pass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordGenerator contrasena1 = new PasswordGenerator(50);
		System.out.println(contrasena1.getPassword());
		
		if (contrasena1.getEsFuerte() == false) {
			contrasena1.getNewStrongPassword();
			System.out.println(contrasena1.getPassword());
			
		}

	}

}
