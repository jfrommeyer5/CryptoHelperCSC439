package Ciphers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RunTheAlphabet {
    private JButton runTheAlphabetBtn;
    private JPanel runTheAlphabetPanel;
    private JTextArea runTheAlphabetTextArea;

    private JTextArea inputText;


    public RunTheAlphabet(){
        runTheAlphabetBtn = new JButton();
        runTheAlphabetPanel = new JPanel();
        runTheAlphabetTextArea = new JTextArea();

        runTheAlphabetPanel.setLayout(new BorderLayout());

        initializeRunTheAlphabetBtn();

        runTheAlphabetPanel.add(runTheAlphabetBtn, BorderLayout.SOUTH);

        runTheAlphabetTextArea.setFont(new Font("Monospaced", 0, 12));
        runTheAlphabetTextArea.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                //jTextAreaKeyReleased(evt);
            }
        });
        runTheAlphabetTextArea.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                //jTextAreaMouseClicked(evt);
            }
        });



    }

    public void initializeRunTheAlphabetBtn(){

        runTheAlphabetBtn.setText("Run The Alphabet");

        runTheAlphabetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runTheAlphabetActionPerformed(evt);
            }
        });


    }


    private void runTheAlphabetActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String inputString = inputText.getText();
        inputString = inputString.toLowerCase();

        runTheAlphabetTextArea.setText("");

        for (int x = 0; x < 25; x++)
        {
            for (int y = 0; y < inputString.length(); y++)
            {
                //jTextArea4.append(new Character((char)(inputString.charAt(y)+x)).toString());
                if (inputString.charAt(y) >='a' && inputString.charAt(y) <= 'z')
                {
                    runTheAlphabetTextArea.append(new Character((char)((inputString.charAt(y)+x)%('z'+1)+((int)((inputString.charAt(y)+x)/('z'+1))*'a'))).toString());
                }
                else runTheAlphabetTextArea.append(" ");
            }
            runTheAlphabetTextArea.append("\n");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    public JButton getRunTheAlphabetBtn() {
        return runTheAlphabetBtn;
    }

    public void setRunTheAlphabetBtn(JButton runTheAlphabetBtn) {
        this.runTheAlphabetBtn = runTheAlphabetBtn;
    }

    public JPanel getRunTheAlphabetPanel() {
        return runTheAlphabetPanel;
    }

    public void setRunTheAlphabetPanel(JPanel runTheAlphabetPanel) {
        this.runTheAlphabetPanel = runTheAlphabetPanel;
    }

    public JTextArea getRunTheAlphabetTextArea() {
        return runTheAlphabetTextArea;
    }

    public void setRunTheAlphabetTextArea(JTextArea runTheAlphabetTextArea) {
        this.runTheAlphabetTextArea = runTheAlphabetTextArea;
    }

    public JTextArea getInputText() {
        return inputText;
    }

    public void setInputText(JTextArea inputText) {
        this.inputText = inputText;
    }
}
