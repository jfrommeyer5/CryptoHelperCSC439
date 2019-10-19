package Ciphers;

import static org.junit.Assert.*;

import javax.swing.JTextArea;

import org.junit.Test;

public class encryptKWTest {
	encryptKW encryptkw;
	
	@Test
	public void testCreation() {
		encryptkw = new encryptKW();
		assertNotNull(encryptkw);
	}
	
	@Test
	public void testEncrypt(){
		encryptkw = new encryptKW();
		JTextArea testArea = new JTextArea();
		testArea.setText("my name is juan ruiz");
		
		encryptkw.setInputText(testArea);
		encryptkw.setTextKeyArea("testing");
		encryptkw.getActionButton().doClick();
		
		testArea.setText("JYKTJ NCQDU TKPUC Z");
		
		assertEquals(testArea.getText(), encryptkw.getMainCipherTextArea().getText());
	}

}
