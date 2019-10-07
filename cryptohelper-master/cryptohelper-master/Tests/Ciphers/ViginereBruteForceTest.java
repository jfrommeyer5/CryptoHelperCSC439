package Ciphers;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class ViginereBruteForceTest {
    private ViginereBruteForce viginereBruteForce;

    @Test
    void createViginereEncipherTest(){
        viginereBruteForce = new ViginereBruteForce();
        assertNotNull(viginereBruteForce);
    }

    @Test
    void actionButtonActionPerformed() {
        viginereBruteForce = new ViginereBruteForce();

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("Testing Functionality");

        viginereBruteForce.getjSpinner().setValue(1);

        viginereBruteForce.setInputText(testJTextArea);
        viginereBruteForce.getActionButton().doClick();

        testJTextArea.setText("Key = A, friedman = 0.06315789473684211, pt = TESTINGFUNCTIONALITY\n" +
                "Key = B, friedman = 0.06315789473684211, pt = SDRSHMFETMBSHNMZKHSX\n" +
                "Key = C, friedman = 0.06315789473684211, pt = RCQRGLEDSLARGMLYJGRW\n" +
                "Key = D, friedman = 0.06315789473684211, pt = QBPQFKDCRKZQFLKXIFQV\n" +
                "Key = E, friedman = 0.06315789473684211, pt = PAOPEJCBQJYPEKJWHEPU\n" +
                "Key = F, friedman = 0.06315789473684211, pt = OZNODIBAPIXODJIVGDOT\n" +
                "Key = G, friedman = 0.06315789473684211, pt = NYMNCHAZOHWNCIHUFCNS\n" +
                "Key = H, friedman = 0.06315789473684211, pt = MXLMBGZYNGVMBHGTEBMR\n" +
                "Key = I, friedman = 0.06315789473684211, pt = LWKLAFYXMFULAGFSDALQ\n" +
                "Key = J, friedman = 0.0631578947368421, pt = KVJKZEXWLETKZFERCZKP\n" +
                "Key = K, friedman = 0.0631578947368421, pt = JUIJYDWVKDSJYEDQBYJO\n" +
                "Key = L, friedman = 0.0631578947368421, pt = ITHIXCVUJCRIXDCPAXIN\n" +
                "Key = M, friedman = 0.0631578947368421, pt = HSGHWBUTIBQHWCBOZWHM\n" +
                "Key = N, friedman = 0.0631578947368421, pt = GRFGVATSHAPGVBANYVGL\n" +
                "Key = O, friedman = 0.0631578947368421, pt = FQEFUZSRGZOFUAZMXUFK\n" +
                "Key = P, friedman = 0.0631578947368421, pt = EPDETYRQFYNETZYLWTEJ\n" +
                "Key = Q, friedman = 0.0631578947368421, pt = DOCDSXQPEXMDSYXKVSDI\n" +
                "Key = R, friedman = 0.0631578947368421, pt = CNBCRWPODWLCRXWJURCH\n" +
                "Key = S, friedman = 0.0631578947368421, pt = BMABQVONCVKBQWVITQBG\n" +
                "Key = T, friedman = 0.0631578947368421, pt = ALZAPUNMBUJAPVUHSPAF\n" +
                "Key = U, friedman = 0.06315789473684211, pt = ZKYZOTMLATIZOUTGROZE\n" +
                "Key = V, friedman = 0.06315789473684211, pt = YJXYNSLKZSHYNTSFQNYD\n" +
                "Key = W, friedman = 0.06315789473684211, pt = XIWXMRKJYRGXMSREPMXC\n" +
                "Key = X, friedman = 0.06315789473684211, pt = WHVWLQJIXQFWLRQDOLWB\n" +
                "Key = Y, friedman = 0.06315789473684211, pt = VGUVKPIHWPEVKQPCNKVA\n");

        assertEquals(testJTextArea.getText(), viginereBruteForce.getOutputTextArea().getText());

    }
}