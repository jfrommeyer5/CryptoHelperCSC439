package Ciphers;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AutoKeyCyphertextAttack extends CookieCutterViginereCiphers {
    private JLabel keyWordLabel;
    private JSpinner jSpinner;
    private JPanel bottomCenterPanel;


    public AutoKeyCyphertextAttack(){
        super();
        initializeActionBtn("Perform Attack");
    }

    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        String inputString = getCipherService().formatString(getInputText());
        String outputString = "";
        String s1 = "";
        double[] array = new double[256];
        double friedman = 0;

        for (int x = 0; x < ((Integer)jSpinner.getValue()).intValue(); x++)
        {
            s1 = s1 + "A";
        }

        s1 = s1 + inputString;

        for (int x = 0; x < inputString.length(); x++)
        {
            for (int y = 0; y < 26; y++)
            {
                if(getTable().getValueAt(s1.charAt(x%s1.length()     )-'A', y).equals((new Character(inputString.charAt(x))).toString()))
                    outputString = outputString + getTable().getColumnName(y);
            }
        }

        char[] charArray = new char[outputString.length() + ((outputString.length()-1)/5)];

        for (int x = 0, y = 0; x < outputString.length(); x++, y++)
        {
            charArray[y] = outputString.charAt(x);
            if ((x+1)%5 == 0 && (x+1)!= outputString.length()) charArray[++y] = ' ';
        }

        getOutputTextArea().setText(new String(charArray));

        outputString = outputString.toUpperCase();

        for (int x = 0; x < 256; x++)
            array[x] = 0;

        for (int x = 0; x < outputString.length(); x++)
        {
            for (char y = 'A'; y <= 'Z'; y++)
            {
                if (outputString.charAt(x) == y) array[y]++;
            }
        }
        for (char x = 'A'; x <= 'Z'; x++)
        {
            friedman += array[x]/outputString.length() * ((array[x]-1)/(outputString.length()-1));
        }
        getOutputTextArea().append("\n\nFriedman value = " + friedman);
    }

    @Override
    public JPanel initializeBottomTextPanel() {
        keyWordLabel = new JLabel();
        jSpinner = new JSpinner();
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
