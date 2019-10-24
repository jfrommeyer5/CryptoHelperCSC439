package Ciphers;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.util.Base64;

import static org.junit.jupiter.api.Assertions.*;

class Base64EncodeTest {
    private Base64Encode base64Encode;

    @Test
    void createBase64Encode(){
        base64Encode = new Base64Encode();
        assertNotNull(base64Encode);
    }

    @Test
    void actionButtonActionPerformed() {
        base64Encode = new Base64Encode();

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("abcd");

        base64Encode.setInputText(testJTextArea);
        base64Encode.getActionButton().doClick();

        testJTextArea.setText(Base64.getEncoder().encodeToString(testJTextArea.getText().getBytes()));

        assertEquals(testJTextArea.getText(), base64Encode.getMainCipherTextArea().getText());



        testJTextArea.setText("testing Functionality");

        base64Encode.setInputText(testJTextArea);
        base64Encode.getActionButton().doClick();

        testJTextArea.setText(Base64.getEncoder().encodeToString(testJTextArea.getText().getBytes()));

        assertEquals(testJTextArea.getText(), base64Encode.getMainCipherTextArea().getText());



        testJTextArea.setText("This is neat");

        base64Encode.setInputText(testJTextArea);
        base64Encode.getActionButton().doClick();

        testJTextArea.setText(Base64.getEncoder().encodeToString(testJTextArea.getText().getBytes()));

        assertEquals(testJTextArea.getText(), base64Encode.getMainCipherTextArea().getText());


    }
}