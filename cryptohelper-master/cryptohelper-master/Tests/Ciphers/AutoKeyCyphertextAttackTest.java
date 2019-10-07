package Ciphers;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class AutoKeyCyphertextAttackTest {
    private AutoKeyCyphertextAttack autoKeyCyphertextAttack;

    @Test
    void createViginereEncipherTest() {
        autoKeyCyphertextAttack = new AutoKeyCyphertextAttack();
        assertNotNull(autoKeyCyphertextAttack);
    }

    @Test
    void actionButtonActionPerformed() {
        autoKeyCyphertextAttack = new AutoKeyCyphertextAttack();

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("Testing Functionality");

        autoKeyCyphertextAttack.getjSpinner().setValue(2);

        autoKeyCyphertextAttack.setInputText(testJTextArea);
        autoKeyCyphertextAttack.getActionButton().doClick();

        testJTextArea.setText("tezpq uysoi iggvf myiiq\n" +
                "\n" +
                "Friedman value = 0.04736842105263159");

        assertEquals(testJTextArea.getText(), autoKeyCyphertextAttack.getOutputTextArea().getText());
    }
}