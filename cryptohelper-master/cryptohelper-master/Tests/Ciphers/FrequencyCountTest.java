package Ciphers;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyCountTest {
    private FrequencyCount testFrequencyCount;

    @Test
    void createFrequencyCountTest() {
        testFrequencyCount = new FrequencyCount();
        assertNotNull(testFrequencyCount);

    }

    @Test
    void testActionButtonActionPerformed(){
        testFrequencyCount = new FrequencyCount();

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("Testing Functionality");

        testFrequencyCount.setInputText(testJTextArea);
        testFrequencyCount.getActionButton().doClick();

        testJTextArea.setText("A = 1 = I\n" +
                "B = 0 = \n" +
                "C = 1 = I\n" +
                "D = 0 = \n" +
                "E = 1 = I\n" +
                "F = 1 = I\n" +
                "G = 1 = I\n" +
                "H = 0 = \n" +
                "I = 3 = III\n" +
                "J = 0 = \n" +
                "K = 0 = \n" +
                "L = 1 = I\n" +
                "M = 0 = \n" +
                "N = 3 = III\n" +
                "O = 1 = I\n" +
                "P = 0 = \n" +
                "Q = 0 = \n" +
                "R = 0 = \n" +
                "S = 1 = I\n" +
                "T = 4 = IIII\n" +
                "U = 1 = I\n" +
                "V = 0 = \n" +
                "W = 0 = \n" +
                "X = 0 = \n" +
                "Y = 1 = I\n" +
                "Z = 0 = \n" +
                "\n" +
                "Here are all the 1 letter words\n" +
                "\n" +
                "Here are all the 2 letter words\n" +
                "\n" +
                "Here are all the 3 letter words\n" +
                "\n" +
                "Here are all the initial letters\n" +
                "TF\n" +
                "\n" +
                "Here are all the final letters\n" +
                "GY\n" +
                "\n" +
                "Here are all the doubled letters\n" +
                "\n" +
                "Frequencies for English\n" +
                "a = 07 = IIIIIII                 n = 08 = IIIIIIII   \n" +
                "b = 01 = I                       o = 07 = IIIIIII    \n" +
                "c = 03 = III                     p = 03 = III        \n" +
                "d = 04 = IIII                    q =                 \n" +
                "e = 13 = IIIIIIIIIIIII           r = 08 = IIIIIIII   \n" +
                "f = 03 = III                     s = 06 = IIIIII     \n" +
                "g = 02 = II                      t = 09 = IIIIIIIII  \n" +
                "h = 04 = IIII                    u = 03 = III        \n" +
                "i = 07 = IIIIIII                 v = 01 = I          \n" +
                "j =                              w = 02 = II         \n" +
                "k =                              x =                 \n" +
                "l = 04 = IIII                    y = 02 = II         \n" +
                "m = 03 = III                     z =                 \n");


        assertEquals(testJTextArea.getText(), testFrequencyCount.getMainCipherTextArea().getText());

    }

    }
