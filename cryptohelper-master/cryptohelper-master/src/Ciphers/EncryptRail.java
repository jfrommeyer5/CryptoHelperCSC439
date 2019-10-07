package Ciphers;
public class EncryptRail {
	public String encipher(String msg, int rails){
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
			if (row == 0 || row == rails - 1)
				down = !down;
			rail[row][col++] = msg.charAt(i);
			if(down) {
				row++;
			}
			else {
				row--;
			}
		}
		int count = 1;//count is used to keep track of when a space is needed
		for(int i = 0; i < rails; i++){
			for (int j = 0; j < msg.length(); j++) {
				if (rail[i][j] != '\n') {
					count++;
					cipher += rail[i][j];
				}
				if(count % 6 == 0) {
					cipher += " ";
					count = 1;
				}
			}
			
		}
		return cipher;
	}
	public static void main(String[] args){
		EncryptRail railme = new EncryptRail();
		System.out.println(railme.encipher("Output with nu43mbers and pe.riods", 3));
	}
}
