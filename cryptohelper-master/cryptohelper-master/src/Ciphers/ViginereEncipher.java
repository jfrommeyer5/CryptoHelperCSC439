package Ciphers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ViginereEncipher extends CookieCutterViginereCiphers {

    private JPanel keyWordPanel;
    private JLabel keyWordLabel;
    private JTextField keyWordTextField;


    public ViginereEncipher(){
        super();
        initializeActionBtn("Enchiper");
    }

    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        String inputString = getCipherService().formatString(getInputText());
        String outputString = "";
        String s1 = getCipherService().formatString(keyWordTextField);

        for (int x = 0; x < inputString.length(); x++)
        {
            outputString = outputString + getTable().getValueAt(s1.charAt(x%s1.length())-'A', inputString.charAt(x)-'A');
        }

        char[] charArray = new char[outputString.length() + ((outputString.length()-1)/5)];

        for (int x = 0, y = 0; x < outputString.length(); x++, y++)
        {
            charArray[y] = outputString.charAt(x);
            if ((x+1)%5 == 0 && (x+1)!= outputString.length()) charArray[++y] = ' ';
        }

        getOutputTextArea().setText(new String(charArray));
    }

    @Override
    public JPanel initializeBottomTextPanel() {

        keyWordPanel = new JPanel();
        keyWordLabel = new JLabel();
        keyWordTextField = new JTextField();

        keyWordPanel.setLayout(new BorderLayout());

        keyWordLabel.setText("Keyword");
        keyWordPanel.add(keyWordLabel, BorderLayout.WEST);

        keyWordTextField.setFont(new Font("Monospaced", 0, 12));
        keyWordPanel.add(keyWordTextField, BorderLayout.CENTER);

        return keyWordPanel;
    }
}
