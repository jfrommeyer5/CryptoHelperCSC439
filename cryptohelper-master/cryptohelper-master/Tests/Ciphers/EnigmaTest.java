package Ciphers;

import static org.junit.jupiter.api.Assertions.*;
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
        		"A:V B:S C:G D:L F:U H:Z I:N K:M O:W R:X\n" + 
        		"EDPUD NRGYS ZRCXN UYTPO MRMBO FKTBZ REZKM LXLVE FGUEY SIOZV EQMIK UBPMM YLKLT TDEIS MDICA GYKUA CTCDO MOHWX MUUIA UBSTS LRNBZ SZWNR FXWFY SSXJZ VIJHI DISHP RKLKA YUPAD TXQSP INQMA TLPIF SVKDA SCTAC DPBOP VHJK-");

        enigma.setInputText(testJTextArea);
        enigma.getActionButton().doClick();

        testJTextArea.setText("AUFKL XABTE ILUNG XVONX KURTI NOWAX KURTI NOWAX NORDW ESTLX SEBEZ XSEBE ZXUAF FLIEG ERSTR ASZER IQTUN GXDUB ROWKI XDUBR OWKIX OPOTS CHKAX OPOTS CHKAX UMXEI NSAQT DREIN ULLXU HRANG ETRET ENXAN GRIFF XINFX RGTX-");

        assertEquals(testJTextArea.getText(), enigma.getMainCipherTextArea().getText());
	}        
}