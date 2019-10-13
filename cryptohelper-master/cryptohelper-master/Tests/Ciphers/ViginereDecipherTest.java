package Ciphers;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class ViginereDecipherTest {
    private ViginereDecipher viginereDecipher;

    @Test
    void createViginereEncipherTest(){
        viginereDecipher = new ViginereDecipher();
        assertNotNull(viginereDecipher);
    }

    @Test
    void actionButtonActionPerformed() {
        viginereDecipher = new ViginereDecipher();

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("Testing Functionality");

        viginereDecipher.getKeyWordTextField().setText("test");

        viginereDecipher.setInputText(testJTextArea);
        viginereDecipher.getActionButton().doClick();

        testJTextArea.setText("aaaap jombj kapkv hsebf");

        assertEquals(testJTextArea.getText(), viginereDecipher.getOutputTextArea().getText());

    }
}