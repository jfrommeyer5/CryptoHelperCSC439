import static org.junit.Assert.*;

import javax.swing.JTextArea;

import org.junit.Test;

public class PlayfairEncipherTest {

	@Test
	public void testActionButtonActionPerformed() {
		playfairEncipher = new PlayfairEncipher();

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("Testing Functionality");

        playfairEncipher.setInputText(testJTextArea);
        playfairEncipher.getActionButton().doClick();

        testJTextArea.setText("here is a big ol chunk of test text");
                
        assertEquals(testJTextArea.getText(), playfairEncipher.getMainCipherTextArea().getText());
        
        testJTextArea.setText("here is a big ol chunk of test text WITH CAPITALS");
        
        assertEquals(testJTextArea.getText(), playfairEncipher.getMainCipherTextArea().getText());
        
        testJTextArea.setText("here is a big ol chunk of test text, with symbols!");
        
        assertEquals(testJTextArea.getText(), playfairEncipher.getMainCipherTextArea().getText());
        
        testJTextArea.setText("here is a big ol chunk of test text, with symbols! and numbers like 1, 2, 3, and 4!"); //invalid length
        
        assertEquals(testJTextArea.getText(), playfairEncipher.getMainCipherTextArea().getText());
        

    }
	}
}
