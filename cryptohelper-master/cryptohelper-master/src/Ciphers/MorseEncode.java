package Ciphers;

import java.awt.event.ActionEvent;

public class MorseEncode extends BaseCipher{
    public MorseEncode(){
        super();
        initializeActionBtn("Encode Morse");
	setMainCipherPanelText("Morse Code");
    }

    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {


        String msg = getInputText().getText();
        String outputting = "";

        for(int i = 0; i<msg.length(); i++){
            outputting = outputting + morseEncode(msg.charAt(i));
        }

        getMainCipherTextArea().setText(outputting);



    }
   public  String morseEncode(char x) {

        // refer to the Morse table
        // image attached in the article
        switch (x) {
            case 'a':
                return ".-";
            case 'b':
                return "-...";
            case 'c':
                return "-.-.";
            case 'd':
                return "-..";
            case 'e':
                return ".";
            case 'f':
                return "..-.";
            case 'g':
                return "--.";
            case 'h':
                return "....";
            case 'i':
                return "..";
            case 'j':
                return ".---";
            case 'k':
                return "-.-";
            case 'l':
                return ".-..";
            case 'm':
                return "--";
            case 'n':
                return "-.";
            case 'o':
                return "---";
            case 'p':
                return ".--.";
            case 'q':
                return "--.-";
            case 'r':
                return ".-.";
            case 's':
                return "...";
            case 't':
                return "-";
            case 'u':
                return "..-";
            case 'v':
                return "...-";
            case 'w':
                return ".--";
            case 'x':
                return "-..-";
            case 'y':
                return "-.--";
            // for space
            case 'z':
                return "--..";
        }
       return "";
   }

}
