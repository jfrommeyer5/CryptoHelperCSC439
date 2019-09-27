package Ciphers;

import ServiceImpl.CipherServiceImpl;
import Services.CipherService;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColumnTranspositionWorksheet {

    private JLabel numberOfRowsJLabel;
    private JSpinner jSpinner;
    private JPanel topJPanel;
    private JPanel mainPanel;
    private JPanel bottomPanel;
    private JTable jTable;
    private JScrollPane jScrollPane;
    private JButton goButton;
    private CipherService cipherService;
    private JTextArea inputText;




    public ColumnTranspositionWorksheet(){
        numberOfRowsJLabel = new JLabel();
        jTable = new JTable();
        jSpinner = new JSpinner();
        topJPanel = new JPanel();
        mainPanel = new JPanel();
        bottomPanel = new JPanel();
        jScrollPane = new JScrollPane();
        goButton = new JButton();
        inputText = new JTextArea();

        cipherService = new CipherServiceImpl();

        mainPanel.setLayout(new BorderLayout());

        jTable.setModel(new DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));

        jScrollPane.setViewportView(jTable);

        mainPanel.add(jScrollPane, BorderLayout.CENTER);

        numberOfRowsJLabel.setText("Number of Rows");
        topJPanel.add(numberOfRowsJLabel);

        jSpinner.setPreferredSize(new Dimension(50, 20));
        jSpinner.setValue(new Integer(1));
        jSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerStateChanged(evt);
            }
        });

        topJPanel.add(jSpinner);

        mainPanel.add(topJPanel, BorderLayout.NORTH);

        bottomPanel.setLayout(new BorderLayout());

        goButton.setText("Go");
        goButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                actionButtonActionPerformed(evt);
            }
        });

        bottomPanel.add(goButton, BorderLayout.CENTER);

        mainPanel.add(bottomPanel, BorderLayout.SOUTH);




    }

    public void actionButtonActionPerformed(ActionEvent evt) {


        String inputString = cipherService.formatString(inputText);

        int numRows = ((Integer)jSpinner.getValue()).intValue();
        String[] sArray = new String[numRows];

        for (int x = 0; x < numRows; x++)
        {
            sArray[x] = "";
        }

        for (int x = 0; x < inputString.length(); x++)
        {
            sArray[x%numRows] = sArray[x%numRows] + inputString.charAt(x);
        }

        jTable.setModel(new javax.swing.table.DefaultTableModel(numRows, sArray[0].length()));

        jTable.setRowSelectionAllowed(false);

        for (int x = 0; x < sArray.length; x++)
        {
            for (int y = 0; y < sArray[x].length(); y++)
            {
                jTable.setValueAt(new Character(sArray[x].charAt(y)), x, y);
            }
        }
    }
    private void jSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        JSpinner js = (JSpinner)evt.getSource();

        if (((Integer)js.getValue()).intValue() < 1) js.setValue(new Integer(1));
    }

    public JButton getGoButton() {
        return goButton;
    }

    public void setGoButton(JButton goButton) {
        this.goButton = goButton;
    }

    public JTextArea getInputText() {
        return inputText;
    }

    public void setInputText(JTextArea inputText) {
        this.inputText = inputText;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }
}
