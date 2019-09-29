package Ciphers;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class SplitOffAlphabetsTest {
    private SplitOffAlphabets splitOffAlphabets;

    @Test
    void createSplitOffAlphabets(){
        splitOffAlphabets = new SplitOffAlphabets();
        assertNotNull(splitOffAlphabets);
    }

    @Test
    void actionButtonActionPerformed() {
        splitOffAlphabets = new SplitOffAlphabets();

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("Testing Functionality");

        splitOffAlphabets.getjSpinner().setValue(3);

        splitOffAlphabets.setInputText(testJTextArea);
        splitOffAlphabets.getActionButton().doClick();

        testJTextArea.setText("TTGNIAT\n" +
                "EIFCOLY\n" +
                "SNUTNI\n");

        assertEquals(testJTextArea.getText(), splitOffAlphabets.getMainCipherTextArea().getText());
    }
}