package Ciphers;

import static org.junit.jupiter.api.Assertions.*;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import javax.swing.JTextArea;
import org.junit.jupiter.api.Test;

class EnigmaTest {
	private Enigma enigma;

	@Test
	void createEnigma() {
		enigma = new Enigma();
		assertNotNull(enigma);
	}

	@Test
	void testActionButtonActionPerformed() {
        enigma = new Enigma();

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("B\n" + 
        		"II - IV - V\n" + 
        		"B - U - L\n" + 
        		"B - L - A\n" +
        		"A:V B:S C:G D:L F:U H:Z I:N K:M O:W R:X\n" + 
        		"EDPUD NRGYS ZRCXN UYTPO MRMBO FKTBZ REZKM LXLVE FGUEY SIOZV EQMIK UBPMM YLKLT TDEIS MDICA GYKUA CTCDO MOHWX MUUIA UBSTS LRNBZ SZWNR FXWFY SSXJZ VIJHI DISHP RKLKA YUPAD TXQSP INQMA TLPIF SVKDA SCTAC DPBOP VHJK-");

        enigma.setInputText(testJTextArea);
        enigma.getActionButton().doClick();

        testJTextArea.setText("AUFKL XABTE ILUNG XVONX KURTI NOWAX KURTI NOWAX NORDW ESTLX SEBEZ XSEBE ZXUAF FLIEG ERSTR ASZER IQTUN GXDUB ROWKI XDUBR OWKIX OPOTS CHKAX OPOTS CHKAX UMXEI NSAQT DREIN ULLXU HRANG ETRET ENXAN GRIFF XINFX RGTX-");

        assertEquals(testJTextArea.getText(), enigma.getMainCipherTextArea().getText());
	}
	
	@Test
	void rotor1Test() {
		Rotor1 r1 = new Rotor1();
		
		String msg = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		CharacterIterator iter = new StringCharacterIterator(msg);
		String out = "";
		
		while(iter.current() != CharacterIterator.DONE) {
			r1.rotate();
			
			out += r1.decrypt(r1.encrypt(iter.current()));
			
			iter.next();
		}
		
		assertEquals(out, msg);
	}
	
	@Test
	void rotor2Test() {
		Rotor2 r2 = new Rotor2();
		
		String msg = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		CharacterIterator iter = new StringCharacterIterator(msg);
		String out = "";
		
		while(iter.current() != CharacterIterator.DONE) {
			r2.rotate();
			
			out += r2.decrypt(r2.encrypt(iter.current()));
			
			iter.next();
		}
		
		assertEquals(out, msg);
	}
	
	@Test
	void rotor3Test() {
		Rotor3 r3 = new Rotor3();
		
		String msg = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		CharacterIterator iter = new StringCharacterIterator(msg);
		String out = "";
		
		while(iter.current() != CharacterIterator.DONE) {
			r3.rotate();
			
			out += r3.decrypt(r3.encrypt(iter.current()));
			
			iter.next();
		}
		
		assertEquals(out, msg);
	}
	
	@Test
	void rotor4Test() {
		Rotor4 r4 = new Rotor4();
		
		String msg = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		CharacterIterator iter = new StringCharacterIterator(msg);
		String out = "";
		
		while(iter.current() != CharacterIterator.DONE) {
			r4.rotate();
			
			out += r4.decrypt(r4.encrypt(iter.current()));
			
			iter.next();
		}
		
		assertEquals(out, msg);
	}
	
	@Test
	void rotor5Test() {
		Rotor5 r5 = new Rotor5();
		
		String msg = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		CharacterIterator iter = new StringCharacterIterator(msg);
		String out = "";
		
		while(iter.current() != CharacterIterator.DONE) {
			r5.rotate();
			
			out += r5.decrypt(r5.encrypt(iter.current()));
			
			iter.next();
		}
		
		assertEquals(out, msg);
	}
	
	@Test
	void plugboardTest() {		
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String msg = "ZYXWVUTSRQPONMLKJIHGFEDCBA";

		Plugboard pb = new Plugboard(msg);
		
		CharacterIterator iter = new StringCharacterIterator(alpha);
		String out = "";
		
		while(iter.current() != CharacterIterator.DONE) {
			out += pb.encrypt(iter.current());
			
			iter.next();
		}
		
		assertEquals(msg, out);
	}
	
	@Test
	void rotorSteppingTest() {
		Rotor r = new Rotor1();
		
		boolean test = false;
		
		while(!test)
			test = r.rotate();
		
		assertEquals(r.getStep(), r.getStepChar());
	}
}