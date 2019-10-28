package Ciphers;

import static org.junit.Assert.*;

import javax.swing.JTextArea;

import org.junit.Test;

public class BaconEncipherTest extends BaconEncipher {

	@Test
	public void testActionButtonActionPerformed() {
		baconEncipher = new BaconEncipher();

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("Testing Functionality");

        baconEncipher.setInputText(testJTextArea);
        baconEncipher.getActionButton().doClick();

        testJTextArea.setText("0100000101100100010110011100110111101101001011011101111100100010010011");
                
        assertEquals(testJTextArea.getText(), baconEncipher.getMainCipherTextArea().getText());
        
        testJTextArea.setText("Invalid due to letters");
        
        assertEquals(testJTextArea.getText(), baconEncipher.getMainCipherTextArea().getText());
        
        testJTextArea.setText("Using numbers and letters 0010");
        
        assertEquals(testJTextArea.getText(), baconEncipher.getMainCipherTextArea().getText());
        
        testJTextArea.setText("010000010110010001011001110011011110110100101101110111110010001001"); //invalid length
        
        assertEquals(testJTextArea.getText(), baconEncipher.getMainCipherTextArea().getText());
        

    }
	}


}
