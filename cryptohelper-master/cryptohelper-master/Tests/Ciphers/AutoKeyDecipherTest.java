package Ciphers;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class AutoKeyDecipherTest {
    private AutoKeyDecipher autoKeyDecipher;

    @Test
    void createViginereEncipherTest() {
        autoKeyDecipher = new AutoKeyDecipher();
        assertNotNull(autoKeyDecipher);
    }

    @Test
    void actionButtonActionPerformed() {
        autoKeyDecipher = new AutoKeyDecipher();

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("Testing Functionality");

        autoKeyDecipher.getTextField().setText("test");

        autoKeyDecipher.setInputText(testJTextArea);
        autoKeyDecipher.getActionButton().doClick();

        testJTextArea.setText("aaaap jomma woobl hdugy");

        assertEquals(testJTextArea.getText(), autoKeyDecipher.getOutputTextArea().getText());
    }
}