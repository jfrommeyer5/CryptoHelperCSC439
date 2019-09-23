package Ciphers;

import ServiceImpl.CipherServiceImpl;
import Services.CipherService;

import javax.swing.*;
import javax.swing.text.Caret;
import java.awt.*;
import java.awt.event.*;

public abstract class BaseCipher {

    private JButton actionButton;
    private JPanel mainCipherPanel;
    private JTextArea mainCipherTextArea;
    private JScrollPane jScrollPane;

    private JTextArea inputText;

    private CipherService cipherService;


    public BaseCipher(){
        actionButton = new JButton();
        mainCipherPanel = new JPanel();
        mainCipherTextArea = new JTextArea();
        jScrollPane = new JScrollPane();
        inputText = new JTextArea();

        cipherService = new CipherServiceImpl();

        mainCipherPanel.setLayout(new BorderLayout());

        mainCipherTextArea.setFont(new Font("Monospaced", 0, 12));

        //likely will be taken out into it's own service and implement per subclass IF not everyone uses it
        mainCipherTextArea.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                //jTextAreaKeyReleased(evt);
            }
        });
        mainCipherTextArea.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                //jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane.setViewportView(mainCipherTextArea);
        mainCipherPanel.add(jScrollPane, BorderLayout.CENTER);

        mainCipherPanel.add(actionButton, BorderLayout.SOUTH);


    }


    public void initializeActionBtn(String buttonText){
        actionButton.setText(buttonText);

        actionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButtonActionPerformed(evt);
            }
        });

    }

    public abstract void actionButtonActionPerformed(ActionEvent evt);



    public JButton getActionButton() {
        return actionButton;
    }

    public void setActionButton(JButton actionButton) {
        this.actionButton = actionButton;
    }

    public JPanel getMainCipherPanel() {
        return mainCipherPanel;
    }

    public void setMainCipherPanel(JPanel mainCipherPanel) {
        this.mainCipherPanel = mainCipherPanel;
    }

    public JTextArea getMainCipherTextArea() {
        return mainCipherTextArea;
    }

    public void setMainCipherTextArea(JTextArea mainCipherTextArea) {
        this.mainCipherTextArea = mainCipherTextArea;
    }

    public JTextArea getInputText() {
        return inputText;
    }

    public void setInputText(JTextArea inputText) {
        this.inputText = inputText;
    }

    public CipherService getCipherService() {
        return cipherService;
    }

    public void setCipherService(CipherService cipherService) {
        this.cipherService = cipherService;
    }
}
