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

        testJTextArea.setText("testing functionality\n" +
                "uftujoh gvodujpobmjuz\n" +
                "vguvkpi hwpevkqpcnkva\n" +
                "whvwlqj ixqfwlrqdolwb\n" +
                "xiwxmrk jyrgxmsrepmxc\n" +
                "yjxynsl kzshyntsfqnyd\n" +
                "zkyzotm latizoutgroze\n" +
                "alzapun mbujapvuhspaf\n" +
                "bmabqvo ncvkbqwvitqbg\n" +
                "cnbcrwp odwlcrxwjurch\n" +
                "docdsxq pexmdsyxkvsdi\n" +
                "epdetyr qfynetzylwtej\n" +
                "fqefuzs rgzofuazmxufk\n" +
                "grfgvat shapgvbanyvgl\n" +
                "hsghwbu tibqhwcbozwhm\n" +
                "ithixcv ujcrixdcpaxin\n" +
                "juijydw vkdsjyedqbyjo\n" +
                "kvjkzex wletkzferczkp\n" +
                "lwklafy xmfulagfsdalq\n" +
                "mxlmbgz yngvmbhgtebmr\n" +
                "nymncha zohwncihufcns\n" +
                "oznodib apixodjivgdot\n" +
                "paopejc bqjypekjwhepu\n" +
                "qbpqfkd crkzqflkxifqv\n" +
                "rcqrgle dslargmlyjgrw\n");

        assertEquals(testJTextArea.getText(), baconEncipher.getMainCipherTextArea().getText());
    }
	}

	@Test
	public void testBaconEncipher() {
		fail("Not yet implemented");
	}

	@Test
	public void testPerformBaconCipher() {
		fail("Not yet implemented");
	}

}
