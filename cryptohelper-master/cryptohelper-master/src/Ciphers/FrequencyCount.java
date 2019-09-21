package Ciphers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//extend BaseCipher eventually
public class FrequencyCount extends BaseCipher{
    public FrequencyCount(){
        super();
        initializeActionBtn("Perform Frequency Count");
    }

    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        String inputString = getInputText().getText();
        inputString = inputString.toUpperCase();
        int array[] = new int[26];
        String sArray[];

        getMainCipherTextArea().setText("");

        for (int x = 0; x < inputString.length(); x++)
        {
            switch (inputString.charAt(x))
            {
                case 'A': array[0]++; break;
                case 'B': array[1]++; break;
                case 'C': array[2]++; break;
                case 'D': array[3]++; break;
                case 'E': array[4]++; break;
                case 'F': array[5]++; break;
                case 'G': array[6]++; break;
                case 'H': array[7]++; break;
                case 'I': array[8]++; break;
                case 'J': array[9]++; break;
                case 'K': array[10]++; break;
                case 'L': array[11]++; break;
                case 'M': array[12]++; break;
                case 'N': array[13]++; break;
                case 'O': array[14]++; break;
                case 'P': array[15]++; break;
                case 'Q': array[16]++; break;
                case 'R': array[17]++; break;
                case 'S': array[18]++; break;
                case 'T': array[19]++; break;
                case 'U': array[20]++; break;
                case 'V': array[21]++; break;
                case 'W': array[22]++; break;
                case 'X': array[23]++; break;
                case 'Y': array[24]++; break;
                case 'Z': array[25]++; break;
            }
        }

        for (int x = 0; x < 26; x++)
        {
            getMainCipherTextArea().append(new Character((char)('A'+x)).toString());
            getMainCipherTextArea().append(" = ");
            getMainCipherTextArea().append(new Integer(array[x]).toString());
            getMainCipherTextArea().append(" = ");
            for (int y = 0; y<array[x]; y++)
                getMainCipherTextArea().append("I");
            if (x!=25) getMainCipherTextArea().append("\n");
        }

        getMainCipherTextArea().append("\n");

        sArray = inputString.split(" ");

        getMainCipherTextArea().append("\nHere are all the 1 letter words\n");
        for (int x = 0; x < sArray.length; x++)
        {
            if (sArray[x].length() == 1) {getMainCipherTextArea().append(sArray[x]); getMainCipherTextArea().append("\n");}
        }

        getMainCipherTextArea().append("\nHere are all the 2 letter words\n");
        for (int x = 0; x < sArray.length; x++)
        {
            if (sArray[x].length() == 2) {getMainCipherTextArea().append(sArray[x]); getMainCipherTextArea().append("\n");}
        }

        getMainCipherTextArea().append("\nHere are all the 3 letter words\n");
        for (int x = 0; x < sArray.length; x++)
        {
            if (sArray[x].length() == 3) {getMainCipherTextArea().append(sArray[x]); getMainCipherTextArea().append("\n");}
        }

        getMainCipherTextArea().append("\nHere are all the initial letters\n");
        for (int x = 0; x < sArray.length; x++)
        {
            if (sArray[x].length()>0)
                getMainCipherTextArea().append(new Character(sArray[x].charAt(0)).toString());
        }
        getMainCipherTextArea().append("\n");

        getMainCipherTextArea().append("\nHere are all the final letters\n");
        for (int x = 0; x < sArray.length; x++)
        {
            if (sArray[x].length()>0)
                getMainCipherTextArea().append(new Character(sArray[x].charAt(sArray[x].length()-1)).toString());
        }
        getMainCipherTextArea().append("\n");

        getMainCipherTextArea().append("\nHere are all the doubled letters\n");
        char c = inputString.charAt(0);
        for (int x = 1; x < inputString.length(); x++)
        {
            if (inputString.charAt(x) == c)
            {
                getMainCipherTextArea().append(new Character(c).toString());
                getMainCipherTextArea().append(new Character(c).toString());
                getMainCipherTextArea().append("\n");
            }
            c = inputString.charAt(x);
        }

        getMainCipherTextArea().append("\nFrequencies for English\n");

        getMainCipherTextArea().append("a = 07 = IIIIIII                 n = 08 = IIIIIIII   \n");
        getMainCipherTextArea().append("b = 01 = I                       o = 07 = IIIIIII    \n");
        getMainCipherTextArea().append("c = 03 = III                     p = 03 = III        \n");
        getMainCipherTextArea().append("d = 04 = IIII                    q =                 \n");
        getMainCipherTextArea().append("e = 13 = IIIIIIIIIIIII           r = 08 = IIIIIIII   \n");
        getMainCipherTextArea().append("f = 03 = III                     s = 06 = IIIIII     \n");
        getMainCipherTextArea().append("g = 02 = II                      t = 09 = IIIIIIIII  \n");
        getMainCipherTextArea().append("h = 04 = IIII                    u = 03 = III        \n");
        getMainCipherTextArea().append("i = 07 = IIIIIII                 v = 01 = I          \n");
        getMainCipherTextArea().append("j =                              w = 02 = II         \n");
        getMainCipherTextArea().append("k =                              x =                 \n");
        getMainCipherTextArea().append("l = 04 = IIII                    y = 02 = II         \n");
        getMainCipherTextArea().append("m = 03 = III                     z =                 \n");
    }
}
