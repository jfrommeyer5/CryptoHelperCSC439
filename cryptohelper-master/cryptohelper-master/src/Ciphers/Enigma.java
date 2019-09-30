package Ciphers;

import java.awt.event.ActionEvent;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class Enigma{
	
	public static void main(String[] args) {
		Plugboard pb = new Plugboard();
		Rotor1 r1 = new Rotor1(1);
		
		String a = "AAAAAAAAAAAAAAAAAAAAAAAAAA";
		String msg = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		CharacterIterator iter = new StringCharacterIterator(a);

		while(iter.current() != CharacterIterator.DONE) {
			r1.rotate();
			System.out.print(iter.current() + " > ");
			System.out.print(r1.encrypt(pb.encrypt(iter.current())) + "\n");
			iter.next();
		}
		
		System.out.println();
		
		iter = new StringCharacterIterator(msg);

		while(iter.current() != CharacterIterator.DONE) {
			r1.rotate();
			System.out.print(iter.current() + " > ");
			System.out.print(r1.encrypt(pb.encrypt(iter.current())) + "\n");
			iter.next();
		}
	}
	
//	@Override
//	public void actionButtonActionPerformed(ActionEvent evt) {
//		
//	}
}

class Plugboard{
	private String pegs;
	private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	Plugboard(String pegs) {
		this.pegs = pegs;
	}
	
	Plugboard(){
		this.pegs = Plugboard.alpha;
	}
	
	public char encrypt(char in) {
		return this.pegs.charAt(Plugboard.alpha.indexOf(in));
	}
	
	public char decrypt(char in) {
		return Plugboard.alpha.charAt(this.pegs.indexOf(in));
	}
}

class Rotor1{
	private String left =         "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
	private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private int pos, step = 0;
	
	Rotor1(int pos) {
		this.pos = pos;
	}
	
	public char encrypt(char in) {
		System.out.print(Rotor1.alpha.charAt((Rotor1.alpha.indexOf(in)+step)%26) + " > ");
		int index = Rotor1.alpha.indexOf((this.left.charAt((Rotor1.alpha.indexOf(in)+step)%26))-step)%26;
		
		if(index < 0) index = -index;
		
		return Rotor1.alpha.charAt(index);
	}
	
	public char decrypt(char in) {
		return Rotor1.alpha.charAt(this.left.indexOf(in));
	}
	
	public boolean rotate() {
		if(++step >= 26) {
			step = step%26;
			return true;
		}
		
		return false;
	}
}

class Rotor2{
	private String left = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
	private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private int pos;
	
	Rotor2(int pos) {
		this.pos = pos;
	}
	
	public char encrypt(char in) {
		return this.left.charAt(Rotor2.alpha.indexOf(in));
	}
	
	public char decrypt(char in) {
		return Rotor2.alpha.charAt(this.left.indexOf(in));
	}
}

class Rotor3{
	private String left = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
	private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private int pos;
	
	Rotor3(int pos) {
		this.pos = pos;
	}
	
	public char encrypt(char in) {
		return this.left.charAt(Rotor3.alpha.indexOf(in));
	}
	
	public char decrypt(char in) {
		return Rotor3.alpha.charAt(this.left.indexOf(in));
	}
}

class Rotor4{
	private String left = "ESOVPZJAYQUIRHXLNFTGKDCMWB";
	private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private int pos;
	
	Rotor4(int pos) {
		this.pos = pos;
	}
	
	public char encrypt(char in) {
		return this.left.charAt(Rotor4.alpha.indexOf(in));
	}
	
	public char decrypt(char in) {
		return Rotor4.alpha.charAt(this.left.indexOf(in));
	}
}

class Rotor5{
	private String left = "VZBRGITYUPSDNHLXAWMJQOFECK";
	private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private int pos;
	
	Rotor5(int pos) {
		this.pos = pos;
	}
	
	public char encrypt(char in) {
		return this.left.charAt(Rotor5.alpha.indexOf(in));
	}
	
	public char decrypt(char in) {
		return Rotor5.alpha.charAt(this.left.indexOf(in));
	}
}

class Rotor6{
	private String left = "VZBRGITYUPSDNHLXAWMJQOFECK";
	private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private int pos;
	
	Rotor6(int pos) {
		this.pos = pos;
	}
	
	public char encrypt(char in) {
		return this.left.charAt(Rotor6.alpha.indexOf(in));
	}
	
	public char decrypt(char in) {
		return Rotor6.alpha.charAt(this.left.indexOf(in));
	}
}

class Rotor7{
	private String left = "VZBRGITYUPSDNHLXAWMJQOFECK";
	private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private int pos;
	
	Rotor7(int pos) {
		this.pos = pos;
	}
	
	public char encrypt(char in) {
		return this.left.charAt(Rotor7.alpha.indexOf(in));
	}
	
	public char decrypt(char in) {
		return Rotor7.alpha.charAt(this.left.indexOf(in));
	}
}

class Rotor8{
	private String left = "VZBRGITYUPSDNHLXAWMJQOFECK";
	private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private int pos;
	
	Rotor8(int pos) {
		this.pos = pos;
	}
	
	public char encrypt(char in) {
		return this.left.charAt(Rotor8.alpha.indexOf(in));
	}
	
	public char decrypt(char in) {
		return Rotor8.alpha.charAt(this.left.indexOf(in));
	}
}

class ReflectorB{
	private String out = "YRUHQSLDPXNGOKMIEBFZCWVJAT";
	private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public char encrypt(char in) {
		return this.out.charAt(ReflectorB.alpha.indexOf(in));
	}
}

class ReflectorC{
	private String out = "FVPJIAOYEDRZXWGCTKUQSBNMHL";
	private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public char encrypt(char in) {
		return this.out.charAt(ReflectorC.alpha.indexOf(in));
	}
}