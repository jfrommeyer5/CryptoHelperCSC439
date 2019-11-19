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


        testJTextArea.setText("This is going to become a long string");

        base64Encode.setInputText(testJTextArea);
        base64Encode.getjSpinner().setValue(5);
        base64Encode.getActionButton().doClick();

        testJTextArea.setText("Vm0xMGEySXlUa2hVYWxaU1ltdEtjVnBXVmt0a1ZteHhVMjVPYTFadVFURlZWM0JEWVZkV1ZsTnVRbGhpUjFKUVdrY3hTMWRHV2xoYVJuQldUVVZ3TmxkWGNFcE5WMHB5WWtWc1ZXRnJTbkZaYkdRMFRWWmtkVmw2YkZGVlZEQTU=");

        assertEquals(testJTextArea.getText(), base64Encode.getMainCipherTextArea().getText());


    }
}