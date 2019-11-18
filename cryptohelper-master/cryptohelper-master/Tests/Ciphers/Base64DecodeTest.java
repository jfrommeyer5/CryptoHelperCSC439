package Ciphers;

import java.util.Base64;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class Base64DecodeTest {
    Base64Decode base64Decode;

    @Test
    void createBase64Decode(){
        base64Decode = new Base64Decode();
        assertNotNull(base64Decode);
    }

    @Test
    void actionButtonActionPerformed() {
        base64Decode = new Base64Decode();

        JTextArea testJTextArea = new JTextArea();
        testJTextArea.setText("YWNl");

        base64Decode.setInputText(testJTextArea);
        base64Decode.getActionButton().doClick();

        testJTextArea.setText(new String(Base64.getDecoder().decode(testJTextArea.getText().getBytes())));

        assertEquals(testJTextArea.getText(), base64Decode.getMainCipherTextArea().getText());



        testJTextArea.setText("YWJjZA==");

        base64Decode.setInputText(testJTextArea);
        base64Decode.getActionButton().doClick();

        testJTextArea.setText(new String(Base64.getDecoder().decode(testJTextArea.getText().getBytes())));

        assertEquals(testJTextArea.getText(), base64Decode.getMainCipherTextArea().getText().substring(0, base64Decode.getMainCipherTextArea().getText().length() - 1));



        testJTextArea.setText("YWJjZGU=");

        base64Decode.setInputText(testJTextArea);
        base64Decode.getActionButton().doClick();

        testJTextArea.setText(new String(Base64.getDecoder().decode(testJTextArea.getText().getBytes())));

        assertEquals(testJTextArea.getText(), base64Decode.getMainCipherTextArea().getText().substring(0, base64Decode.getMainCipherTextArea().getText().length() - 1));



        testJTextArea.setText("        Vm0xMGEySXlUa2hVYWxaU1ltdEtjVnBXVmt0a1ZteHhVMjVPYTFadVFURlZWM0JEWVZkV1ZsTnVRbGhpUjFKUVdrY3hTMWRHV2xoYVJuQldUVVZ3TmxkWGNFcE5WMHB5WWtWc1ZXRnJTbkZaYkdRMFRWWmtkVmw2YkZGVlZEQTU=");

        base64Decode.setInputText(testJTextArea);
        base64Decode.getjSpinner().setValue(5);
        base64Decode.getActionButton().doClick();

        testJTextArea.setText("This is going to become a long string");

        assertEquals(testJTextArea.getText(), base64Decode.getMainCipherTextArea().getText().substring(0, base64Decode.getMainCipherTextArea().getText().length() - 1));


    }
}