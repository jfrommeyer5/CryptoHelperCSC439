package Ciphers;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class TriGraphsTest {
    private TriGraphs triGraphs;

    @Test
    void createTriGraphsTest(){
        triGraphs = new TriGraphs();
        assertNotNull(triGraphs);
    }

    @Test
    void actionButtonActionPerformed() {
        triGraphs = new TriGraphs();

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("Testing Functionality");

        triGraphs.setInputText(testJTextArea);
        triGraphs.getActionButton().doClick();

        testJTextArea.setText("TES = 1 at positions 0\n" +
                "EST = 1 at positions 1\n" +
                "STI = 1 at positions 2\n" +
                "TIN = 1 at positions 3\n" +
                "ING = 1 at positions 4\n" +
                "NGF = 1 at positions 5\n" +
                "GFU = 1 at positions 6\n" +
                "FUN = 1 at positions 7\n" +
                "UNC = 1 at positions 8\n" +
                "NCT = 1 at positions 9\n" +
                "CTI = 1 at positions 10\n" +
                "TIO = 1 at positions 11\n" +
                "ION = 1 at positions 12\n" +
                "ONA = 1 at positions 13\n" +
                "NAL = 1 at positions 14\n" +
                "ALI = 1 at positions 15\n" +
                "LIT = 1 at positions 16\n" +
                "ITY = 1 at positions 17");

        assertEquals(testJTextArea.toString(), triGraphs.getMainCipherTextArea().toString());
    }
}