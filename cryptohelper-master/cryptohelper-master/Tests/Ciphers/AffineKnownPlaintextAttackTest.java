package Ciphers;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class AffineKnownPlaintextAttackTest {
    private AffineKnownPlaintextAttack affineKnownPlaintextAttack;

    @Test
    void createAffineKnownPlaintextAttack(){
        affineKnownPlaintextAttack = new AffineKnownPlaintextAttack();
        assertNotNull(affineKnownPlaintextAttack);
    }

    @Test
    void actionButtonActionPerformed() {
        affineKnownPlaintextAttack = new AffineKnownPlaintextAttack();

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("Testing Functionality");

        affineKnownPlaintextAttack.getTextField().setText("th");

        affineKnownPlaintextAttack.setInputText(testJTextArea);
        affineKnownPlaintextAttack.getActionButton().doClick();

        testJTextArea.setText("The following are all the possible combinations of \"TH\"\n" +
                "which are contained in the cyphertext message and the affine\n" +
                "keys used to encrypt them.\n" +
                "\n" +
                "ES appears 1 times with a multiplicative key = 1 and an additive key = 11\n" +
                "IO appears 1 times with a multiplicative key = 19 and an additive key = 19\n");


        assertEquals(testJTextArea.getText(), affineKnownPlaintextAttack.getMainCipherTextArea().getText());
    }
}