package Ciphers;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;

/*Function to perform a caesar cipher on a string of characters.
 * Required input: 
 * 		-String of characters to be changed, can handle integers and symbols.
 * 		-Integer to provide the shift amount for the cipher.
 * 
 */

public class caesarCipher extends BaseCipher {

	private JPanel topPanel;
	private JLabel keywordInput;
	private JSpinner cipherShift;
	

	public caesarCipher(){
		super();
		topPanel = new JPanel();
		keywordInput = new JLabel();
		SpinnerModel model =
		        new SpinnerNumberModel(0, //initial value
		                               Integer.MIN_VALUE, //min
		                               Integer.MAX_VALUE, //max
		                               1); 
		cipherShift = new JSpinner(model);
		topPanel.setLayout(new BorderLayout());
		keywordInput.setText("Shift Amount");
		
		topPanel.add(keywordInput, BorderLayout.WEST);
		
		topPanel.add(cipherShift, BorderLayout.CENTER);
		getMainCipherPanel().add(topPanel, BorderLayout.NORTH);
		
		initializeActionBtn("Decipher");
	}
	
	public void actionButtonActionPerformed(ActionEvent evt){
		char[] msg = getInputText().getText().toCharArray();
		int key = (int) cipherShift.getValue();
		getMainCipherTextArea().setText("");
		
		
		
		char[] cipheredText = caesarCipherAction(msg, key);
		String finalText = new String(cipheredText);
		getMainCipherTextArea().append(finalText);
	}
	
	public static char[] caesarCipherAction(char[] originalTextCharArr, int shiftAmt) {
		System.out.print(originalTextCharArr);
for(int i = 0; i < originalTextCharArr.length; i++) {
			
			//Handle Lower Case Characters
			if( originalTextCharArr[i] >= 97 && originalTextCharArr[i] <= 122) {
				//Handle low-end lower case wrap around
				if ((originalTextCharArr[i] + shiftAmt) < 97) {
					while((originalTextCharArr[i] + shiftAmt) < 97) {
					originalTextCharArr[i] = (char) (originalTextCharArr[i] + 26);
					}
					originalTextCharArr[i] = (char) (originalTextCharArr[i] + shiftAmt);
				}
				//Handle high-end lower case wrap around
				else if((originalTextCharArr[i] + shiftAmt) > 122) {
					while((originalTextCharArr[i] + shiftAmt) > 122) {
						originalTextCharArr[i] = (char) (originalTextCharArr[i] - 26);
						}
					originalTextCharArr[i] = (char) (originalTextCharArr[i] + shiftAmt);
				}
				//Perform shift if no wrap-around was needed
				else {
					originalTextCharArr[i] = (char) (originalTextCharArr[i] + shiftAmt);
				}
			}
			//Handle Upper Case Characters
			else if( originalTextCharArr[i] >= 65 && originalTextCharArr[i] <= 90) {
				
				//Handle low-end upper case wrap around
				if ((originalTextCharArr[i] + shiftAmt) < 65) {
					while((originalTextCharArr[i] + shiftAmt) < 65) {
					originalTextCharArr[i] = (char) (originalTextCharArr[i] + 26);
					}
					originalTextCharArr[i] = (char) (originalTextCharArr[i] + shiftAmt);
				}
				
				//Handle high-end upper case wrap around
				else if((originalTextCharArr[i] + shiftAmt) > 90) {
					while((originalTextCharArr[i] + shiftAmt) > 90) {
						originalTextCharArr[i] = (char) (originalTextCharArr[i] - 26);
						}
					originalTextCharArr[i] = (char) (originalTextCharArr[i] + shiftAmt);
				}
				//Perform shift if no wrap-around was needed
				else {
					originalTextCharArr[i] = (char) (originalTextCharArr[i] + shiftAmt);
				}
			}
			else {
				
			}
			
		}
		//Print out the array properly formatted
		char[] finalTextCharArr = new char[(originalTextCharArr.length + (originalTextCharArr.length / 5))];
		for(int i = 0; i < (originalTextCharArr.length / 5) + 1; i++) {
			for(int x = (i * 5); x < originalTextCharArr.length && x <= ((i * 5) + 4); x++) {
				finalTextCharArr[x+i] = originalTextCharArr[x];
				if((x+i+1) < finalTextCharArr.length)
				finalTextCharArr[(x+i+1)] = ' ';
			}
		}
		return finalTextCharArr;
	}
}
	
