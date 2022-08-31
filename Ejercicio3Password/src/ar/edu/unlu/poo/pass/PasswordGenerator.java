package ar.edu.unlu.poo.pass;
import java.util.Random;

public class PasswordGenerator {
	private int longitud;
	private boolean strong;
	private String password;
	
	public PasswordGenerator(int len) {
		this.longitud = len;
		
		String s = "";
		Random ch = new Random();
		int asciiRandom;
		
		for (int i = 0; i < this.longitud; i++) {
			asciiRandom = ch.nextInt(93) + 33;
			s = s + Character.toString(asciiRandom);
		}
			
		if (this.esFuerte(s)) {
			s = "<"  + s + "> - Fuerte";
			this.strong = true;
		} else {
			this.strong = false;
			s = "<" + s + "> - Debil";
		}
		
		this.password = s;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public boolean getEsFuerte() {
		return this.strong;
	}
	
	private boolean esFuerte(String pass) {
		int upper = 0; // +2
		int lower = 0; // +1
		int numb = 0;  // 2
		char c;
		
		for (int i = 0; i < pass.length(); i++) {
			c = pass.charAt(i);
			if (Character.isUpperCase(c)) {
				upper++;
			} 
			if (Character.isLowerCase(c)) {
				lower++;
			}
			if (Character.isDigit(c)) {
				numb++;
			}
		}
		
		// Verifico si es fuerte
		if ((upper > 2) && (lower > 1) && (numb >= 2)) {
	
			return true;
		} else {

			return false;
		}
	}
	
	public void getNewStrongPassword() {
		// Fuerte = Más de 2 mayúsculas, 1 miníscula y al menos dos números.
		String s = "";
		char check;
		Random ran = new Random();
		int asciiRandom;
		String newPass = "";
		
		int upper = 0;
		int lower = 0;
		int digit = 0;
		
		int i = 0;
		boolean flag = true;
		while (flag) {
			asciiRandom = ran.nextInt(93) + 33;
			s = Character.toString(asciiRandom);
			check = s.charAt(0);
			
			if (Character.isUpperCase(check) && upper != 3) {
				newPass = newPass + check;
				upper++;
			} 
		
			if (Character.isLowerCase(check) && lower != 1) {
				newPass = newPass + check;
				lower++;
			}
				
			if (Character.isDigit(check) && digit != 2) {
				newPass = newPass + check;
				digit++;
			}
			
			if (upper == 3 && lower == 1 && digit == 2) {
				flag = false;
			}
		}
		
	int dif = this.longitud - newPass.length();
	if (dif > 0) {
		while (dif > 0) {
			asciiRandom = ran.nextInt(93) + 33;
			s = Character.toString(asciiRandom);
			newPass = newPass + s;
			
			dif--;
		}
	}

	this.strong = true;
	this.password = "<"  + newPass + "> - Fuerte";
	}
	
	
	public int getLongitud() {
		return this.longitud;
	}
	


}
