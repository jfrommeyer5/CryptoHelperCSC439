package Ciphers;

import java.awt.event.ActionEvent;
import java.util.*;

public class hillEncrypt extends BaseCipher {
	private  Map <Integer, Character> numToAlpha;
	private  Map <Character, Integer> alphaToNum;
	private Key k;
	
	public hillEncrypt(){
		super();
		initializeActionBtn("Encipher");
		setMainCipherPanelText("Hill Encrypt");
	}
	
	@Override
	public void actionButtonActionPerformed(ActionEvent evt){
		getMainCipherTextArea().setText("");
		String msg = getInputText().getText();
		String e = encrypt(msg);
		getMainCipherTextArea().append("Your Key:\n");
		int [][] key = k.getKey();
		for(int i = 0; i < key.length; i++){
			for(int j = 0; j < key[0].length; j++){
				getMainCipherTextArea().append(Integer.toString(key[i][j]) + " ");
			}
		}
		getMainCipherTextArea().append("\n");
		getMainCipherTextArea().append(e);
		
	}
	public String encrypt(String msg){
		k = new Key();
		initNumToAlpha();
		initAlphaToNum();
		msg = msg.replaceAll("[^a-zA-Z]", "");
		
		if(msg.length() % 2 != 0){
			msg += "x";
		}
		msg = msg.toUpperCase();
		char [] msgC = msg.toCharArray();
		int col = msgC.length / 2;
		char[][] msgCMatrix = new char [2][col];
		int [][] msgIMatrix = new int [2][col];
		int [][] key = k.getKey();
		
		int c = 0;
		for(int i = 0; i <msgCMatrix[0].length ; i++){
			for(int j = 0; j < msgCMatrix.length ; j++){
				msgCMatrix[j][i] = msgC[c];
				c++;
			}
		}
		for(int i = 0 ; i < msgIMatrix.length; i++){
			for(int j = 0; j < msgIMatrix[0].length; j++){
				msgIMatrix[i][j] = alphaToNum.get(msgCMatrix[i][j]);
			}
		}
		
		int[][] encMsg = matrixMult(key, msgIMatrix);
		for(int i = 0 ; i < msgCMatrix.length; i++){
			for(int j = 0; j < msgCMatrix[0].length; j++){
				msgCMatrix[i][j] = numToAlpha.get(encMsg[i][j]);
			}
		}
		
		String em = "";
		c = 0;
		for(int i = 0; i < msgCMatrix[0].length; i++){
			for(int j = 0; j < msgCMatrix.length; j++){
				em += msgCMatrix[j][i];
				c++;
				if(c % 5 == 0){
					em += " ";
				}
			}
		}
		return em;
		
	}
	public int [][] matrixMult(int key [][], int msg[][]){
		int[][] enc = new int[msg.length][msg[0].length];
		for(int i = 0; i < msg[0].length; i++){
			for(int j = 0; j < msg.length; j++){
				if((j + 1)% 2 == 0){
					enc[j][i] = ((key[1][0] * msg[j - 1][i]) + (key[1][1] *msg[j][i])) % 26; 
				}
				else{
					enc[j][i] = ((key[0][0] * msg[j][i]) + (key[0][1] *msg[j + 1][i])) % 26;
				}
			}
		}
		
		return enc;
	}
	
	private void initNumToAlpha(){
		numToAlpha = new HashMap<Integer, Character>();
		numToAlpha.put(0, 'Z');
		numToAlpha.put(1, 'A');
		numToAlpha.put(2, 'B');
		numToAlpha.put(3, 'C');
		numToAlpha.put(4, 'D');
		numToAlpha.put(5, 'E');
		numToAlpha.put(6, 'F');
		numToAlpha.put(7, 'G');
		numToAlpha.put(8, 'H');
		numToAlpha.put(9, 'I');
		numToAlpha.put(10, 'J');
		numToAlpha.put(11, 'K');
		numToAlpha.put(12, 'L');
		numToAlpha.put(13, 'M');
		numToAlpha.put(14, 'N');
		numToAlpha.put(15, 'O');
		numToAlpha.put(16, 'P');
		numToAlpha.put(17, 'Q');
		numToAlpha.put(18, 'R');
		numToAlpha.put(19, 'S');
		numToAlpha.put(20, 'T');
		numToAlpha.put(21, 'U');
		numToAlpha.put(22, 'V');
		numToAlpha.put(23, 'W');
		numToAlpha.put(24, 'X');
		numToAlpha.put(25, 'Y');
	}
	private void initAlphaToNum(){
		alphaToNum = new HashMap<Character, Integer>();
		alphaToNum.put('Z', 0);
		alphaToNum.put('A', 1);
		alphaToNum.put('B', 2);
		alphaToNum.put('C', 3);
		alphaToNum.put('D', 4);
		alphaToNum.put('E', 5);
		alphaToNum.put('F', 6);
		alphaToNum.put('G', 7);
		alphaToNum.put('H', 8);
		alphaToNum.put('I', 9);
		alphaToNum.put('J', 10);
		alphaToNum.put('K', 11);
		alphaToNum.put('L', 12);
		alphaToNum.put('M', 13);
		alphaToNum.put('N', 14);
		alphaToNum.put('O', 15);
		alphaToNum.put('P', 16);
		alphaToNum.put('Q', 17);
		alphaToNum.put('R', 18);
		alphaToNum.put('S', 19);
		alphaToNum.put('T', 20);
		alphaToNum.put('U', 21);
		alphaToNum.put('V', 22);
		alphaToNum.put('W', 23);
		alphaToNum.put('X', 24);
		alphaToNum.put('Y', 25);
	}
	

}
