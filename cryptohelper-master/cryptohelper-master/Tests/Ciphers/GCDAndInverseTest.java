package Ciphers;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class GCDAndInverseTest {
    private GCDAndInverse gcdAndInverse;

    @Test
    void createGCDAndInverseTest() {
        gcdAndInverse = new GCDAndInverse();
        assertNotNull(gcdAndInverse);
    }

    @Test
    void testActionButtonActionPerformed(){
        gcdAndInverse = new GCDAndInverse();

        gcdAndInverse.getInverseOfJTextField().setText("40");
        gcdAndInverse.getModJTextField().setText("5");

        JTextArea testJTextArea = new JTextArea();

        gcdAndInverse.getActionButton().doClick();

        testJTextArea.setText("The inverse algorithm used here is not euclid's algo, rather it is one I came up with that is not\n" +
                " as efficient\n" +
                "\n" +
                "gcd is 5.0\n" +
                "There is no inverse, sorry\n");


        assertEquals(testJTextArea.getText(), gcdAndInverse.getMainCipherTextArea().getText());
    }

}