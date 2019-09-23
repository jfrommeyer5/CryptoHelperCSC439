package Ciphers;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class BiGraphsTest {
    private BiGraphs biGraphs;

    @Test
    void createBiGraphsTest(){
        biGraphs = new BiGraphs();
        assertNotNull(biGraphs);
    }

    @Test
    void actionButtonActionPerformed() {
        biGraphs = new BiGraphs();

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("Testing Functionality");

        biGraphs.setInputText(testJTextArea);
        biGraphs.getActionButton().doClick();

        testJTextArea.setText("TE = 1 at positions 0\n" +
                "ES = 1 at positions 1\n" +
                "ST = 1 at positions 2\n" +
                "TI = 2 at positions 3,11\n" +
                "IN = 1 at positions 4\n" +
                "NG = 1 at positions 5\n" +
                "GF = 1 at positions 6\n" +
                "FU = 1 at positions 7\n" +
                "UN = 1 at positions 8\n" +
                "NC = 1 at positions 9\n" +
                "CT = 1 at positions 10\n" +
                "IO = 1 at positions 12\n" +
                "ON = 1 at positions 13\n" +
                "NA = 1 at positions 14\n" +
                "AL = 1 at positions 15\n" +
                "LI = 1 at positions 16\n" +
                "IT = 1 at positions 17\n" +
                "TY = 1 at positions 18\n");

        assertEquals(testJTextArea.toString(), biGraphs.getMainCipherTextArea().toString());
    }
}