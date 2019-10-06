package Ciphers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AutoKeyDecipher extends CookieCutterViginereCiphers {
    private JLabel keyWordLabel;
    private JTextField textField;
    private JCheckBox checkBox;

    private JPanel bottomCenterPanel;

    public AutoKeyDecipher(){
        super();
        initializeActionBtn("Decipher");
    }

    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        String inputString = getCipherService().formatString(getInputText());
        String outputString = "";
        String s1 = getCipherService().formatString(textField);
        char[] charArray;

        if (!checkBox.isSelected())
        {
            s1 = s1 + inputString;

            for (int x = 0; x < inputString.length(); x++)
            {
                for (int y = 0; y < 26; y++)
                {
                    if(getTable().getValueAt(s1.charAt(x%s1.length())-'A', y).equals((new Character(inputString.charAt(x))).toString()))
                        outputString = outputString + getTable().getColumnName(y);
                }
            }

            charArray = new char[outputString.length() + ((outputString.length()-1)/5)];

            for (int x = 0, y = 0; x < outputString.length(); x++, y++)
            {
                charArray[y] = outputString.charAt(x);
                if ((x+1)%5 == 0 && (x+1)!= outputString.length()) charArray[++y] = ' ';
            }
        }
        else
        {
            for (int x = 0; x < inputString.length(); x++)
            {
                for (int y = 0; y < 26; y++)
                {
                    if(getTable().getValueAt(s1.charAt(x%s1.length())-'A', y).equals((new Character(inputString.charAt(x))).toString()))
                        outputString = outputString + getTable().getColumnName(y);
                }
                s1 = s1 + outputString.charAt(x);
                s1 = s1.toUpperCase();
            }

            charArray = new char[outputString.length() + ((outputString.length()-1)/5)];

            for (int x = 0, y = 0; x < outputString.length(); x++, y++)
            {
                charArray[y] = outputString.charAt(x);
                if ((x+1)%5 == 0 && (x+1)!= outputString.length()) charArray[++y] = ' ';
            }
        }

        getOutputTextArea().setText(new String(charArray));
    }

    @Override
    public JPanel initializeBottomTextPanel() {
        keyWordLabel = new JLabel();
        textField = new JTextField();
        checkBox = new JCheckBox();

        bottomCenterPanel = new JPanel();
        bottomCenterPanel.setLayout(new BorderLayout());

        keyWordLabel.setText("Keyword");
        bottomCenterPanel.add(keyWordLabel, BorderLayout.WEST);

        textField.setFont(new Font("Monospaced", 0, 12));
        bottomCenterPanel.add(textField, BorderLayout.CENTER);

        checkBox.setText("PlainText");
        bottomCenterPanel.add(checkBox, BorderLayout.EAST);

        return bottomCenterPanel;
    }
}
