package Ciphers;
import java.util.Scanner; 

/*Function to perform a caesar cipher on a string of characters.
 * Required input: 
 * 		-String of characters to be changed, can handle integers and symbols.
 * 		-Integer to provide the shift amount for the cipher.
 * 
 */

public class caesarCipher {

	public static void main(String[] args) {
		System.out.println("Please enter the text to be encrypted: ");
		Scanner scan = new Scanner(System.in);
//Provide input text here (Accepts strings into originalText and converts them to char array)
		String originalText;
		originalText = scan.nextLine();
		char[] originalTextCharArr = originalText.toCharArray(); 
//Provide cipher shift here (Accepts any integer)
		System.out.println("Please enter the amount to shift the cipher: ");
		int shiftAmt = scan.nextInt();
		
		char[] finalTextCharArr = caesarCipherAction(originalTextCharArr, shiftAmt);
		System.out.print(finalTextCharArr);
		scan.close();
	}

	public static char[] caesarCipherAction(char[] originalTextCharArr, int shiftAmt) {
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
				System.out.println(originalTextCharArr[i] + " is a number or symbol!");
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
	
