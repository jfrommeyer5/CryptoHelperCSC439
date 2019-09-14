import java.util.*;
/**
 * This program will take in a keyword and a message, the 
 * keyword will be used to generate the new alphabet and then 
 * the message will be encrypted using the new alphabet.
 * The format of output is five letter blocks with no 
 * punctuation marks.
 * @author Juan Ruiz
 *
 */
public class encryptKW {
	/**
	 * This first method will take the keyword and 
	 * use it to make the new alphabet that will be used.
	 * @param key
	 * @return
	 */
	public static String encoder(char[] key){
		
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
	public static String encipher(String msg, String encoded){
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
	/**
	 * This will serve to get input from user and 
	 * to help show how the message looked like before and
	 * after the encryption.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your keyword: ");
		String key = input.nextLine();
		
		String enc = encoder(key.toCharArray());
		
		System.out.println("Please input the message to encipher: ");
		String msg = input.nextLine();
		
		System.out.println("Message before encipher: "+ msg);
		System.out.println("Message after encipher: " + encipher(msg, enc));
		
	}

}
