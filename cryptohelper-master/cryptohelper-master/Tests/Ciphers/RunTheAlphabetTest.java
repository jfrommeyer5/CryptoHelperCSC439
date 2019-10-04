package Ciphers;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class RunTheAlphabetTest {
    private RunTheAlphabet runTheAlphabet;

    @Test
    void createRunTheAlphabetTest(){
        runTheAlphabet = new RunTheAlphabet();
        assertNotNull(runTheAlphabet);
    }

    @Test
    void testActionButtonActionPerformed() {
        runTheAlphabet = new RunTheAlphabet();

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("Testing Functionality");

        runTheAlphabet.setInputText(testJTextArea);
        runTheAlphabet.getActionButton().doClick();

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

        assertEquals(testJTextArea.getText(), runTheAlphabet.getMainCipherTextArea().getText());
    }
}