package Ciphers;

import static org.junit.Assert.*;

import javax.swing.JTextArea;

import org.junit.Test;

public class columnDecryptTest {
columnDecrypt columnDecrypt;
	
	@Test
	public void creationTest() {
		columnDecrypt = new columnDecrypt();
		assertNotNull(columnDecrypt);
	}
	
	@Test
	public void decryptTest(){
		columnDecrypt = new columnDecrypt();
		JTextArea testArea = new JTextArea();
		testArea.setText("EMMJX LYEUX HOASN LNIAX");
		
		columnDecrypt.setInputText(testArea);
		columnDecrypt.setTextKeyArea("test");
		columnDecrypt.getActionButton().doClick();
		
		testArea.setText("HELLO MYNAM EISJU ANXXX ");
		
		assertEquals(testArea.getText(), columnDecrypt.getMainCipherTextArea().getText());
	}
}
