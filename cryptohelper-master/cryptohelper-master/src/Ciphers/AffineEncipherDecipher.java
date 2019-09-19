package Ciphers;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AffineEncipherDecipher extends BaseCipher {

    private JPanel topPanel;
    private JPanel gridPanel;
    private JPanel additiveShiftPanel;
    private ButtonGroup buttonGroup;
    private JRadioButton radioButton1;
    private JRadioButton radioButton3;
    private JRadioButton radioButton5;
    private JRadioButton radioButton7;
    private JRadioButton radioButton9;
    private JRadioButton radioButton11;
    private JRadioButton radioButton15;
    private JRadioButton radioButton17;
    private JRadioButton radioButton19;
    private JRadioButton radioButton21;
    private JRadioButton radioButton23;
    private JRadioButton radioButton25;

    private JSpinner jSpinner;

    private JLabel additiveShift;
    private JLabel multiplicativeShift;


    public AffineEncipherDecipher(){
        super();
        topPanel = new JPanel();
        gridPanel = new JPanel();
        additiveShiftPanel = new JPanel();
        buttonGroup = new ButtonGroup();
        radioButton1 = new JRadioButton();
        radioButton3 = new JRadioButton();
        radioButton5 = new JRadioButton();
        radioButton7 = new JRadioButton();
        radioButton9 = new JRadioButton();
        radioButton11 = new JRadioButton();
        radioButton15 = new JRadioButton();
        radioButton17 = new JRadioButton();
        radioButton19 = new JRadioButton();
        radioButton21 = new JRadioButton();
        radioButton23 = new JRadioButton();
        radioButton25 = new JRadioButton();

        jSpinner = new JSpinner();

        additiveShift = new JLabel();
        multiplicativeShift = new JLabel();

        topPanel.setLayout(new BorderLayout());
        topPanel.setPreferredSize(new Dimension(689, 75));

        gridPanel.setLayout(new GridLayout(1, 0));

        initializeRadioButtons();

        additiveShift.setText("Additive Shift");
        additiveShiftPanel.add(additiveShift);

        jSpinner.setPreferredSize(new Dimension(50, 20));
        jSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent evt) {
                jSpinnerStateChangedEvent(evt);
            }
        });

        additiveShiftPanel.add(jSpinner);

        topPanel.add(additiveShiftPanel, BorderLayout.SOUTH);

        multiplicativeShift.setHorizontalAlignment(SwingConstants.CENTER);
        multiplicativeShift.setText("Multiplicative shift");

        topPanel.add(multiplicativeShift, BorderLayout.NORTH);

        getMainCipherPanel().add(topPanel, BorderLayout.NORTH);


        initializeActionBtn("Encipher");

    }

    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        int m = 0;
        String inputString = getCipherService().formatString(getInputText());

        getMainCipherTextArea().setText("");

        char[] charArray = inputString.toCharArray();

        if (radioButton1.isSelected()) m = 1;
        else if (radioButton3.isSelected()) m = 3;
        else if (radioButton5.isSelected()) m = 5;
        else if (radioButton7.isSelected()) m = 7;
        else if (radioButton9.isSelected()) m = 9;
        else if (radioButton11.isSelected()) m = 11;
        else if (radioButton15.isSelected()) m = 15;
        else if (radioButton17.isSelected()) m = 17;
        else if (radioButton19.isSelected()) m = 19;
        else if (radioButton21.isSelected()) m = 21;
        else if (radioButton23.isSelected()) m = 23;
        else if (radioButton25.isSelected()) m = 25;

        for (int x = 0; x < inputString.length(); x++)
        {
            charArray[x] = (char)(charArray[x] - 64);
            charArray[x] = (char)((charArray[x] * m)%26);
            charArray[x] = (char)((charArray[x] + ((Integer)(jSpinner.getValue())).intValue())%26);
            if (charArray[x] == 0) charArray[x] = (char)26;
            charArray[x] = (char)(charArray[x] + 64);
        }

        char[] charArray2 = new char[charArray.length + ((charArray.length-1)/5)];

        for (int x = 0, y = 0; x < charArray.length; x++, y++)
        {
            charArray2[y] = charArray[x];
            if ((x+1)%5 == 0 && (x+1)!= charArray.length) charArray2[++y] = ' ';
        }

        getMainCipherTextArea().append(new String(charArray2));
    }


    public void initializeRadioButtons(){

        buttonGroup.add(radioButton1);
        radioButton1.setSelected(true);
        radioButton1.setText("1");
        gridPanel.add(radioButton1);

        buttonGroup.add(radioButton3);
        radioButton3.setText("3");
        gridPanel.add(radioButton3);

        buttonGroup.add(radioButton5);
        radioButton5.setText("5");
        gridPanel.add(radioButton5);

        buttonGroup.add(radioButton7);
        radioButton7.setText("7");
        gridPanel.add(radioButton7);

        buttonGroup.add(radioButton9);
        radioButton9.setText("9");
        gridPanel.add(radioButton9);

        buttonGroup.add(radioButton11);
        radioButton11.setText("11");
        gridPanel.add(radioButton11);

        buttonGroup.add(radioButton15);
        radioButton15.setText("15");
        gridPanel.add(radioButton15);

        buttonGroup.add(radioButton17);
        radioButton17.setText("17");
        gridPanel.add(radioButton17);

        buttonGroup.add(radioButton19);
        radioButton19.setText("19");
        gridPanel.add(radioButton19);

        buttonGroup.add(radioButton21);
        radioButton21.setText("21");
        gridPanel.add(radioButton21);

        buttonGroup.add(radioButton23);
        radioButton23.setText("23");
        gridPanel.add(radioButton23);

        buttonGroup.add(radioButton25);
        radioButton25.setText("25");
        gridPanel.add(radioButton25);

        topPanel.add(gridPanel, BorderLayout.CENTER);

    }

    public void jSpinnerStateChangedEvent(ChangeEvent evt){
        JSpinner js = (JSpinner)evt.getSource();

        if (((Integer)js.getValue()).intValue() < 0) js.setValue(new Integer(0));
        if (((Integer)js.getValue()).intValue() > 25) js.setValue(new Integer(25));
    }
}
