package Ciphers;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class PolyMonoCalculatorTest {
    private PolyMonoCalculator polyMonoCalculator;

    @Test
    void createPolyMonoCalculatorTest(){
        polyMonoCalculator = new PolyMonoCalculator();
        assertNotNull(polyMonoCalculator);
    }


    @Test
    void actionButtonActionPerformed() {
        polyMonoCalculator = new PolyMonoCalculator();

        polyMonoCalculator.getjSpinner().setValue(3);

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("Testing Functionality");

        polyMonoCalculator.setInputText(testJTextArea);
        polyMonoCalculator.getActionButton().doClick();

        testJTextArea.setText(".065 = Monoalphabetic, .038 means polyalphabetic.  I'll add some bar graphs in the future.\n" +
                "\n" +
                "0.14285714285714285\n" +
                "0.0\n" +
                "0.06666666666666667\n");

        assertEquals(testJTextArea.getText(), polyMonoCalculator.getMainCipherTextArea().getText());

    }
}