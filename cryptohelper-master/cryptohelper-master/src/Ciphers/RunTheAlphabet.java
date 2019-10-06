package Ciphers;

import java.awt.event.*;

public class RunTheAlphabet extends BaseCipher {

    public RunTheAlphabet(){
        super();
        initializeActionBtn("Run The Alphabet");
    }

    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        String inputString = getInputText().getText();
        inputString = inputString.toLowerCase();

        getMainCipherTextArea().setText("");

        for (int x = 0; x < 25; x++)
        {
            for (int y = 0; y < inputString.length(); y++)
            {
                //jTextArea4.append(new Character((char)(inputString.charAt(y)+x)).toString());
                if (inputString.charAt(y) >='a' && inputString.charAt(y) <= 'z')
                {
                    getMainCipherTextArea().append(new Character((char)((inputString.charAt(y)+x)%('z'+1)+((int)((inputString.charAt(y)+x)/('z'+1))*'a'))).toString());
                }
                else getMainCipherTextArea().append(" ");
            }
            getMainCipherTextArea().append("\n");
        }
    }
}
