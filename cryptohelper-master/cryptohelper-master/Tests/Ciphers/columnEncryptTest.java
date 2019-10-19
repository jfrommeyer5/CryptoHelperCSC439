package Ciphers;

import static org.junit.Assert.*;

import javax.swing.JTextArea;

import org.junit.Test;

public class columnEncryptTest {
	columnEncrypt columnEncrypt;
	
	@Test
	public void creationTest() {
		columnEncrypt = new columnEncrypt();
		assertNotNull(columnEncrypt);
	}
	
	@Test
	public void encryptTest(){
		columnEncrypt = new columnEncrypt();
		JTextArea testArea = new JTextArea();
		testArea.setText("hello my name is juan");
		
		columnEncrypt.setInputText(testArea);
		columnEncrypt.setTextKeyArea("test");
		columnEncrypt.setFillArea("x");
		columnEncrypt.getActionButton().doClick();
		
		testArea.setText("EMMJX LYEUX HOASN LNIAX ");
		
		assertEquals(testArea.getText(), columnEncrypt.getMainCipherTextArea().getText());
		
		
		
	}

}
