package Ciphers;

import MainToBeRenamed.CryptoHelper;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class NGraphs extends BaseCipher{

    private JPanel topPanel;
    private JLabel text;
    private JSpinner jSpinner;

    public NGraphs(){
        super();
        initializeActionBtn("Show NGraphs");

        topPanel = new JPanel();
        text = new JLabel();
        jSpinner = new JSpinner();

        text.setText("Length of NGraph");
        topPanel.add(text);

        jSpinner.setPreferredSize(new Dimension(50,20));
        jSpinner.setValue(new Integer(1));
        jSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent evt) {
                jSpinnerEvent(evt);
            }
        });

        topPanel.add(jSpinner);
        getMainCipherPanel().add(topPanel, BorderLayout.NORTH);

    }

    public void jSpinnerEvent(ChangeEvent evt){
        JSpinner js = (JSpinner)evt.getSource();
        if (((Integer)js.getValue()).intValue() < 1) js.setValue(new Integer(1));
    }

    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        String inputString = getCipherService().formatString(getInputText());
        int js = ((Integer)jSpinner.getValue()).intValue();

        String tempString;
        Counter counter = new Counter();

        for (int x = 0; x < inputString.length() - (js - 1); x++)
        {
            tempString = inputString.substring(x, x+js);
            if (inputString.indexOf(tempString, x)>=0)
            {
                if (!counter.contains(tempString))
                {
                    counter.add(tempString, x);
                    for (int y = x; y >= 0;)
                    {
                        if ((y = inputString.indexOf(tempString, y+js)) >= 0) counter.inc(y);
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
    public JSpinner getjSpinner() {
        return jSpinner;
    }
}
