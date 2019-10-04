package Ciphers;


import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class decryptKW extends BaseCipher {

	private JPanel topPanel;
	private JTextField keywordArea;
	private JLabel keywordInput;
	
	public decryptKW(){
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
		
		initializeActionBtn("Decipher");
	}
	
	@Override
	public void actionButtonActionPerformed(ActionEvent evt){
		String msg = getInputText().getText();
		String key = keywordArea.getText();
		getMainCipherTextArea().setText("");
		
		char[] keyIn = key.toCharArray();
		
		String enc = encoder(keyIn);
		
		String decryptedText = decipher(msg, enc);
		
		getMainCipherTextArea().append(decryptedText);
	}
	
	/**
	 * This will work similarly to the encoder that is in 
	 * the encryptKW class
	 * @param key
	 * @return
	 */
	public String encoder(char[] key){
		String encoded = ""; 
		boolean[] alpha = new boolean[26];
		
		//This will match up characters,
		//even if it is lowercase or uppercase
		for(int i = 0; i < key.length; i++){
			
			if(key[i]>= 'A' && key[i] <= 'Z'){
				if(alpha[key[i] - 65] == false){
					encoded += (char) key[i];
					alpha[key[i] - 65] = true;
				}
				
			}
			
			else if(key[i] >= 'a' && key[i] <='z'){
				if(alpha[key[i]- 97] == false){
					encoded += (char) (key[i] - 32);
					alpha[key[i] - 97] = true;
					
				}
			}
		}
		
		//This handles the rest of the alphabet 
		//after the keyword.
		for(int i = 0; i < 26; i++){
			if( alpha[i] == false){
				alpha[i] = true;
				encoded += (char) (i + 65);
			}
		}
		return encoded;
		
	}
	
	/**
	 * This will decipher an encrypted message, 
	 * by using the new alphabet that was generated
	 * @param msg
	 * @param encoded
	 * @return
	 */
	public String decipher(String msg, String encoded){
			//Here a hash map is utilized in order to make it simple to 
			//find the character needed in the encoded alphabet
			Map<Character, Integer> enc = new HashMap<Character, Integer>();
			String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//the regular alphabet is used to decipher the message
			
			//This will store the encoded alphabet 
			//and match it up with the corresponding position
			for(int i = 0; i < encoded.length(); i++ ){
				enc.put(encoded.charAt(i), i);
			}
			//Count is used in order to 
			//determine where the spaces 
			//will go in the message
			String plaintext = "";
			int count = 0;
			
			//The same logic that was used in encoder is used
			//except it uses the map to find the corresponding 
			//letter in the encoded alphabet and then finds 
			//the regular alphabet letter and adds it to the plaintext 
			for(int i = 0; i < msg.length(); i++){
				if(msg.charAt(i) >='a' && msg.charAt(i)<= 'z'){
					int pos = enc.get(msg.charAt(i) - 32);
					plaintext += alpha.charAt(pos);
					count++;
					if(count % 5 == 0){
						plaintext += " ";
					}
				}
				else if(msg.charAt(i) >= 'A' && msg.charAt(i) <= 'Z'){
					int pos = enc.get(msg.charAt(i));
					plaintext += alpha.charAt(pos);
					count++;
					if(count % 5 == 0){
						plaintext += " ";
					}
				
				}
				else if(msg.charAt(i) >= 48 && msg.charAt(i) <= 57){
					plaintext += msg.charAt(i);
					if(count % 5 == 0){
						plaintext += " ";	
					}
				}
			}
			return plaintext;
			
	}

}

