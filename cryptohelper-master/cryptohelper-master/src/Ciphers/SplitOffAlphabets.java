package Ciphers;

import ServiceImpl.CipherServiceImpl;
import Services.CipherService;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SplitOffAlphabets extends BaseCipher {

    private JLabel wordLength;
    private JPanel topPanel;
    private JSpinner jSpinner;
    private CipherService cipherService;

    public SplitOffAlphabets(){
        super();
        wordLength = new JLabel();
        topPanel = new JPanel();
        jSpinner = new JSpinner();

        cipherService = new CipherServiceImpl();

        wordLength.setText("Enter Wordlength");

        topPanel.add(wordLength);

        jSpinner.setPreferredSize(new Dimension(50, 20));
        jSpinner.setValue(new Integer(1));
        jSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent evt) {
                jSpinnerStateChanged(evt);
            }
        });

        topPanel.add(jSpinner);
        getMainCipherPanel().add(topPanel, BorderLayout.NORTH);


        initializeActionBtn("Split off the alphabets");
    }

    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        getMainCipherTextArea().setText("");

        String inputString = cipherService.formatString(getInputText());

        int wordLength = ((Integer)jSpinner.getValue()).intValue();
        String[] sArray = new String[wordLength];

        for (int x = 0; x < wordLength; x++)
        {
            sArray[x] = "";
        }

        for (int x = 0; x < inputString.length(); x++)
        {
            sArray[x%wordLength] = sArray[x%wordLength] + inputString.charAt(x);
        }

        for (int x = 0; x < sArray.length; x++)
        {
            getMainCipherTextArea().append(sArray[x] + "\n");
        }
    }


    private void jSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        JSpinner js = (JSpinner)evt.getSource();

        if (((Integer)js.getValue()).intValue() < 1) js.setValue(new Integer(1));
    }//GEN-LAST:event_jSpinner3StateChanged

    public JSpinner getjSpinner() {
        return jSpinner;
    }
}
