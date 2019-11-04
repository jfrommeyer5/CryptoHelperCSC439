package Ciphers;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.*;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * This program performs the 
 * columnar transposition cipher 
 * to the entered message and uses a letter to 
 * fill the empty space
 * @author juanr
 *
 */
public class columnEncrypt extends BaseCipher{
	private JPanel topPanel;
	private JPanel keyPanel;
	private JPanel fillPanel;
	private JTextField keywordArea;
	private JLabel keywordLabel;
	private JTextField fillArea;
	private JLabel fillLabel;
	
	public columnEncrypt(){
		super();
		topPanel = new JPanel();
		keyPanel = new JPanel();
		fillPanel = new JPanel();
		keywordArea = new JTextField();
		keywordLabel = new JLabel();
		fillArea = new JTextField();
		fillLabel = new JLabel();

		keyPanel.setLayout(new BorderLayout());
		fillPanel.setLayout(new BorderLayout());
		
		keywordLabel.setText("Keyword ");
		keyPanel.add(keywordLabel, BorderLayout.WEST);
		keywordArea.setFont(new Font("Monospaced", 0, 12));
		keywordArea.setColumns(26);
		keyPanel.add(keywordArea, BorderLayout.CENTER);
		
		fillLabel.setText("Fill Char ");
		fillArea.setFont(new Font("Monospaced", 0, 12));
		fillArea.setColumns(3);
		fillPanel.add(fillLabel, BorderLayout.WEST);
		fillPanel.add(fillArea, BorderLayout.CENTER);
		
		topPanel.add(keyPanel, BorderLayout.WEST);
		topPanel.add(fillPanel, BorderLayout.EAST);
		
		getMainCipherPanel().add(topPanel, BorderLayout.NORTH);
		
		initializeActionBtn("Encipher");
		setMainCipherPanelText("CTC Encrypt");
	}
	
	@Override
	public void actionButtonActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		String msg = getInputText().getText();
		String key = keywordArea.getText();
		String fill = fillArea.getText();
		
		getMainCipherTextArea().setText("");
		
		String ct = encrypt(msg, key, fill);
		
		getMainCipherTextArea().append(ct);
	}

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
	public String getTextKeyArea(){
		return keywordArea.getText();
	}
	public void setTextKeyArea(String txt){
		keywordArea.setText(txt);
	}
	public String getFillArea(){
		return fillArea.getText();
	}
	public void setFillArea(String txt){
		fillArea.setText(txt);
	}
	

}
