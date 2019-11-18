package Ciphers;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class hillDecrypt extends BaseCipher{
	private Map<Integer, Character> numToAlpha;
	private Map<Character, Integer> alphaToNum;
	private int acceptedDet[] = {1,3,5,7,9,11,15,17,19,21,23,25};
	private Key k;
	private JPanel topPanel;
	private JPanel textPanel;
	private JPanel labelPanel;
	private JTextField a;
	private JTextField b;
	private JTextField c;
	private JTextField d;
	private JLabel keyLabel;
	
	public hillDecrypt(){
		super();
	    topPanel = new JPanel();
		textPanel = new JPanel();
		labelPanel = new JPanel();
		a = new JTextField();
		b = new JTextField();
		c = new JTextField();
		d = new JTextField();
		keyLabel = new JLabel();
		
		a.setFont(new Font("Monospaced", 0, 12));
		b.setFont(new Font("Monospaced", 0, 12));
		c.setFont(new Font("Monospaced", 0, 12));
		d.setFont(new Font("Monospaced", 0, 12));
		a.setColumns(3);
		b.setColumns(3);
		c.setColumns(3);
		d.setColumns(3);
		
		textPanel.setLayout(new GridLayout(1,4));
		textPanel.add(a);
		textPanel.add(b);
		textPanel.add(c);
		textPanel.add(d);
		
		keyLabel.setText("Key: ");
		
		labelPanel.setLayout(new BorderLayout());
		labelPanel.add(keyLabel);
		
		topPanel.setLayout(new BorderLayout());
		topPanel.add(labelPanel, BorderLayout.WEST);
		topPanel.add(textPanel, BorderLayout.CENTER);
		getMainCipherPanel().add(topPanel, BorderLayout.NORTH);
		
		initializeActionBtn("Decipher");
		setMainCipherPanelText("Hill Decipher");
	}
	
	@Override
	public void actionButtonActionPerformed(ActionEvent evt){
		getMainCipherTextArea().setText("");
		String msg = getInputText().getText();
		int a1 = Integer.parseInt(a.getText());
		int b1 = Integer.parseInt(b.getText());
		int c1 = Integer.parseInt(c.getText());
		int d1 = Integer.parseInt(d.getText());
		String e = decrypt(msg, a1, b1, c1, d1);
		
		getMainCipherTextArea().append(e);
		
	
	}
	
	public String decrypt(String msg, int a, int b, int c, int d){
		if(isDet(a,b,c,d) == false){
			return "Error: Invalid Key";
		}
		k = new Key(a,b,c,d);
		initNumToAlpha();
		initAlphaToNum();
		msg = msg.replaceAll("[^a-zA-Z]", "");
		
		if(msg.length() % 2 != 0){
			msg += "x";
		}
		
		msg = msg.toLowerCase();
		char [] msgC = msg.toCharArray();
		int col = msgC.length / 2;
		char[][] msgCMatrix = new char [2][col];
		int [][] msgIMatrix = new int [2][col];
		int [][] keyInverse = k.getKeyInverse();
		
		int c1 = 0;
		for(int i = 0; i <msgCMatrix[0].length ; i++){
			for(int j = 0; j < msgCMatrix.length ; j++){
				msgCMatrix[j][i] = msgC[c1];
				c1++;
			}
		}
		for(int i = 0 ; i < msgIMatrix.length; i++){
			for(int j = 0; j < msgIMatrix[0].length; j++){
				msgIMatrix[i][j] = alphaToNum.get(msgCMatrix[i][j]);
			}
		}
		
		int[][] encMsg = matrixMult(keyInverse, msgIMatrix);
		for(int i = 0 ; i < msgCMatrix.length; i++){
			for(int j = 0; j < msgCMatrix[0].length; j++){
				msgCMatrix[i][j] = numToAlpha.get(encMsg[i][j]);
			}
		}
		
		String em = "";
		c1 = 0;
		for(int i = 0; i < msgCMatrix[0].length; i++){
			for(int j = 0; j < msgCMatrix.length; j++){
				em += msgCMatrix[j][i];
				c1++;
				if(c1 % 5 == 0){
					em += " ";
				}
			}
		}
		return em;
	}
	public int [][] matrixMult(int [][] kI, int [][] msg){
		int[][] enc = new int[msg.length][msg[0].length];
		for(int i = 0; i < msg[0].length; i++){
			for(int j = 0; j < msg.length; j++){
				if((j + 1)% 2 == 0){
					enc[j][i] = ((kI[1][0] * msg[j - 1][i]) + (kI[1][1] *msg[j][i])) % 26; 
				}
				else{
					enc[j][i] = ((kI[0][0] * msg[j][i]) + (kI[0][1] *msg[j + 1][i])) % 26;
				}
			}
		}
		
		return enc;
	}
	private void initNumToAlpha(){
		numToAlpha = new HashMap<Integer, Character>();
		numToAlpha.put(0, 'z');
		numToAlpha.put(1, 'a');
		numToAlpha.put(2, 'b');
		numToAlpha.put(3, 'c');
		numToAlpha.put(4, 'd');
		numToAlpha.put(5, 'e');
		numToAlpha.put(6, 'f');
		numToAlpha.put(7, 'g');
		numToAlpha.put(8, 'h');
		numToAlpha.put(9, 'i');
		numToAlpha.put(10, 'j');
		numToAlpha.put(11, 'k');
		numToAlpha.put(12, 'l');
		numToAlpha.put(13, 'm');
		numToAlpha.put(14, 'n');
		numToAlpha.put(15, 'o');
		numToAlpha.put(16, 'p');
		numToAlpha.put(17, 'q');
		numToAlpha.put(18, 'r');
		numToAlpha.put(19, 's');
		numToAlpha.put(20, 't');
		numToAlpha.put(21, 'u');
		numToAlpha.put(22, 'v');
		numToAlpha.put(23, 'w');
		numToAlpha.put(24, 'x');
		numToAlpha.put(25, 'y');
	}
	private void initAlphaToNum(){
		alphaToNum = new HashMap<Character, Integer>();
		alphaToNum.put('z', 0);
		alphaToNum.put('a', 1);
		alphaToNum.put('b', 2);
		alphaToNum.put('c', 3);
		alphaToNum.put('d', 4);
		alphaToNum.put('e', 5);
		alphaToNum.put('f', 6);
		alphaToNum.put('g', 7);
		alphaToNum.put('h', 8);
		alphaToNum.put('i', 9);
		alphaToNum.put('j', 10);
		alphaToNum.put('k', 11);
		alphaToNum.put('l', 12);
		alphaToNum.put('m', 13);
		alphaToNum.put('n', 14);
		alphaToNum.put('o', 15);
		alphaToNum.put('p', 16);
		alphaToNum.put('q', 17);
		alphaToNum.put('r', 18);
		alphaToNum.put('s', 19);
		alphaToNum.put('t', 20);
		alphaToNum.put('u', 21);
		alphaToNum.put('v', 22);
		alphaToNum.put('w', 23);
		alphaToNum.put('x', 24);
		alphaToNum.put('y', 25);
	}
	private Boolean isDet(int a, int b, int c, int d){ 
		int v, d1;
		v = (a*d) - (b*c);
		d1 = v % 26;
		for(int i = 0; i < acceptedDet.length; i++){
			if(acceptedDet[i] == d1){
				return true;
			}
		}
		return false;
	}
	public void setA(String s){
		a.setText(s);
	}
	public void setB(String s){
		b.setText(s);
	}
	public void setC(String s){
		c.setText(s);
	}
	public void setD(String s){
		d.setText(s);
	}
}
