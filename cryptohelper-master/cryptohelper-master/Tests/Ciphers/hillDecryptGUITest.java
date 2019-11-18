package Ciphers;

import static org.junit.Assert.*;

import javax.swing.JTextArea;

import org.junit.Test;

public class hillDecryptGUITest {

	@Test
	public void creationTest() {
		hillDecrypt hill = new hillDecrypt();
		assertNotNull(hill);
	}
	
	@Test
	public void DecryptTest(){
		hillDecrypt h = new hillDecrypt();
		JTextArea test = new JTextArea();
		JTextArea result = new JTextArea();
		
		test.setText("FYRNY GIRSW ICQBK QBF");
		result.setText("hello mynam eisju anx");
		
		h.setInputText(test);
		h.setA(Integer.toString(19));
		h.setB(Integer.toString(2));
		h.setC(Integer.toString(10));
		h.setD(Integer.toString(15));
		
		h.getActionButton().doClick();
		assertEquals(result.getText(), h.getMainCipherTextArea().getText());
		
		
	}

}
