package Ciphers;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;

public class AlBhedDecrypt extends BaseCipher {
private JPanel topPanel;
	
	public AlBhedDecrypt(){
		super();
		topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		getMainCipherPanel().add(topPanel, BorderLayout.NORTH);
		initializeActionBtn("Decipher");
		setMainCipherPanelText("Decrypt AlBhed");
	}
	
	@Override
	public void actionButtonActionPerformed(ActionEvent evt){
		String msg = getInputText().getText();
		getMainCipherTextArea().setText("");
		String encryptedText = decrypt(msg);
		getMainCipherTextArea().append(encryptedText);
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
	
}
