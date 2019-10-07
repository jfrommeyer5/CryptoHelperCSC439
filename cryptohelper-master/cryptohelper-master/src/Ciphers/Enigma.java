package Ciphers;

import java.awt.event.ActionEvent;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class Enigma{
	
	public static void main(String[] args) {
		Plugboard pbr = new Plugboard("ZYXWVUTSRQPONMLKJIHGFEDCBA");
		Plugboard pbn = new Plugboard();
		Rotor[] rotorArr = new Rotor[3];
		Rotor[] temp = new Rotor[3];
		temp[0] = new Rotor1(1);
		temp[1] = new Rotor2(2);
		temp[2] = new Rotor3(3);
		
		for(int i = 0; i < 3; i++) {
			rotorArr[temp[i].getPos()-1] = temp[i];
		}
		
		String a = "AAAAAAAAAAAAAAAAAAAAAAAAAA";
		String msg = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println("in\t>\tpout\t>\tr3in\t>\tr3out\t>\tr2out\t>\tr1out");
		
		CharacterIterator iter = new StringCharacterIterator(a);
		
		while(iter.current() != CharacterIterator.DONE) {
			System.out.print("r1: ");
			if(rotorArr[0].rotate()) {
				System.out.print("r1: True\n");
				System.out.print("r2: ");
				if(rotorArr[1].rotate()) {
					System.out.print("r2: True\n");
					System.out.print("r3: " + rotorArr[2].rotate() + "\n");
					System.out.print("r3: ");
				}
			}
			System.out.print(iter.current() + "\t>\t");
			System.out.print(rotorArr[2].encrypt(pbn.encrypt(iter.current())));
			System.out.println();
			
			iter.next();
		}
		System.out.println();		
		System.out.println("in\t>\tpout\t>\tr3in\t>\tr3out\t>\tr2out\t>\tr1out");
		
		iter = new StringCharacterIterator(a);
		
		for(int i = 0; i < 3; i++) {
			rotorArr[i].reset();
		}

		while(iter.current() != CharacterIterator.DONE) {
			System.out.print("r1: ");
			if(rotorArr[0].rotate()) {
				System.out.print("r1: True\n");
				System.out.print("r2: ");
				if(rotorArr[1].rotate()) {
					System.out.print("r2: True\n");
					System.out.print("r3: " + rotorArr[2].rotate() + "\n");
					System.out.print("r3: ");
				}
			}
			System.out.print(iter.current() + "\t>\t");
			System.out.print(rotorArr[1].encrypt(rotorArr[2].encrypt(pbn.encrypt(iter.current()))));
			System.out.println();
			
			iter.next();
		}
		
		iter = new StringCharacterIterator(a);

		while(iter.current() != CharacterIterator.DONE) {
			System.out.print("r1: ");
			if(rotorArr[0].rotate()) {
				System.out.print("r1: True\n");
				System.out.print("r2: ");
				if(rotorArr[1].rotate()) {
					System.out.print("r2: True\n");
					System.out.print("r3: " + rotorArr[2].rotate() + "\n");
					System.out.print("r3: ");
				}
			}
			System.out.print(iter.current() + "\t>\t");
			System.out.print(rotorArr[1].encrypt(rotorArr[2].encrypt(pbn.encrypt(iter.current()))));
			System.out.println();
			
			iter.next();
		}
		System.out.println();		
		System.out.println("in\t>\tpout\t>\tr3in\t>\tr3out\t>\tr2out\t>\tr1out");
		
		iter = new StringCharacterIterator(a);
		
		for(int i = 0; i < 3; i++) {
			rotorArr[i].reset();
		}
		
		while(iter.current() != CharacterIterator.DONE) {
			System.out.print("r1: ");
			if(rotorArr[0].rotate()) {
				System.out.print("r1: True\n");
				System.out.print("r2: ");
				if(rotorArr[1].rotate()) {
					System.out.print("r2: True\n");
					System.out.print("r3: " + rotorArr[2].rotate() + "\n");
					System.out.print("r3: ");
				}
			}
			System.out.print(iter.current() + "\t>\t");
			System.out.print(
					rotorArr[0].encrypt(
							rotorArr[1].encrypt(
									rotorArr[2].encrypt(
											pbn.encrypt(iter.current())))) + "\n");
			iter.next();
		}
		System.out.println();
		System.out.println("in\t>\tpout\t>\tr3in\t>\tr3out\t>\tr2out\t>\tr1out");
		
		iter = new StringCharacterIterator(msg);

		for(int i = 0; i < 3; i++) {
			rotorArr[i].reset();
		}
		
		while(iter.current() != CharacterIterator.DONE) {
			System.out.print("r1: ");
			if(rotorArr[0].rotate()) {
				System.out.print("r1: True\n");
				System.out.print("r2: ");
				if(rotorArr[1].rotate()) {
					System.out.print("r2: True\n");
					System.out.print("r3: " + rotorArr[2].rotate() + "\n");
					System.out.print("r3: ");
				}
			}
			System.out.print(iter.current() + "\t>\t");
			System.out.print(
					rotorArr[0].encrypt(
							rotorArr[1].encrypt(
									rotorArr[2].encrypt(
											pbn.encrypt(iter.current())))) + "\n");
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
		System.out.print(this.pegs.charAt(Plugboard.alpha.indexOf(in)) + "\t>\t");
		return this.pegs.charAt(Plugboard.alpha.indexOf(in));
	}
	
	public char decrypt(char in) {
		return Plugboard.alpha.charAt(this.pegs.indexOf(in));
	}
}

abstract class Rotor{
	private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private int pos, step = 0;
	
	public Rotor(){}

	public Rotor(int pos){
		pos(pos);
	}
	
	public int getPos(){
		return pos;
	}
	
	public void pos(int pos) {
		this.pos = pos;
	}
	
	public void reset() {
		step = 0;
	}
	
	protected abstract char encrypt(char in);
	
	public char encrypt(char in, String left) {
		System.out.print(alpha.charAt((alpha.indexOf(in)+step)%26) + "\t>\t");
		int index = alpha.indexOf((left.charAt((alpha.indexOf(in)+step)%26))-step)%26;
		
		if(index < 0) index = -index;
		
		return alpha.charAt(index);
	}
	
	protected abstract char decrypt(char in);
	
	public char decrypt(char in, String left) {
		return alpha.charAt(left.indexOf(in));
	}
	
	public boolean rotate() {
		if(++step >= 26) {
			step = step%26;
			System.out.println(step);
			return true;
		}

		System.out.println(step);
		return false;
	}
}

class Rotor1 extends Rotor{
	private String left = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
	
	Rotor1(){
		super();
	}
	
	Rotor1(int pos){
		super(pos);
	}
	
	public char encrypt(char in) {
		return super.encrypt(in, this.left);
	}
	
	public char decrypt(char in) {
		return super.decrypt(in, this.left);
	}
}

class Rotor2 extends Rotor{
	private String left = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
	
	Rotor2(){
		super();
	}
	
	Rotor2(int pos){
		super(pos);
	}

	public char encrypt(char in) {
		return super.encrypt(in, this.left);
	}
	
	public char decrypt(char in) {
		return super.decrypt(in, this.left);
	}
}

class Rotor3 extends Rotor{
	private String left = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
	
	Rotor3(){
		super();
	}
	
	Rotor3(int pos){
		super(pos);
	}
	
	public char encrypt(char in) {
		return super.encrypt(in, this.left);
	}
	
	public char decrypt(char in) {
		return super.decrypt(in, this.left);
	}
}

class Rotor4 extends Rotor{
	private String left = "ESOVPZJAYQUIRHXLNFTGKDCMWB";
	
	Rotor4(){
		super();
	}
	
	Rotor4(int pos){
		super(pos);
	}
	
	public char encrypt(char in) {
		return super.encrypt(in, this.left);
	}
	
	public char decrypt(char in) {
		return super.decrypt(in, this.left);
	}
}

class Rotor5 extends Rotor{
	private String left = "VZBRGITYUPSDNHLXAWMJQOFECK";
	
	Rotor5(){
		super();
	}
	
	Rotor5(int pos){
		super(pos);
	}
	
	public char encrypt(char in) {
		return super.encrypt(in, this.left);
	}
	
	public char decrypt(char in) {
		return super.decrypt(in, this.left);
	}
}

class Rotor6 extends Rotor{
	private String left = "VZBRGITYUPSDNHLXAWMJQOFECK";
	
	Rotor6(){
		super();
	}
	
	Rotor6(int pos){
		super(pos);
	}
	
	public char encrypt(char in) {
		return super.encrypt(in, this.left);
	}
	
	public char decrypt(char in) {
		return super.decrypt(in, this.left);
	}
}

class Rotor7 extends Rotor{
	private String left = "VZBRGITYUPSDNHLXAWMJQOFECK";
	
	Rotor7(){
		super();
	}
	
	Rotor7(int pos){
		super(pos);
	}
	
	public char encrypt(char in) {
		return super.encrypt(in, this.left);
	}
	
	public char decrypt(char in) {
		return super.decrypt(in, this.left);
	}
}

class Rotor8 extends Rotor{
	private String left = "VZBRGITYUPSDNHLXAWMJQOFECK";
	
	Rotor8(){
		super();
	}
	
	Rotor8(int pos){
		super(pos);
	}
	
	public char encrypt(char in) {
		return super.encrypt(in, this.left);
	}
	
	public char decrypt(char in) {
		return super.decrypt(in, this.left);
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