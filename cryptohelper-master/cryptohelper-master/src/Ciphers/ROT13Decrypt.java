package Ciphers;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;

public class ROT13Decrypt extends BaseCipher{
private JPanel topPanel;
	
	public ROT13Decrypt(){
		super();
		topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		getMainCipherPanel().add(topPanel, BorderLayout.NORTH);
		initializeActionBtn("Decipher");
		setMainCipherPanelText("Decrypt ROT13");
	}
	
	@Override
	public void actionButtonActionPerformed(ActionEvent evt){
		String msg = getInputText().getText();
		getMainCipherTextArea().setText("");
		String encryptedText = decrypt(msg);
		getMainCipherTextArea().append(encryptedText);
	}
	
	public static String decrypt(String msg) {
		char[] follow= new char[]{'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'};
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
}
