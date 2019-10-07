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



        affineKnownPlaintextAttack.getCheckBox().setSelected(true);

        affineKnownPlaintextAttack.getActionButton().doClick();

        testJTextArea.setText("The following are all the possible combinations of \"TH\"\n" +
                "which are contained in the cyphertext message and the affine\n" +
                "keys used to encrypt them.\n" +
                "\n" +
                "TH appears 8 times with a multiplicative key = 1 and an additive key = 0\n" +
                "ES appears 4 times with a multiplicative key = 1 and an additive key = 11\n" +
                "FT appears 1 times with a multiplicative key = 1 and an additive key = 12\n" +
                "ND appears 3 times with a multiplicative key = 3 and an additive key = 2\n" +
                "OE appears 1 times with a multiplicative key = 3 and an additive key = 11\n" +
                "DT appears 2 times with a multiplicative key = 3 and an additive key = 16\n" +
                "SI appears 1 times with a multiplicative key = 3 and an additive key = 21\n" +
                "PH appears 1 times with a multiplicative key = 5 and an additive key = 4\n" +
                "ME appears 4 times with a multiplicative key = 5 and an additive key = 19\n" +
                "EY appears 5 times with a multiplicative key = 7 and an additive key = 3\n" +
                "GA appears 1 times with a multiplicative key = 7 and an additive key = 7\n" +
                "IC appears 3 times with a multiplicative key = 7 and an additive key = 11\n" +
                "KE appears 5 times with a multiplicative key = 7 and an additive key = 15\n" +
                "YS appears 1 times with a multiplicative key = 7 and an additive key = 17\n" +
                "XT appears 1 times with a multiplicative key = 9 and an additive key = 0\n" +
                "PL appears 2 times with a multiplicative key = 9 and an additive key = 2\n" +
                "SO appears 1 times with a multiplicative key = 9 and an additive key = 11\n" +
                "CY appears 1 times with a multiplicative key = 9 and an additive key = 15\n" +
                "EA appears 5 times with a multiplicative key = 9 and an additive key = 21\n" +
                "OM appears 1 times with a multiplicative key = 11 and an additive key = 5\n" +
                "GE appears 1 times with a multiplicative key = 11 and an additive key = 9\n" +
                "CA appears 2 times with a multiplicative key = 11 and an additive key = 11\n" +
                "US appears 1 times with a multiplicative key = 11 and an additive key = 15\n" +
                "EC appears 3 times with a multiplicative key = 11 and an additive key = 23\n" +
                "RT appears 1 times with a multiplicative key = 15 and an additive key = 2\n" +
                "SU appears 1 times with a multiplicative key = 15 and an additive key = 9\n" +
                "SW appears 2 times with a multiplicative key = 17 and an additive key = 1\n" +
                "IM appears 2 times with a multiplicative key = 17 and an additive key = 5\n" +
                "PT appears 1 times with a multiplicative key = 17 and an additive key = 10\n" +
                "OS appears 1 times with a multiplicative key = 17 and an additive key = 13\n" +
                "IO appears 2 times with a multiplicative key = 19 and an additive key = 1\n" +
                "NT appears 2 times with a multiplicative key = 19 and an additive key = 4\n" +
                "EK appears 5 times with a multiplicative key = 19 and an additive key = 9\n" +
                "AG appears 1 times with a multiplicative key = 19 and an additive key = 17\n" +
                "OW appears 1 times with a multiplicative key = 21 and an additive key = 3\n" +
                "EM appears 1 times with a multiplicative key = 21 and an additive key = 5\n" +
                "AI appears 1 times with a multiplicative key = 21 and an additive key = 11\n" +
                "LT appears 3 times with a multiplicative key = 21 and an additive key = 14\n" +
                "MU appears 2 times with a multiplicative key = 21 and an additive key = 19\n" +
                "SA appears 2 times with a multiplicative key = 21 and an additive key = 23\n" +
                "BL appears 1 times with a multiplicative key = 23 and an additive key = 14\n" +
                "YI appears 1 times with a multiplicative key = 23 and an additive key = 15\n" +
                "CO appears 2 times with a multiplicative key = 25 and an additive key = 3\n" +
                "AM appears 2 times with a multiplicative key = 25 and an additive key = 5\n" +
                "WI appears 3 times with a multiplicative key = 25 and an additive key = 9\n" +
                "SE appears 1 times with a multiplicative key = 25 and an additive key = 13\n" +
                "OA appears 1 times with a multiplicative key = 25 and an additive key = 17\n");

        assertEquals(testJTextArea.getText(), affineKnownPlaintextAttack.getMainCipherTextArea().getText());
    }
}