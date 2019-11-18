package Ciphers;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;

public class ROT13Encrypt extends BaseCipher{
private JPanel topPanel;
	
	public ROT13Encrypt(){
		super();
		topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		getMainCipherPanel().add(topPanel, BorderLayout.NORTH);
		initializeActionBtn("Encipher");
		setMainCipherPanelText("Encrypt ROT13");
	}
	
	@Override
	public void actionButtonActionPerformed(ActionEvent evt){
		String msg = getInputText().getText();
		getMainCipherTextArea().setText("");
		String encryptedText = encrypt(msg);
		getMainCipherTextArea().append(encryptedText);
	}
	
	public static String encrypt(String msg) {
		char[] follow= new char[]{'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'};
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
}
