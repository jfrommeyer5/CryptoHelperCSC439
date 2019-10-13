package Ciphers;
public class DecryptRail {
	public String decipher(String msg, int rails){
		msg = msg.replaceAll("[^a-zA-Z]+", "");
		msg = msg.toUpperCase();
		char[][] rail = new char[rails][(msg.length())];
		String cipher = "";
		for (int i = 0; i < rails; i++) {
			for(int j = 0; j < msg.length(); j++) {
				rail[i][j] = '\n';
			}
		}
		int row = 0;
		int col = 0;
		boolean down = false;
		for (int i = 0; i < msg.length(); i++) {
			if (row == 0)
				down = true;
			if (row == rails-1)
				down = false;
			rail[row][col++] = '*';
			if (down) {
				row++;
			}
			else {
				row--;
			}
		}
		int tracker = 0;
		int count = 1;//count is used to keep track of when a space is needed
		for(int i = 0; i < rails; i++){
			for (int j = 0; j < msg.length(); j++) {
				if (rail[i][j] == '*' && tracker < msg.length()) {
					rail[i][j] = msg.charAt(tracker++);
				}
			}
		}
		
		row = 0;
		col = 0;
		for (int i = 0; i < msg.length(); i++) {
			if (row == 0)
				down = true;
			if (row == rails - 1)
				down = false;
			if (rail[row][col] != '*') {
				count++;
				cipher += rail[row][col++];
			}
			if(count % 6 == 0) {
				cipher += " ";
				count = 1;
			}
			if (down) {
				row++;
			}
			else {
				row--;
			}	
		}
		return cipher;
	}

	public static void main(String[] args) {
		DecryptRail rails = new DecryptRail();
		System.out.println(rails.decipher("OUTMS POUPT IHUBR ADEID TWNEN RS ", 3));
	}
}
