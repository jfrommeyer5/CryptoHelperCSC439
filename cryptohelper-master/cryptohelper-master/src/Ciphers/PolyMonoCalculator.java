package Ciphers;

import ServiceImpl.CipherServiceImpl;
import Services.CipherService;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PolyMonoCalculator extends BaseCipher {

    private JLabel keyWordSize;
    private JPanel topPanel;
    private JSpinner jSpinner;
    private CipherService cipherService;

    public PolyMonoCalculator(){
        super();

        keyWordSize = new JLabel();
        topPanel = new JPanel();
        jSpinner = new JSpinner();
        cipherService = new CipherServiceImpl();

        keyWordSize.setText("Keyword Size");
        topPanel.add(keyWordSize);

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



        initializeActionBtn("Calculate");
    }

    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        String inputString = cipherService.formatString(getInputText());
        String tempString;
        double[] array = new double[256];
        double friedman = 0;
        int spinnerValue = ((Integer)jSpinner.getValue()).intValue();

        getMainCipherTextArea().setText(".065 = Monoalphabetic, .038 means polyalphabetic.  I'll add some bar graphs in the future.\n\n");

        for (int z = 0; z < spinnerValue; z++)
        {
            tempString = "";
            friedman = 0;

            for (int x = 0; x < inputString.length(); x++)
            {
                if ((x-z%spinnerValue)%spinnerValue==0) tempString = tempString + inputString.charAt(x);
            }

            for (int x = 0; x < 256; x++)
                array[x] = 0;

            for (int x = 0; x < tempString.length(); x++)
            {
                for (char y = 'A'; y <= 'Z'; y++)
                {
                    if (tempString.charAt(x) == y) array[y]++;
                }
            }
            for (char x = 'A'; x <= 'Z'; x++)
            {
                friedman += array[x]/tempString.length() * ((array[x]-1)/(tempString.length()-1));
            }

            getMainCipherTextArea().append("" + friedman + "\n");
        }
    }

    private void jSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        JSpinner js = (JSpinner)evt.getSource();

        if (((Integer)js.getValue()).intValue() < 1) js.setValue(new Integer(1));
    }
}
