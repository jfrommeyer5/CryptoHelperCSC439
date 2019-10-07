package Ciphers;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class AutoKeyPlaintextAttackTest {
    private AutoKeyPlaintextAttack autoKeyPlaintextAttack;

    @Test
    void createViginereEncipherTest() {
        autoKeyPlaintextAttack = new AutoKeyPlaintextAttack();
        assertNotNull(autoKeyPlaintextAttack);
    }

    @Test
    void actionButtonActionPerformed() {
        autoKeyPlaintextAttack = new AutoKeyPlaintextAttack();

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("Testing Functionality");

        autoKeyPlaintextAttack.getjSpinner().setValue(2);

        autoKeyPlaintextAttack.setInputText(testJTextArea);
        autoKeyPlaintextAttack.getActionButton().doClick();

        testJTextArea.setText("Possibilities for letter  1  of keyword  C  keylength =  2  friedman =  0.06666666666666667\n" +
                "Possibilities for letter  1  of keyword  P  keylength =  2  friedman =  0.06666666666666667\n" +
                "Possibilities for letter  2  of keyword  B  keylength =  2  friedman =  0.06666666666666667\n" +
                "Possibilities for letter  2  of keyword  G  keylength =  2  friedman =  0.06666666666666667\n" +
                "Possibilities for letter  2  of keyword  K  keylength =  2  friedman =  0.08888888888888889\n" +
                "Possibilities for letter  2  of keyword  O  keylength =  2  friedman =  0.06666666666666667\n" +
                "Possibilities for letter  2  of keyword  T  keylength =  2  friedman =  0.06666666666666667\n" +
                "Possibilities for letter  2  of keyword  X  keylength =  2  friedman =  0.08888888888888889\n");

        assertEquals(testJTextArea.getText(), autoKeyPlaintextAttack.getOutputTextArea().getText());
    }
}