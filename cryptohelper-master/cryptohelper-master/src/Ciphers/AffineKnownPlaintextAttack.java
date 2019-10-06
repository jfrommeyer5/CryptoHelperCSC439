package Ciphers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AffineKnownPlaintextAttack extends BaseCipher {

    private JCheckBox checkBox;
    private JTextField textField;
    private JLabel label;
    private JPanel topPanel;




    public AffineKnownPlaintextAttack(){
        super();

        checkBox = new JCheckBox();
        textField = new JTextField();
        topPanel = new JPanel();
        label = new JLabel();
        initializeActionBtn("Execute");

        topPanel.setLayout(new BorderLayout());
        label.setText("Enter Keyword");
        topPanel.add(label, BorderLayout.WEST);

        textField.setText("the");
        topPanel.add(textField, BorderLayout.CENTER);

        checkBox.setText("Shift first");
        topPanel.add(checkBox, BorderLayout.EAST);

        getMainCipherPanel().add(topPanel, BorderLayout.NORTH);

    }

    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        /*
         *Write an affine solver that will look for occurences of all 312 combinations of a known piece of plaintext all the occurences & display the keys that were used
         *{
         *take out spaces
         *outer if that will detect whether the checkbox was checked & take the appropriate action.
         *two for loops to iterate through the combinations
         *inner for loop will use same ago used for trigraph in regards finding occurences
         *}
         *
         *make some tally bars in places where it would be useful to get information at a glance.
         */
        String inputString = getCipherService().formatString(getInputText());
        String searchString = getCipherService().formatString(textField);

        getMainCipherTextArea().setText("The following are all the possible combinations of \"" + searchString + "\"\n");
        getMainCipherTextArea().append("which are contained in the cyphertext message and the affine\n");
        getMainCipherTextArea().append("keys used to encrypt them.\n\n");

        if (!checkBox.isSelected())
        {
            searchCeasar(1, inputString, searchString);
            searchCeasar(3, inputString, searchString);
            searchCeasar(5, inputString, searchString);
            searchCeasar(7, inputString, searchString);
            searchCeasar(9, inputString, searchString);
            searchCeasar(11, inputString, searchString);
            searchCeasar(15, inputString, searchString);
            searchCeasar(17, inputString, searchString);
            searchCeasar(19, inputString, searchString);
            searchCeasar(21, inputString, searchString);
            searchCeasar(23, inputString, searchString);
            searchCeasar(25, inputString, searchString);
        }
        else
        {
            searchCeasarReverse(1, inputString, searchString);
            searchCeasarReverse(3, inputString, searchString);
            searchCeasarReverse(5, inputString, searchString);
            searchCeasarReverse(7, inputString, searchString);
            searchCeasarReverse(9, inputString, searchString);
            searchCeasarReverse(11, inputString, searchString);
            searchCeasarReverse(15, inputString, searchString);
            searchCeasarReverse(17, inputString, searchString);
            searchCeasarReverse(19, inputString, searchString);
            searchCeasarReverse(21, inputString, searchString);
            searchCeasarReverse(23, inputString, searchString);
            searchCeasarReverse(25, inputString, searchString);
        }
    }

    private void searchCeasar(int m, String inputString, String searchString)
    {
        int counter;
        String mSearchString;
        char[] charArray;

        for (int x = 0; x < 25; x++)
        {
            charArray = searchString.toCharArray();
            for (int y = 0; y < charArray.length; y++)
            {
                charArray[y] = (char)(charArray[y] - 64);
                charArray[y] = (char)((charArray[y] * m)%26);
                charArray[y] = (char)((charArray[y] + x)%26);
                if (charArray[y] == 0) charArray[y] = (char)26;
                charArray[y] = (char)(charArray[y] + 64);
            }
            mSearchString = new String(charArray);
            // insert code that now searches using the content of mSearchString

            counter = 0;
            if (inputString.indexOf(mSearchString)==0) counter++;
            for (int y = 0; y >= 0;)
            {
                if ((y = inputString.indexOf(mSearchString, y+1)) >= 0) counter++;
            }
            if (counter > 0)
            {
                getMainCipherTextArea().append(mSearchString + " appears " + counter + " times with a ");
                getMainCipherTextArea().append("multiplicative key = " + m + " and an additive key = " + x);
                getMainCipherTextArea().append("\n");
            }
        }
    }

    private void searchCeasarReverse(int m, String inputString, String searchString)
    {
        int counter;
        String mSearchString;
        char[] charArray;
        for (int x = 0; x < 25; x++)
        {
            charArray = searchString.toCharArray();
            for (int y = 0; y < charArray.length; y++)
            {
                charArray[y] = (char)(charArray[y] - 64);
                charArray[y] = (char)((charArray[y] + x)%26);
                charArray[y] = (char)((charArray[y] * m)%26);
                if (charArray[y] == 0) charArray[y] = (char)26;
                charArray[y] = (char)(charArray[y] + 64);
            }
            mSearchString = new String(charArray);
            // insert code that now searches using the content of mSearchString

            counter = 0;
            if (inputString.indexOf(mSearchString)==0) counter++;
            for (int y = 0; y >= 0;)
            {
                if ((y = inputString.indexOf(mSearchString, y+1)) >= 0) counter++;
            }
            if (counter > 0)
            {
                getMainCipherTextArea().append(mSearchString + " appears " + counter + " times with a ");
                getMainCipherTextArea().append("multiplicative key = " + m + " and an additive key = " + x);
                getMainCipherTextArea().append("\n");
            }
        }
    }

    public JTextField getTextField() {
        return textField;
    }


    public JCheckBox getCheckBox() {
        return checkBox;
    }

}
