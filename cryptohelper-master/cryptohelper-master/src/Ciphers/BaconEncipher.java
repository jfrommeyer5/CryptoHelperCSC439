package Ciphers;

import java.awt.event.ActionEvent;
import java.util.Scanner;

public class BaconEncipher extends BaseCipher {

    public BaconEncipher(){
        super();
        initializeActionBtn("Perform Bacon Encipher");
    }
    
    
	public String performBaconCipher(String inputString) {
		String outputString = "";
		char[] inputArray;
		inputArray = inputString.toCharArray();
		if(!inputString.matches("[a-zA-Z ]+")){
			outputString = "Only a-z or A-Z and space characters accepted!";
			return outputString;
		}

		for(int i = 0; i < inputArray.length; i++) {
			switch(inputArray[i]) {
				case 'a':
				case 'A':
					outputString = outputString.concat("00001");
					break;
					
				case 'b':
				case 'B':
					outputString = outputString.concat("00010");
					break;
					
				case 'c':
				case 'C':
					outputString = outputString.concat("00011");
					break;
					
				case 'd':
				case 'D':
					outputString = outputString.concat("00100");
					break;
					
				case 'e':
				case 'E':
					outputString = outputString.concat("00101");
					break;
					
				case 'f':
				case 'F':
					outputString = outputString.concat("00110");
					break;
					
				case 'g':
				case 'G':
					outputString = outputString.concat("00111");
					break;
					
				case 'h':
				case 'H':
					outputString = outputString.concat("01000");
					break;
					
				case 'i':
				case 'I':
					outputString = outputString.concat("01001");
					break;
					
				case 'j':
				case 'J':
					outputString = outputString.concat("01010");
					break;
					
				case 'k':
				case 'K':
					outputString = outputString.concat("01011");
					break;
					
				case 'l':
				case 'L':
					outputString = outputString.concat("01100");
					break;
					
				case 'm':
				case 'M':
					outputString = outputString.concat("01101");
					break;
					
				case 'n':
				case 'N':
					outputString = outputString.concat("01110");
					break;
					
				case 'o':
				case 'O':
					outputString = outputString.concat("01111");
					break;
					
				case 'p':
				case 'P':
					outputString = outputString.concat("10000");
					break;
					
				case 'q':
				case 'Q':
					outputString = outputString.concat("10001");
					break;
					
				case 'r':
				case 'R':
					outputString = outputString.concat("10010");
					break;
					
				case 's':
				case 'S':
					outputString = outputString.concat("10011");
					break;
					
				case 't':
				case 'T':
					outputString = outputString.concat("10100");
					break;
					
				case 'u':
				case 'U':
					outputString = outputString.concat("10101");
					break;
					
				case 'v':
				case 'V':
					outputString = outputString.concat("10110");
					break;
					
				case 'w':
				case 'W':
					outputString = outputString.concat("10111");
					break;
					
				case 'x':
				case 'X':
					outputString = outputString.concat("11000");
					break;
					
				case 'y':
				case 'Y':
					outputString = outputString.concat("11001");
					break;
					
				case 'z':
				case 'Z':
					outputString = outputString.concat("11010");
					break;
					
				case ' ':
					outputString = outputString.concat("");
				break;
			}
		}
		return outputString;
	}

	@Override
	public void actionButtonActionPerformed(ActionEvent evt) {
		String inputString = getInputText().getText();
		getMainCipherTextArea().setText("");
		inputString = performBaconCipher(inputString);
		getMainCipherTextArea().append(inputString);
		
	}
	
}
