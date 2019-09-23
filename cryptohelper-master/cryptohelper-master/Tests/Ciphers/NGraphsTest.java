package Ciphers;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class NGraphsTest {
    private NGraphs nGraphs;

    @Test
    void createNGraphsTest(){
        nGraphs = new NGraphs();
        assertNotNull(nGraphs);
    }

    @Test
    void actionButtonActionPerformed() {
        nGraphs = new NGraphs();

        nGraphs.getjSpinner().setValue(4);

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("Testing Functionality");

        nGraphs.setInputText(testJTextArea);
        nGraphs.getActionButton().doClick();

        testJTextArea.setText("TEST = 1 at positions 0\n" +
                "ESTI = 1 at positions 1\n" +
                "STIN = 1 at positions 2\n" +
                "TING = 1 at positions 3\n" +
                "INGF = 1 at positions 4\n" +
                "NGFU = 1 at positions 5\n" +
                "GFUN = 1 at positions 6\n" +
                "FUNC = 1 at positions 7\n" +
                "UNCT = 1 at positions 8\n" +
                "NCTI = 1 at positions 9\n" +
                "CTIO = 1 at positions 10\n" +
                "TION = 1 at positions 11\n" +
                "IONA = 1 at positions 12\n" +
                "ONAL = 1 at positions 13\n" +
                "NALI = 1 at positions 14\n" +
                "ALIT = 1 at positions 15\n" +
                "LITY = 1 at positions 16\n");

        assertEquals(testJTextArea.getText(), nGraphs.getMainCipherTextArea().getText());
    }
}