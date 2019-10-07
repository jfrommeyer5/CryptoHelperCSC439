package Ciphers;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AutoKeyPlaintextAttack extends CookieCutterViginereCiphers {
    private JLabel keyWordLength;
    private JSpinner jSpinner;
    private JLabel friedmanCuttoffLabel;
    private JTextField textFieldFriedmanCutoffLow; //need more domain knowledge to name this variable
    private JTextField textFieldFriedmanCutoffHigh; //see comment above

    private JPanel bottomCenterPanel;

    public AutoKeyPlaintextAttack(){
        super();
        initializeActionBtn("Perform Attack");
    }

    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        /* possibilities for letter 1 of keyword
         * n key length = 5 fieldman rating 0.50
         * possibilities for letter 2 of keyword
         * 0 key length = 5 fieldman rating 0.55
         */

        String inputString = getCipherService().formatString(getInputText());
        String outputString = "";
        String s1 = "";
        String tempString = "";
        double[] array = new double[256];
        double friedman = 0;

        int js = ((Integer)jSpinner.getValue()).intValue();
        double friedman_cutoff_low = Double.parseDouble(textFieldFriedmanCutoffLow.getText());
        double friedman_cutoff_hi = Double.parseDouble(textFieldFriedmanCutoffHigh.getText());

        int x, z, t, w;
        char y;

        getOutputTextArea().setText("");

        for (x = 0; x < js; x++)
        {
            for (y = 'A'; y<='Z'; y++)
            {
                for (z = 1; z <= js; z++)
                {
                    s1 = "";
                    tempString = "";
                    outputString = "";
                    friedman = 0;

                    for ( t = x; t < inputString.length(); t++)
                    {
                        if ((t-x)%z==0) tempString = tempString + inputString.charAt(t);
                    }



                    s1 = "" + y;
                    for (t = 0; t < tempString.length(); t++)
                    {
                        for (w = 0; w < 26; w++)
                        {
                            if(getTable().getValueAt(s1.charAt(t%s1.length())-'A', w).equals((new Character(tempString.charAt(t))).toString()))
                                outputString = outputString + getTable().getColumnName(w);
                        }
                        s1 = s1 + outputString.charAt(t);
                        s1 = s1.toUpperCase();
                    }

                    System.out.println(s1);
                    System.out.println(outputString);
                    System.out.println();



                    outputString = outputString.toUpperCase();

                    for (t = 0; t < 256; t++)
                        array[t] = 0;

                    for (t = 0; t < outputString.length(); t++)
                    {
                        for (char c = 'A'; c <= 'Z'; c++)
                        {
                            if (outputString.charAt(t) == c) array[c]++;
                        }
                    }
                    for (char c = 'A'; c <= 'Z'; c++)
                    {
                        friedman += array[c]/outputString.length() * ((array[c]-1)/(outputString.length()-1));
                    }


                    if(friedman >= friedman_cutoff_low && friedman <= friedman_cutoff_hi)
                    {
                        //print this possibility;
                        //jTextArea16.append("\n\nFriedman value = " + friedman);;
                        getOutputTextArea().append("Possibilities for letter  " + (x+1) + "  of keyword  ");
                        getOutputTextArea().append("" + y + "  keylength =  " + z + "  friedman =  " + friedman + "\n");
                    }
                }
            }
        }
    }

    @Override
    public JPanel initializeBottomTextPanel() {
        keyWordLength = new JLabel();
        jSpinner = new JSpinner();
        friedmanCuttoffLabel = new JLabel();
        textFieldFriedmanCutoffLow = new JTextField();
        textFieldFriedmanCutoffHigh = new JTextField();
        bottomCenterPanel = new JPanel();

        keyWordLength.setText("Max Keyword Length");
        bottomCenterPanel.add(keyWordLength);

        jSpinner.setPreferredSize(new Dimension(50, 20));
        jSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerStateChanged(evt);
            }
        });
        bottomCenterPanel.add(jSpinner);

        friedmanCuttoffLabel.setText("Friedman Cuttoff");
        bottomCenterPanel.add(friedmanCuttoffLabel);

        textFieldFriedmanCutoffLow.setText("0.055");
        textFieldFriedmanCutoffLow.setPreferredSize(new Dimension(50,19));
        bottomCenterPanel.add(textFieldFriedmanCutoffLow);

        textFieldFriedmanCutoffHigh.setText("2.0");
        textFieldFriedmanCutoffHigh.setPreferredSize(new Dimension(50,19));
        bottomCenterPanel.add(textFieldFriedmanCutoffHigh);

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
