package Ciphers;

import java.awt.event.ActionEvent;

public class PlayfairEncipher extends BaseCipher {

    public PlayfairEncipher(){
        super();
        initializeActionBtn("Perform Playfair Encipher");
    }

	@Override
	public void actionButtonActionPerformed(ActionEvent evt) {
		String inputString = getInputText().getText();
		getMainCipherTextArea().setText("");
		inputString = performPlayfairEncipher(inputString);
		getMainCipherTextArea().append(inputString);
		
	}

	private String performPlayfairEncipher(String inputString) {
		char[] inputCharArr;
		char[] outputCharArr;
		char[][] keySquare = { 			//declare KeySquare (NOTE: Key Square used is weak but simple for ease of testing and implementation
				{'a','b','c','d','e'},
				{'f','g','h','i','k'},
				{'l','m','n','o','p'},
				{'q','r','s','t','u'},
				{'v','w','x','y','z'},
				};
		inputString = inputString.replaceAll("[^a-zA-Z]", ""); //remove Special Charaters from input String.
		inputString = inputString.toLowerCase();
		if( inputString.length() % 2  == 0) {		//ensure that the new char arr is of even length
			inputCharArr = inputString.toCharArray();
		}
		else
		{
			inputCharArr = (inputString.concat("x")).toCharArray();
		}
			//Convert input string to Char Arr for manipulation/comparison of chars
		for(int i = 1; inputCharArr.length > i; i++) {	//change all duplicate letters to x (ex. humming -> humxing) known bug if xx occurs that it will not be enciphered.
			if(inputCharArr[i-1] == inputCharArr[i])
				inputCharArr[i] = 'x';
		}
		outputCharArr = inputCharArr.clone();
		for(int i = 0; inputCharArr.length > i; i= i+2)
		{
			int colA = 0, rowA = 0, colB = 0, rowB = 0;
			while(rowA < 5 && rowB < 5)
			{ 
				while(colA < 5 && colB < 5)
				{
					if(keySquare[rowA][colA] != inputCharArr[i])
					{
						colA++;
					}
					if(keySquare[rowB][colB] != inputCharArr[i+1])
					{
						colB++;
					}
					else {
					if((colA < 5 && colB < 5) && keySquare[rowB][colB] == inputCharArr[i+1] && keySquare[rowA][colA] == inputCharArr[i])
					{
						if(keySquare[rowB][colB] == inputCharArr[i+1] && keySquare[rowA][colA] == inputCharArr[i] && (colA < 5 && colB < 5))
						{
							if(rowA != rowB && colA != colB) { //handle first case, take comparable corners of keySquare
							outputCharArr[i] = keySquare[rowA][colB];
							outputCharArr[i+1] = keySquare[rowB][colA];
							}
							if(rowA == rowB && colA != colB) {	////handle second case, take take immediate right chars
								if(colA+1 < 5) {
									if(colB+1 < 5) {
										outputCharArr[i] = keySquare[rowA][colA+1];
										outputCharArr[i+1] = keySquare[rowB][colB+1];
									}
									else{
										outputCharArr[i] = keySquare[rowA][colA+1];
										outputCharArr[i+1] = keySquare[rowB][0];
									}
								}
								else {
									if(colB+1 < 5) {
										outputCharArr[i] = keySquare[rowA][0];
										outputCharArr[i+1] = keySquare[rowB][colB+1];
									}
									else{
										outputCharArr[i] = keySquare[rowA][0];
										outputCharArr[i+1] = keySquare[rowB][0];
									}
								}
							}
							if(colA == colB && rowA != rowB) {	////handle second case, take take immediate right chars
								if(rowA+1 < 5) {
									if(rowB+1 < 5) {
										outputCharArr[i] = keySquare[rowA+1][colA];
										outputCharArr[i+1] = keySquare[rowB+1][colB];
									}
									else{
										outputCharArr[i] = keySquare[rowA+1][colA];
										outputCharArr[i+1] = keySquare[0][colB];
									}
								}
								else {
									if(rowB+1 < 5) {
										outputCharArr[i] = keySquare[0][colA];
										outputCharArr[i+1] = keySquare[rowB+1][colB];
									}
									else{
										outputCharArr[i] = keySquare[0][colA];
										outputCharArr[i+1] = keySquare[0][colB];
									}
								}
							}
							colA = 5;
							colB = 5;
							break;
						}

					}
					}
				}
				if(colA >= 5)
				{
					rowA++;
					colA = 0;
				}
				if(colB >= 5)
				{
					rowB++;
					colB = 0;
				}

			}
		}
		String returnString = new String(outputCharArr);
		return returnString;
	}
	
}
