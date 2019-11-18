package Ciphers;



import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;

public class AlBhed extends BaseCipher{
	
	private JPanel topPanel;
	
	public AlBhed(){
		super();
		topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		getMainCipherPanel().add(topPanel, BorderLayout.NORTH);
		initializeActionBtn("Encipher");
		setMainCipherPanelText("Encrypt AlBhed");
	}
	
	@Override
	public void actionButtonActionPerformed(ActionEvent evt){
		String msg = getInputText().getText();
		getMainCipherTextArea().setText("");
		String encryptedText = encrypt(msg);
		getMainCipherTextArea().append(encryptedText);
	}
	
	public static String encrypt(String msg) {
		char[] follow= new char[]{'y', 'p', 'l', 't', 'a', 'v', 'k', 'r', 'e', 'z', 'g', 'm', 's', 'h', 'u', 'b', 'x', 'n', 'c', 'd', 'i', 'j', 'f', 'q', 'o', 'w'};
		msg = msg.replaceAll("[^a-zA-Z]+", "");
		msg = msg.toLowerCase();
		String cipher = "";
		int position;
		for (char c : msg.toCharArray()) {
			position = c - 97;
			cipher += follow[position]; 
		}
		return cipher;
	}
	

	public static String decrypt(String msg) {
		char[] follow= new char[]{'y', 'p', 'l', 't', 'a', 'v', 'k', 'r', 'e', 'z', 'g', 'm', 's', 'h', 'u', 'b', 'x', 'n', 'c', 'd', 'i', 'j', 'f', 'q', 'o', 'w'};
		msg = msg.replaceAll("[^a-zA-Z]+", "");
		msg = msg.toLowerCase();
		String cipher = "";
		int position;
		for (char c : msg.toCharArray()) {
			for (int i = 0; i < follow.length; i++) {
				if (c == follow[i]) {
					position = i + 97;
					cipher += (char) position;
				}
			}
		}
		return cipher;
	}
	
	


	
	
/*	public static void main(String[] args) {

		String tester = encrypt("*");
		System.out.println("Begin Equivalence Testing");
		if (tester.equals("")) {
			System.out.println("Passed special character test");
		}
		else {
			System.out.println("Failed special character test");
		}
		tester = encrypt("Hello World");
		if (tester.equals("rammufunmt")) {
			System.out.println("Passed a-z character test");
		}
		else {
			System.out.println("Failed a-z character test");
		}
		tester = encrypt("1");
		if (tester.equals("")) {
			System.out.println("Passed number character test");
		}
		else {
			System.out.println("Failed number character test");
		}
		System.out.println("Begin Decision Table Testing");
		System.out.println("\t\t 1 \t 2 \t 3 \t 4");
		System.out.println("Conditions");
		System.out.println("String \t  \t Yes \t Yes \t No \t No");
		System.out.println("a-z \t \t No \t Yes \t No \t Yes");
		System.out.println("Actions");
		System.out.println("Modify? \t No \t Yes \t No \t No");

	}*/


}
