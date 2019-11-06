package Ciphers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class encryptKW extends BaseCipher{

	private JPanel topPanel;
	private JTextField keywordArea;
	private JLabel keywordInput;

	public encryptKW(){
		super();
		topPanel = new JPanel();
		keywordArea = new JTextField();
		keywordInput = new JLabel();

		topPanel.setLayout(new BorderLayout());
		keywordInput.setText("Keyword");
		
		topPanel.add(keywordInput, BorderLayout.WEST);
		keywordArea.setFont(new Font("Monospaced", 0, 12));
		
		topPanel.add(keywordArea, BorderLayout.CENTER);
		getMainCipherPanel().add(topPanel, BorderLayout.NORTH);
		
		initializeActionBtn("Encipher");
		setMainCipherPanelText("Encrypt Keyword");
	}
	
	@Override
	public void actionButtonActionPerformed(ActionEvent evt){
		String msg = getInputText().getText();
		String key = keywordArea.getText();
		getMainCipherTextArea().setText("");
		
		char[] keyIn = key.toCharArray();
		
		String enc = encoder(keyIn);
		
		String encryptedText = encipher(msg, enc);
		
		getMainCipherTextArea().append(encryptedText);

		String usr = System.getProperty("user.name");

		try (PrintWriter out = new PrintWriter("C:\\Users\\" + usr + "\\Desktop\\EncryptKeyWord.txt")) {
			out.println(getMainCipherTextArea().getText());
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
	}
	/**
	 * This first method will take the keyword and 
	 * use it to make the new alphabet that will be used.
	 * @param key
	 * @return
	 */
	public String encoder(char[] key){
		
		//this will be where the new alphabet is stored
		String encoded = ""; 
		
		//This will help in managing which letters 
		//have been used and which have not
		boolean[] alpha = new boolean[26];
		
		for(int i = 0; i < key.length; i++){
			
			if(key[i]>= 'A' && key[i] <= 'Z'){ //if the keyword has a capital letter
				if(alpha[key[i] - 65] == false){
					encoded += (char) key[i];
					alpha[key[i] - 65] = true;
				}
			}
			
			else if(key[i] >= 'a' && key[i] <='z'){//if the keyword has a lowercase letter
				if(alpha[key[i]- 97] == false){
					encoded += (char) (key[i] - 32);
					alpha[key[i] - 97] = true;
					
				}
			}
		}
		//This will fill in the rest of the 
		//alphabet that has not been used
		for(int i = 0; i < 26; i++){
			if( alpha[i] == false){
				alpha[i] = true;
				encoded += (char) (i + 65);
			}
		}
		return encoded;
		
	}
	/**
	 * This method will use the new 
	 * alphabet and encipher the message.
	 * @param msg
	 * @param encoded
	 * @return
	 */
	public String encipher(String msg, String encoded){
		String cipher = ""; 
		int count = 0;//count is used to keep track of when a space is needed
		
		//Uses the same logic as before, except
		//when a number is found it will just attach it 
		//with no encryption. It will also ignore special characters
		for(int i = 0; i < msg.length(); i++){
			if(msg.charAt(i) >= 'a' && msg.charAt(i)<= 'z'){
				int pos = msg.charAt(i) - 97;
				cipher += encoded.charAt(pos);
				count++;
				if(count % 5 == 0){
					cipher += " ";
				}
			}
			else if(msg.charAt(i) >= 'A' && msg.charAt(i) <= 'Z'){
				int pos = msg.charAt(i) - 65;
				cipher += encoded.charAt(pos);
				count++;
				if(count  % 5 == 0){
					cipher += " ";
				}
			}
			else if(msg.charAt(i) >= 48 && msg.charAt(i) <= 57){
				cipher += msg.charAt(i);
				count++;
				if(count % 5 == 0){
					cipher += " ";
				}
			}
			
			
		}
		return cipher;
		
		
	}
	public String getTextKeyArea(){
		return keywordArea.getText();
	}
	public void setTextKeyArea(String txt){
		keywordArea.setText(txt);
	}
}
