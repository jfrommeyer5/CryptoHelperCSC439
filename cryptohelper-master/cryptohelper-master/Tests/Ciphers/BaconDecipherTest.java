//package Ciphers;
//
//import static org.junit.Assert.*;
//
//import javax.swing.JTextArea;
//
//import org.junit.Test;
//
//public class BaconDecipherTest extends BaconDecipher {
//
//	@Test
//	public void testActionButtonActionPerformed() {
//		baconDecipher = new BaconDecipher();
//
//        JTextArea testJTextArea = new JTextArea();
//        testJTextArea.setText("Testing Functionality");
//
//        baconDecipher.setInputText(testJTextArea);
//        baconDecipher.getActionButton().doClick();
//
//        testJTextArea.setText("0100000101100100010110011100110111101101001011011101111100100010010011");
//
//        assertEquals(testJTextArea.getText(), baconDecipher.getMainCipherTextArea().getText());
//
//        testJTextArea.setText("Invalid due to letters");
//
//        assertEquals(testJTextArea.getText(), baconDecipher.getMainCipherTextArea().getText());
//
//        testJTextArea.setText("Using numbers and letters 0010");
//
//        assertEquals(testJTextArea.getText(), baconDecipher.getMainCipherTextArea().getText());
//
//        testJTextArea.setText("010000010110010001011001110011011110110100101101110111110010001001"); //invalid length
//
//        assertEquals(testJTextArea.getText(), baconDecipher.getMainCipherTextArea().getText());
//
//
//    }
//	}
//
//
//}
