package Ciphers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Scytale_Decipher extends BaseCipher {
    private JLabel widthJLabel;
    private JTextField widthJTextField;
    private JPanel topJPanel;
    public Scytale_Decipher(){
        super();
        widthJLabel = new JLabel();
        widthJTextField = new JTextField();
        topJPanel = new JPanel();
        widthJLabel.setText("number of Columns");
        topJPanel.add(widthJLabel);
        widthJTextField.setPreferredSize(new Dimension(100,20));
        topJPanel.add(widthJTextField);
        getMainCipherPanel().add(topJPanel, BorderLayout.NORTH);
        initializeActionBtn("Go");}
    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        String msg = getInputText().getText();
        int numofRows = Integer.parseInt(widthJTextField.getText());
        String encoded = "";
        if(numofRows>=msg.length() || numofRows<=0){
            getMainCipherTextArea().setText(msg);
        }
        else {
            while (msg.length() % numofRows != 0) {
                msg += " ";
            }
            int numofCols = msg.length() / numofRows;
            for (int j = 0; j < numofCols; j++) {
                for (int i = j; i < msg.length(); i += numofCols) {
                    encoded += msg.charAt(i);
                }
            }
        }
        getMainCipherTextArea().setText(encoded);
    }
}
