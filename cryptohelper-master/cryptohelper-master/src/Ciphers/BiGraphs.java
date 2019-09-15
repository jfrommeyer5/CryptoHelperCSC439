package Ciphers;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;


//extend BaseCipher eventually
public class BiGraphs {

    private JButton biGraphsBtn;
    private JPanel biGraphsPanel;
    private JTextArea biGraphsTextArea;

    private JTextArea inputText;

    public BiGraphs(){
        biGraphsBtn = new JButton();
        biGraphsPanel = new JPanel();
        biGraphsTextArea = new JTextArea();
        inputText = new JTextArea();


        biGraphsPanel.setLayout(new BorderLayout());


        initializeBiGraphsBtn();

        biGraphsTextArea.setFont(new Font("Monospaced", 0, 12));
        biGraphsTextArea.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                //jTextAreaKeyReleased(evt);
            }
        });
        biGraphsTextArea.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
               // jTextAreaMouseClicked(evt);
            }
        });



    }

    public void initializeBiGraphsBtn(){
        biGraphsBtn.setText("Show BiGraphs");

        biGraphsBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        biGraphsPanel.add(biGraphsBtn, BorderLayout.SOUTH);
    }

    private void jButton3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String inputString = formatString(inputText);
        String tempString;
        Counter counter = new Counter();

        for (int x = 0; x < inputString.length() - 1; x++)
        {
            tempString = inputString.substring(x, x+2);
            if (inputString.indexOf(tempString, x)>=0)
            {
                if (!counter.contains(tempString))
                {
                    counter.add(tempString, x);
                    for (int y = x; y >= 0;)
                    {
                        if ((y = inputString.indexOf(tempString, y+2)) >= 0) counter.inc(y);
                    }
                }
            }
        }

        biGraphsTextArea.setText("");

        for (int x = 0; x < counter.length; x++)
        {
            biGraphsTextArea.append(counter.sArray[x]);
            biGraphsTextArea.append(" = ");
            biGraphsTextArea.append(new Integer(counter.iArray[x]).toString());
            biGraphsTextArea.append(" at positions ");
            for (int y = 0; y < counter.iArray[x]; y++)
            {
                biGraphsTextArea.append("" + counter.pArray[x][y]);
                if (y!=counter.iArray[x] - 1)
                    biGraphsTextArea.append(",");
            }
            biGraphsTextArea.append("\n");
        }
    }//GEN-LAST:event_jButton3ActionPerformed




    //temporary. will be extracted into a service of methods simliar to these.
    private String formatString(JTextArea jta)
    {
        String inputString = jta.getText();
        inputString = inputString.toUpperCase();
        inputString = inputString.replace(',', ' ');
        inputString = inputString.replace('.', ' ');
        inputString = inputString.replace('?', ' ');
        inputString = inputString.replace('\"', ' ');
        inputString = inputString.replace('!', ' ');
        inputString = inputString.replace('@', ' ');
        inputString = inputString.replace('#', ' ');
        inputString = inputString.replace('$', ' ');
        inputString = inputString.replace('%', ' ');
        inputString = inputString.replace('^', ' ');
        inputString = inputString.replace('&', ' ');
        inputString = inputString.replace('*', ' ');
        inputString = inputString.replace('(', ' ');
        inputString = inputString.replace(')', ' ');
        inputString = inputString.replace('-', ' ');
        inputString = inputString.replace('+', ' ');
        inputString = inputString.replace('/', ' ');
        inputString = inputString.replace('\\', ' ');
        inputString = inputString.replace('<', ' ');
        inputString = inputString.replace('>', ' ');
        inputString = inputString.replace('\'', ' ');
        inputString = inputString.replace('~', ' ');
        inputString = inputString.replace('`', ' ');
        inputString = inputString.replace('[', ' ');
        inputString = inputString.replace(']', ' ');
        inputString = inputString.replace('|', ' ');
        inputString = inputString.replace('{', ' ');
        inputString = inputString.replace('}', ' ');
        inputString = inputString.replace('=', ' ');
        inputString = inputString.replace(':', ' ');
        inputString = inputString.replace(';', ' ');
        inputString = inputString.replace('0', ' ');
        inputString = inputString.replace('1', ' ');
        inputString = inputString.replace('2', ' ');
        inputString = inputString.replace('3', ' ');
        inputString = inputString.replace('4', ' ');
        inputString = inputString.replace('5', ' ');
        inputString = inputString.replace('6', ' ');
        inputString = inputString.replace('7', ' ');
        inputString = inputString.replace('8', ' ');
        inputString = inputString.replace('9', ' ');
        inputString = inputString.replaceAll(" ", "");
        inputString = inputString.replaceAll("\n", "");
        return inputString;
    }

    public JButton getBiGraphsBtn() {
        return biGraphsBtn;
    }

    public void setBiGraphsBtn(JButton biGraphsBtn) {
        this.biGraphsBtn = biGraphsBtn;
    }

    public JPanel getBiGraphsPanel() {
        return biGraphsPanel;
    }

    public void setBiGraphsPanel(JPanel biGraphsPanel) {
        this.biGraphsPanel = biGraphsPanel;
    }

    public JTextArea getBiGraphsTextArea() {
        return biGraphsTextArea;
    }

    public void setBiGraphsTextArea(JTextArea biGraphsTextArea) {
        this.biGraphsTextArea = biGraphsTextArea;
    }

    public JTextArea getInputText() {
        return inputText;
    }

    public void setInputText(JTextArea inputText) {
        this.inputText = inputText;
    }
}
