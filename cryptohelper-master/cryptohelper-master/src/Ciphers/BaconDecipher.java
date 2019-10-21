package Ciphers;

import java.awt.event.ActionEvent;

public class BaconDecipher extends BaseCipher {

    public BaconDecipher(){
        super();
        initializeActionBtn("Perform Bacon Decipher");
    }
    
    
	public String performBaconDecipher(String inputString) {
		String outputString = "";
		char[] inputArray;
		String holder;
		inputArray = inputString.toCharArray();
		if(!inputString.matches("[01]+")){
			outputString = "Only 0 and 1 characters accepted!";
			return outputString;
		}
		for(int i = 0; i < inputArray.length; i = i+5) {
			holder = "";
			holder = inputString.substring(i, i+5);
			switch(holder) {
				case "00001":
					outputString = outputString.concat("a");
					break;
					
				case "00010":
					outputString = outputString.concat("b");
					break;
					
				case "00011":
					outputString = outputString.concat("c");
					break;
					
				case "00100":
					outputString = outputString.concat("d");
					break;
					
				case "00101":
					outputString = outputString.concat("e");
					break;
					
				case "00110":
					outputString = outputString.concat("f");
					break;
					
				case "00111":
					outputString = outputString.concat("g");
					break;
					
				case "01000":
					outputString = outputString.concat("h");
					break;
					
				case "01001":
					outputString = outputString.concat("i");
					break;
					
				case "01010":
					outputString = outputString.concat("j");
					break;
					
				case "01011":
					outputString = outputString.concat("k");
					break;
					
				case "01100":
					outputString = outputString.concat("l");
					break;
					
				case "01101":
					outputString = outputString.concat("m");
					break;
					
				case "01110":
					outputString = outputString.concat("n");
					break;
					
				case "01111":
					outputString = outputString.concat("o");
					break;
					
				case "10000":
					outputString = outputString.concat("p");
					break;
					
				case "10001":
					outputString = outputString.concat("q");
					break;
					
				case "10010":
					outputString = outputString.concat("r");
					break;
					
				case "10011":
					outputString = outputString.concat("s");
					break;
					
				case "10100":
					outputString = outputString.concat("t");
					break;
					
				case "10101":
					outputString = outputString.concat("u");
					break;
					
				case "10110":
					outputString = outputString.concat("v");
					break;
					
				case "10111":
					outputString = outputString.concat("w");
					break;
					
				case "11000":
					outputString = outputString.concat("x");
					break;
					
				case "11001":
					outputString = outputString.concat("y");
					break;
					
				case "11010":
					outputString = outputString.concat("z");
					break;
					
			}
		}
		return outputString;
	}

	@Override
	public void actionButtonActionPerformed(ActionEvent evt) {
		String inputString = getInputText().getText();
		getMainCipherTextArea().setText("");
		inputString = performBaconDecipher(inputString);
		getMainCipherTextArea().append(inputString);
		
	}
	
}
