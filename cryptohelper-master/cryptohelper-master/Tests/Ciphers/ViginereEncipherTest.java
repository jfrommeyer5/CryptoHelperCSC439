package Ciphers;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class ViginereEncipherTest {
    private ViginereEncipher viginereEncipher;

    @Test
    void createViginereEncipherTest(){
        viginereEncipher = new ViginereEncipher();
        assertNotNull(viginereEncipher);
    }

    @Test
    void actionButtonActionPerformed() {
        viginereEncipher = new ViginereEncipher();

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("Testing Functionality");

        viginereEncipher.getKeyWordTextField().setText("test");

        viginereEncipher.setInputText(testJTextArea);
        viginereEncipher.getActionButton().doClick();

        testJTextArea.setText("MIKMB RYYNR UMBSF TEMLR");

        assertEquals(testJTextArea.getText(), viginereEncipher.getOutputTextArea().getText());

    }
}