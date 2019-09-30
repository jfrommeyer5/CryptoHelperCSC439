package Ciphers;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * This program takes in a string from the user (assuming it went through the included Pig Latin encipher) and translates Pig Latin to English.
 * If the word begins with a consonant, move all letters until the first vowel to the end of the word and add -ay.
 * If the word begins with a vowel, simply add -way to the end of the word.
 * To translate back, the opposite is done. Words that could be exceptions to the translation have slashes to what each word could be.
 * @author Cody Esmeier
 */

public class decryptPL extends BaseCipher { 

	private JPanel topPanel;
	
	public decryptPL(){
		super();
		topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		getMainCipherPanel().add(topPanel, BorderLayout.NORTH);
		initializeActionBtn("Decipher");
	}

	@Override
	public void actionButtonActionPerformed(ActionEvent evt){
		String msg = getInputText().getText();
		getMainCipherTextArea().setText("");
		String encryptedText = decipher(msg);
		getMainCipherTextArea().append(encryptedText);
	}
	/**
	 * This method takes in a string, splits the given string into individual words, then carries out the Pig Latin to English rules for each word.
	 * Special characters, as well as numbers, are ignored.
	 * @param msg
	 * @return cipher
	 */
	public static String decipher(String msg) {
		String[] words = msg.split(" ");
		String cipher = "";
		int position = -1;
		String a, b;
		ArrayList<String> records = new ArrayList<String>();
		  try
		  {
		    BufferedReader reader = new BufferedReader(new FileReader("exceptionlist.txt"));
		    String line;
		    while ((line = reader.readLine()) != null)
		    {
		      records.add(line);
		    }
		    reader.close();
		   
		  }
		  catch (Exception e)
		  {
		    System.err.format("Exception occurred trying to read");
		    e.printStackTrace();
		  }
		
		for (String word : words) {
			//Find where the "pig latin" syllable begins
			position = word.indexOf('-');
			if (position != -1) {
				//A is the pig latin syllable, B is the English syllables
				a = word.substring(position + 1, word.length());
				b = word.substring(0, position);
				if ((!a.equalsIgnoreCase("AY") && !a.equalsIgnoreCase("WAY"))) {
					a = a.substring(0, a.length() - 2);
					cipher += a + b + " ";
					//Vowel Case
				} else if (a.equalsIgnoreCase("WAY")) {
					if (records.toString().contains("W" + b)) {
						cipher += b + "/W" + b + " ";
					}
					else {
						cipher += "W" + b + " ";
					}
				} else {
					cipher += b + " ";
					}
			}
		}
		
		return cipher;
	}
}
