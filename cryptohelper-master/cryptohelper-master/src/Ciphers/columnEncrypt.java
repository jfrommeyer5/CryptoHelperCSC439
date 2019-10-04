import java.util.*;
/**
 * This program performs the 
 * columnar transposition cipher 
 * to the entered message and uses a letter to 
 * fill the empty space
 * @author juanr
 *
 */
public class columnEncrypt {

	public static String encrypt(String msg, String key, String fill){
		msg = msg.replaceAll("[^a-zA-Z0-9]", "");
		key = key.replaceAll("[^a-zA-Z0-9]", "");
		key = key.toUpperCase();
		char[] msgc = msg.toCharArray();
		char[] keyc = key.toCharArray();
		
		int [] order = getOrder(keyc);
		
		int col = key.length();
		int row = (int) Math.ceil((double) msg.length()/col);
		
		char [][] grid = new char[row][col];
		int c = 0;
		String enc = "";
		for(int i = 0 ; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){
				if(c == msg.length()){
					grid[i][j] = fill.charAt(0);
					c--;
				}
				else{
					grid[i][j] = msg.charAt(c);
				}
				c++;
			}
			
		}
		int count = 0;
		for(int i = 0; i < order.length; i++){
			for(int j = 0; j < grid.length; j++){
				enc += grid[j][order[i]];
				count++;
				if(count % 5 == 0){
					enc+= " ";
				}
			}
		}
		
		
		return enc.toUpperCase();
	}
	
	public static int[] getOrder(char[] key){
		char[] oKey = new char[key.length];
		for(int i = 0; i < key.length; i++){
			oKey[i] = key[i];
		}
		Arrays.sort(key);
		boolean[] ifChecked = new boolean[oKey.length];
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
		//long messages 
		//keywords with double letters
		//making sure it works
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please input your keyword: ");
		String k = in.nextLine();
		System.out.println("Please input your message: ");
		String m = in.nextLine();
		System.out.println("Please input your fill character: ");
		String f = in.next();
		
		System.out.println("Your message before encryption: "+ m.toUpperCase());
		System.out.println("Your message after encryption: "+ encrypt(m,k,f));
		
	}

}
