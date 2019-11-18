package Ciphers;

import static org.junit.Assert.*;

import javax.swing.JTextArea;

import org.junit.Test;

public class pigmorseTest {
	pigmorse pigMorse;
	
	@Test
	public void testCreation() {
		pigMorse = new pigmorse();
		assertNotNull(pigMorse);
	}
	
	@Test
	public void testEncrypt(){
		pigMorse = new pigmorse();
		JTextArea testArea = new JTextArea();
		testArea.setText("fish");
		
		pigMorse.setInputText(testArea);

		pigMorse.getActionButton().doClick();
		
		testArea.setText("...........-..--.--");
		
		assertEquals(testArea.getText(), pigMorse.getMainCipherTextArea().getText());
	}

}
