package Ciphers;

import java.awt.event.ActionEvent;

public class pigmorse extends BaseCipher{
    public pigmorse(){
        super();
        initializeActionBtn("Encode Pig-Morse");
        setMainCipherPanelText("Pig-Morse Code");
    }



    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {




        String encryptedText = encipher(getInputText().getText()).toLowerCase();


       // String msg = getInputText().getText().toLowerCase();
        String outputting = "";

        for(int i = 0; i<encryptedText.length(); i++){
            outputting = outputting + morseEncode(encryptedText.charAt(i));
        }

        getMainCipherTextArea().setText(encryptedText + "\n" + outputting);






    }


    public String encipher(String msg) {
        String[] words = msg.split(" ");
        String cipher = "";
        int j = 0;
        int firstVowel = 0;
        char ch;
        String a, b;
        for (String word : words) {
            //Filter out any special characters besides whitespace
            word = word.replaceAll("[^a-zA-Z0-9_ ]", "");
            word = word.toUpperCase();

            if (word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O") || word.startsWith("U"))
                cipher += word + "-WAY ";

                //Otherwise, it starts with a consonant.
            else {
                //If the word has no vowels, keep as is-- just adding -ay.
                if (!(word.contains("A") || word.contains("E") || word.contains("I") || word.contains("O") || word.contains("U") || word.contains("Y"))) {
                    cipher += word + "-AY ";
                }
                else {
                    for (j = 0; j < word.length(); j++) {
                        ch = word.charAt(j);
                        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || (ch == 'Y' && j != 0)) {
                            firstVowel = j;
                            break;
                        }
                    }
                    a = word.substring(firstVowel);
                    b = word.substring(0, firstVowel);
                    cipher += a + "-" + b + "AY ";
                }
            }
        }
        return cipher;
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



