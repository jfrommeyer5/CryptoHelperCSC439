package Ciphers;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ViginereBruteForce extends CookieCutterViginereCiphers {
    private JLabel keyWordLabel;
    private JSpinner jSpinner;
    private JLabel friedmanCutoffLabel;
    private JTextField friedmanCutoffTextField;
    private JPanel bottomCenterPanel;

    public ViginereBruteForce(){
        super();
        initializeActionBtn("Go");
        setMainCipherPanelText("Viginere Brute Force");
    }



    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        String inputString = getCipherService().formatString(getInputText());
        String outputString = "";
        String s1 = "";
        String finish = "";
        double friedman = 0.0;
        char[] array = new char[((Integer)jSpinner.getValue()).intValue()];

        getOutputTextArea().setText("");

        for (int x = 0; x < ((Integer)jSpinner.getValue()).intValue(); x++)
        {
            s1 = s1 + "A";
            finish = finish + "Z";
            array[x] = 'A';
        }


        while(!s1.equals(finish))
        {
            for (int x = 0; x < inputString.length(); x++)
            {
                for (int y = 0; y < 26; y++)
                {
                    if(getTable().getValueAt(s1.charAt(x%s1.length())-'A', y).equals((new Character(inputString.charAt(x))).toString()))
                        outputString = outputString + getTable().getColumnName(y);
                }
            }
            outputString = outputString.toUpperCase();
            friedman = getCipherService().calculateFriedman(outputString);
            if (friedman >= Double.parseDouble(friedmanCutoffTextField.getText())) getOutputTextArea().append("Key = " + s1 + ", friedman = " + friedman + ", pt = " + outputString + "\n");

            array[0]++;

            for (int x = 0; x < array.length; x++)
            {
                if (array[x] >= 'Z'+1) {array[x] = 'A'; if ((x+1) < array.length) array[x+1]++;}
            }

            s1 = new String(array);
            outputString = "";
        }
    }

    @Override
    public JPanel initializeBottomTextPanel() {
        keyWordLabel = new JLabel();
        jSpinner = new JSpinner();
        friedmanCutoffLabel = new JLabel();
        friedmanCutoffTextField = new JTextField();
        bottomCenterPanel = new JPanel();

        keyWordLabel.setText("Keyword Length");
        bottomCenterPanel.add(keyWordLabel);

        jSpinner.setPreferredSize(new Dimension(50, 20));
        jSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerStateChanged(evt);
            }
        });
        bottomCenterPanel.add(jSpinner);

        friedmanCutoffLabel.setText("Friedman cutoff");
        bottomCenterPanel.add(friedmanCutoffLabel);

        friedmanCutoffTextField.setText(".060");
        bottomCenterPanel.add(friedmanCutoffTextField);

        return bottomCenterPanel;
    }

    private void jSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner6StateChanged
        JSpinner js = (JSpinner)evt.getSource();

        if (((Integer)js.getValue()).intValue() < 0) js.setValue(new Integer(0));
    }

    public JSpinner getjSpinner() {
        return jSpinner;
    }
}
