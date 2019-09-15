package Ciphers;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;


//extend BaseCipher eventually
public class BiGraphs extends BaseCipher{



    public BiGraphs(){
        super();
        initializeActionBtn("Show BiGraphs");
    }

    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        String inputString = formatString(getInputText());
        String tempString;
        Counter counter = new Counter();

        for (int x = 0; x < inputString.length() - 1; x++)
        {
            tempString = inputString.substring(x, x+2);
            if (inputString.indexOf(tempString, x)>=0)
            {
                if (!counter.contains(tempString))
                {
                    counter.add(tempString, x);
                    for (int y = x; y >= 0;)
                    {
                        if ((y = inputString.indexOf(tempString, y+2)) >= 0) counter.inc(y);
                    }
                }
            }
        }

        getMainCipherTextArea().setText("");

        for (int x = 0; x < counter.length; x++)
        {
            getMainCipherTextArea().append(counter.sArray[x]);
            getMainCipherTextArea().append(" = ");
            getMainCipherTextArea().append(new Integer(counter.iArray[x]).toString());
            getMainCipherTextArea().append(" at positions ");
            for (int y = 0; y < counter.iArray[x]; y++)
            {
                getMainCipherTextArea().append("" + counter.pArray[x][y]);
                if (y!=counter.iArray[x] - 1)
                    getMainCipherTextArea().append(",");
            }
            getMainCipherTextArea().append("\n");
        }
    }

    //temporary. will be extracted into a service of methods simliar to these.
    private String formatString(JTextArea jta)
    {
        String inputString = jta.getText();
        inputString = inputString.toUpperCase();
        inputString = inputString.replace(',', ' ');
        inputString = inputString.replace('.', ' ');
        inputString = inputString.replace('?', ' ');
        inputString = inputString.replace('\"', ' ');
        inputString = inputString.replace('!', ' ');
        inputString = inputString.replace('@', ' ');
        inputString = inputString.replace('#', ' ');
        inputString = inputString.replace('$', ' ');
        inputString = inputString.replace('%', ' ');
        inputString = inputString.replace('^', ' ');
        inputString = inputString.replace('&', ' ');
        inputString = inputString.replace('*', ' ');
        inputString = inputString.replace('(', ' ');
        inputString = inputString.replace(')', ' ');
        inputString = inputString.replace('-', ' ');
        inputString = inputString.replace('+', ' ');
        inputString = inputString.replace('/', ' ');
        inputString = inputString.replace('\\', ' ');
        inputString = inputString.replace('<', ' ');
        inputString = inputString.replace('>', ' ');
        inputString = inputString.replace('\'', ' ');
        inputString = inputString.replace('~', ' ');
        inputString = inputString.replace('`', ' ');
        inputString = inputString.replace('[', ' ');
        inputString = inputString.replace(']', ' ');
        inputString = inputString.replace('|', ' ');
        inputString = inputString.replace('{', ' ');
        inputString = inputString.replace('}', ' ');
        inputString = inputString.replace('=', ' ');
        inputString = inputString.replace(':', ' ');
        inputString = inputString.replace(';', ' ');
        inputString = inputString.replace('0', ' ');
        inputString = inputString.replace('1', ' ');
        inputString = inputString.replace('2', ' ');
        inputString = inputString.replace('3', ' ');
        inputString = inputString.replace('4', ' ');
        inputString = inputString.replace('5', ' ');
        inputString = inputString.replace('6', ' ');
        inputString = inputString.replace('7', ' ');
        inputString = inputString.replace('8', ' ');
        inputString = inputString.replace('9', ' ');
        inputString = inputString.replaceAll(" ", "");
        inputString = inputString.replaceAll("\n", "");
        return inputString;
    }

}
