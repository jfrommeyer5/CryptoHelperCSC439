package Ciphers;

import static org.junit.Assert.*;

import javax.swing.JTextArea;

import org.junit.Test;

public class decryptKWTest {

decryptKW decryptkw;
	
	@Test
	public void testCreation() {
		decryptkw = new decryptKW();
		assertNotNull(decryptkw);
	}
	
	@Test
	public void testEncrypt(){
		decryptkw = new decryptKW();
		JTextArea testArea = new JTextArea();
		testArea.setText("JYKTJ NCQDU TKPUC Z");
		
		decryptkw.setInputText(testArea);
		decryptkw.setTextKeyArea("testing");
		decryptkw.getActionButton().doClick();
		
		testArea.setText("MYNAM EISJU ANRUI Z");
		
		assertEquals(testArea.getText(), decryptkw.getMainCipherTextArea().getText());
	}
}
