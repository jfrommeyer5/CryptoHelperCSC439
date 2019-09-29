import java.util.*;
/**
 * This program will take in cipher text 
 * for the columnar cipher to get the 
 * plaintext or message.
 * @author juanr
 *
 */
public class columnDecrypt {

	public static String decrypt(String msg, String key){
		msg = msg.replaceAll("[^a-zA-Z0-9]", "");
		key = key.replaceAll("[^a-zA-Z0-9]", "");
		key = key.toUpperCase();
		
		char[] msgc = msg.toCharArray();
		char[] keyc = key.toCharArray();
		
		int [] order = getOrder(keyc);
		int col = key.length();
		int row = (int) Math.ceil((double)msg.length()/col);
		
		char [][] grid = new char[row][col];
		String dec = "";
		int c = 0;
		for(int i = 0; i < order.length; i++){
			for(int j = 0; j <grid.length; j++){
				grid[j][order[i]] = msg.charAt(c);
				c++;
			}
		}
		int count = 0;
		for(int k = 0; k < grid.length; k++){
			for(int l = 0; l <grid[k].length; l++){
				dec += grid[k][l];
				count++;
				if(count % 5 == 0){
					dec += " ";
				}
			}
		}
		return dec.toUpperCase();
	}
	public static int[] getOrder(char[] key){
		char[] oKey = new char[key.length];
		for(int i = 0; i < key.length; i++){
			oKey[i] = key[i];
		}
		Arrays.sort(key);
		boolean[] ifChecked  = new boolean[oKey.length];
		int[] order = new int[key.length];
		for(int j = 0; j < oKey.length; j++){
			for(int k = 0; k < key.length; k++){
				if(key[j] == oKey[k] && ifChecked[k] == false){
					order[j] = k;
					ifChecked[k] = true;
					break;
				}
			}
		}
		return order;
	}
	//testing cases
	//making sure it works
	//for any cipher text
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input your keyword: ");
		String k = in.nextLine();
		System.out.println("Please input your message: ");
		String m = in.nextLine();
		
		System.out.println("Your message before decryption: "+ m.toUpperCase());
		System.out.println("Your message after decryption: "+ decrypt(m,k));
	}

}
