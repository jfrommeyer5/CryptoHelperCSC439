import java.util.Scanner;

/**
 * This program takes in a string from the user and encrypts it to pig latin.
 * The "rules" for changing each word are:
 * If the word begins with a consonant, move all letters until the first vowel to the end of the word and add -ay.
 * If the word begins with a vowel, simply add -way to the end of the word.
 * @author Cody Esmeier
 */

public class encryptPL {
	/**
	 * This method takes in a string, splits the given string into individual words, then carries out the Pig Latin rules for each word.
	 * Special characters, as well as numbers, are ignored.
	 * @param msg
	 * @return cipher
	 */
	public static String encipher(String msg) {
		String[] words = msg.split(" ");
		String cipher = "";
		int j = 0;
		int firstVowel = 0;
		char ch;
		String a, b;
		for (String word : words) {
			//Filter out any special characters besides whitespace
			word = word.replaceAll("[^a-zA-Z0-9_ ]", "");
			word = word.toUpperCase();
			
			if (word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O") || word.startsWith("U")) 
				cipher += word + "-WAY ";
			
			//Otherwise, it starts with a consonant. 
			else {
					//If the word has no vowels, keep as is-- just adding -ay.
				if (!(word.contains("A") || word.contains("E") || word.contains("I") || word.contains("O") || word.contains("U") || word.contains("Y"))) {
					cipher += word + "-AY ";
				}
				else {
					for (j = 0; j < word.length(); j++) {
						ch = word.charAt(j);
						if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || (ch == 'Y' && j != 0)) {
							firstVowel = j;
							break;
						}
					}
					a = word.substring(firstVowel);
					b = word.substring(0, firstVowel);
					cipher += a + "-" + b + "AY ";
				}
				}
		}
		return cipher;
	}
	/**
	 * Get input from user and translate to Pig Latin
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input to change to Pig Latin: ");
		String msg = input.nextLine();
		
		
		System.out.println("Message before translation: "+ msg);
		System.out.println("Message after translation: " + encipher(msg));
		
	}

}