package Ciphers;

import java.awt.event.ActionEvent;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class Enigma extends BaseCipher{

	public static void main(String[] args) {
		Plugboard pbr = new Plugboard("ZYXWVUTSRQPONMLKJIHGFEDCBA");
		Plugboard pbn = new Plugboard();
		//Plugboard pbe = new Plugboard("AABCDEFGHIJKLMNOPQRSTUVWXVZ");
		Reflector rf = new ReflectorB();
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

		System.out.println("in\t>\tpin\t>\tpout\t>\tr1in\t>\tr1out\t>\trt\t>\tr2int\t>\tr2out\t>\trt\t>\tr3in\t>\tr3out\t>\trein\t>\treout\t>\tr3in\t>\tr3out\t>\trt\t>\tr2in\t>\tr2out\t>\trt\t>\tr1in\t>\tr1out\t>\trt\t>\tpin\t>\tpout\t>\tout");

		CharacterIterator iter = new StringCharacterIterator(a);

		while(iter.current() != CharacterIterator.DONE) {
			if(rotorArr[0].rotate()) {
				if(rotorArr[1].rotate()) {
					rotorArr[2].rotate();
				}
			}
			System.out.print(iter.current() + "\t>\t");
			System.out.print(
					pbn.encrypt(
							rotorArr[0].decrypt(
									rotorArr[1].decrypt(
											rotorArr[2].decrypt(
													rf.encrypt(
															rotorArr[2].encrypt(
																	rotorArr[1].encrypt(
																			rotorArr[0].encrypt(
																					pbn.encrypt(
																							iter.current()))))))))) + "\n");
			iter.next();
		}
		System.out.println();
		//System.out.println("in\t>\tpout\t>\tr3in\t>\tr3out\t>\tr2out\t>\tr1out");

		iter = new StringCharacterIterator(msg);

		for(int i = 0; i < 3; i++) {
			rotorArr[i].reset();
		}

		while(iter.current() != CharacterIterator.DONE) {
			if(rotorArr[0].rotate()) {
				if(rotorArr[1].rotate()) {
					rotorArr[2].rotate();
				}
			}
			System.out.print(iter.current() + "\t>\t");
			System.out.print(
					pbn.encrypt(
							rotorArr[0].decrypt(
									rotorArr[1].decrypt(
											rotorArr[2].decrypt(
													rf.encrypt(
															rotorArr[2].encrypt(
																	rotorArr[1].encrypt(
																			rotorArr[0].encrypt(
																					pbn.encrypt(
																							iter.current()))))))))) + "\n");
			iter.next();
		}
	}

	@Override
	public void actionButtonActionPerformed(ActionEvent evt) {
		//String input = getInputText().getText();
	}
}

class Plugboard{
	private String pegs;
	private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	Plugboard(String pegs) {
		this.pegs = pegs;
		try {
			if(pegs.length() > 26)
				throw new Exception();
		}catch(Exception e) {
			System.out.println("Pegs string is too long. Pegs trimmed letters from the end down to a length of 26.");
			this.pegs = this.pegs.substring(0, 25);
		}

		try {
			for(int i = 1; i < pegs.length(); i++)
				for(int j = 0; j < i; j++)
					if(pegs.charAt(i) == pegs.charAt(j))
						throw new Exception();
		}catch(Exception e) {
			System.out.println("Repeat letters in the pegs string. Pegs defaulted to alphabetical order.");
			this.pegs = Plugboard.alpha;
		}
	}

	Plugboard(){
		this.pegs = Plugboard.alpha;
	}

	public char encrypt(char in) {
		System.out.print(in + "\t>\t" + this.pegs.charAt(Plugboard.alpha.indexOf(in)) + "\t>\t"); //pin > pout
		return this.pegs.charAt(Plugboard.alpha.indexOf(in));
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
		System.out.print(alpha.charAt((alpha.indexOf(in)+step)%26) + "\t>\t"); //rin
		System.out.print(left.charAt((alpha.indexOf(in)+step)%26) + "\t>\t"); //rout
		int index = alpha.indexOf((left.charAt((alpha.indexOf(in)+step)%26))-step)%26;

		if(index < 0) index = -index;
		System.out.print(alpha.charAt(index) + "\t>\t"); //rt

		return alpha.charAt(index);
	}

	protected abstract char decrypt(char in);

	public char decrypt(char in, String left) {
		System.out.print(alpha.charAt((alpha.indexOf(in)+step)%26) + "\t>\t"); //rin
		System.out.print(alpha.charAt(left.indexOf(alpha.charAt((alpha.indexOf(in)+step)%26))) + "\t>\t"); //rout
		int index = left.indexOf((alpha.charAt((alpha.indexOf(in)+step)%26))-step)%26;
		
		if(index < 0) index = -index;
		System.out.print(alpha.charAt(index) + "\t>\t"); //rt
		
		return alpha.charAt(index);
	}

	public boolean rotate() {
		if(++step >= 26) {
			step = step%26;
			return true;
		}
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

abstract class Reflector{
	private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	Reflector(){};

	public char encrypt(char in, String out) {
		System.out.print(out.charAt(Reflector.alpha.indexOf(in)) + "\t>\t");
		return out.charAt(Reflector.alpha.indexOf(in));
	}

	protected abstract char encrypt(char in);
}

class ReflectorB extends Reflector{
	private String out = "YRUHQSLDPXNGOKMIEBFZCWVJAT";

	ReflectorB(){
		super();
	}

	public char encrypt(char in) {
		return super.encrypt(in, out);
	}
}

class ReflectorC extends Reflector{
	private String out = "FVPJIAOYEDRZXWGCTKUQSBNMHL";

	ReflectorC(){
		super();
	}

	public char encrypt(char in) {
		return super.encrypt(in, out);
	}
}