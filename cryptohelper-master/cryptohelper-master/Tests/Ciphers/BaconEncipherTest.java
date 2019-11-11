package Ciphers;

import static org.junit.Assert.*;

import javax.swing.JTextArea;

import org.junit.Test;

public class BaconEncipherTest extends BaconEncipher {
    BaconEncipher baconEncipher;

	@Test
	public void testActionButtonActionPerformed() {
		baconEncipher = new BaconEncipher();

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("Testing Functionality");

        baconEncipher.setInputText(testJTextArea);
        baconEncipher.getActionButton().doClick();

        testJTextArea.setText("testing functionality");
               
        assertEquals(testJTextArea.getText(), baconEncipher.getMainCipherTextArea().getText());
        
        testJTextArea.setText("Using Capitals");
        
        assertEquals(testJTextArea.getText(), baconEncipher.getMainCipherTextArea().getText());
        
        testJTextArea.setText("Using numbers 0010");
        
        assertEquals(testJTextArea.getText(), baconEncipher.getMainCipherTextArea().getText());
        
        testJTextArea.setText("Using symbols >.,!");
        
        assertEquals(testJTextArea.getText(), baconEncipher.getMainCipherTextArea().getText());
        
    }
}

