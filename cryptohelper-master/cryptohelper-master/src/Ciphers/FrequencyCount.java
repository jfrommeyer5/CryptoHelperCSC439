package Ciphers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//extend BaseCipher eventually
public class FrequencyCount{

    private JButton frequencyCountBtn;
    private JPanel frequencyCountPanel;
    private JTextArea frequencyCountTextArea;
    //private JTabbedPane frequencyCountTabbedPane;

    private JTextArea inputText;

    public FrequencyCount(JTextArea inputText){
        frequencyCountBtn = new JButton();
        frequencyCountPanel = new JPanel();
        frequencyCountTextArea = new JTextArea();

        this.inputText = inputText;



        frequencyCountPanel.setLayout(new BorderLayout());


        initializeFrequencyCountBtn();

        frequencyCountTextArea.setFont(new Font("Monospaced", 0, 12));
        frequencyCountTextArea.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                //jTextAreaKeyReleased(evt);
            }
        });
        frequencyCountTextArea.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                //jTextAreaMouseClicked(evt);
            }
        });


        frequencyCountPanel.add(frequencyCountBtn, BorderLayout.SOUTH);
    }

    public void initializeFrequencyCountBtn(){
        frequencyCountBtn.setText("Perform Frequency Count");

        frequencyCountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frequencyCountActionPerformed(evt);
            }
        });
    }

    private void frequencyCountActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String inputString = inputText.getText();
        inputString = inputString.toUpperCase();
        int array[] = new int[26];
        String sArray[];

        frequencyCountTextArea.setText("");

        for (int x = 0; x < inputString.length(); x++)
        {
            switch (inputString.charAt(x))
            {
                case 'A': array[0]++; break;
                case 'B': array[1]++; break;
                case 'C': array[2]++; break;
                case 'D': array[3]++; break;
                case 'E': array[4]++; break;
                case 'F': array[5]++; break;
                case 'G': array[6]++; break;
                case 'H': array[7]++; break;
                case 'I': array[8]++; break;
                case 'J': array[9]++; break;
                case 'K': array[10]++; break;
                case 'L': array[11]++; break;
                case 'M': array[12]++; break;
                case 'N': array[13]++; break;
                case 'O': array[14]++; break;
                case 'P': array[15]++; break;
                case 'Q': array[16]++; break;
                case 'R': array[17]++; break;
                case 'S': array[18]++; break;
                case 'T': array[19]++; break;
                case 'U': array[20]++; break;
                case 'V': array[21]++; break;
                case 'W': array[22]++; break;
                case 'X': array[23]++; break;
                case 'Y': array[24]++; break;
                case 'Z': array[25]++; break;
            }
        }

        for (int x = 0; x < 26; x++)
        {
            frequencyCountTextArea.append(new Character((char)('A'+x)).toString());
            frequencyCountTextArea.append(" = ");
            frequencyCountTextArea.append(new Integer(array[x]).toString());
            frequencyCountTextArea.append(" = ");
            for (int y = 0; y<array[x]; y++)
                frequencyCountTextArea.append("I");
            if (x!=25) frequencyCountTextArea.append("\n");
        }

        frequencyCountTextArea.append("\n");

        sArray = inputString.split(" ");

        frequencyCountTextArea.append("\nHere are all the 1 letter words\n");
        for (int x = 0; x < sArray.length; x++)
        {
            if (sArray[x].length() == 1) {frequencyCountTextArea.append(sArray[x]); frequencyCountTextArea.append("\n");}
        }

        frequencyCountTextArea.append("\nHere are all the 2 letter words\n");
        for (int x = 0; x < sArray.length; x++)
        {
            if (sArray[x].length() == 2) {frequencyCountTextArea.append(sArray[x]); frequencyCountTextArea.append("\n");}
        }

        frequencyCountTextArea.append("\nHere are all the 3 letter words\n");
        for (int x = 0; x < sArray.length; x++)
        {
            if (sArray[x].length() == 3) {frequencyCountTextArea.append(sArray[x]); frequencyCountTextArea.append("\n");}
        }

        frequencyCountTextArea.append("\nHere are all the initial letters\n");
        for (int x = 0; x < sArray.length; x++)
        {
            if (sArray[x].length()>0)
                frequencyCountTextArea.append(new Character(sArray[x].charAt(0)).toString());
        }
        frequencyCountTextArea.append("\n");

        frequencyCountTextArea.append("\nHere are all the final letters\n");
        for (int x = 0; x < sArray.length; x++)
        {
            if (sArray[x].length()>0)
                frequencyCountTextArea.append(new Character(sArray[x].charAt(sArray[x].length()-1)).toString());
        }
        frequencyCountTextArea.append("\n");

        frequencyCountTextArea.append("\nHere are all the doubled letters\n");
        char c = inputString.charAt(0);
        for (int x = 1; x < inputString.length(); x++)
        {
            if (inputString.charAt(x) == c)
            {
                frequencyCountTextArea.append(new Character(c).toString());
                frequencyCountTextArea.append(new Character(c).toString());
                frequencyCountTextArea.append("\n");
            }
            c = inputString.charAt(x);
        }

        frequencyCountTextArea.append("\nFrequencies for English\n");

        frequencyCountTextArea.append("a = 07 = IIIIIII                 n = 08 = IIIIIIII   \n");
        frequencyCountTextArea.append("b = 01 = I                       o = 07 = IIIIIII    \n");
        frequencyCountTextArea.append("c = 03 = III                     p = 03 = III        \n");
        frequencyCountTextArea.append("d = 04 = IIII                    q =                 \n");
        frequencyCountTextArea.append("e = 13 = IIIIIIIIIIIII           r = 08 = IIIIIIII   \n");
        frequencyCountTextArea.append("f = 03 = III                     s = 06 = IIIIII     \n");
        frequencyCountTextArea.append("g = 02 = II                      t = 09 = IIIIIIIII  \n");
        frequencyCountTextArea.append("h = 04 = IIII                    u = 03 = III        \n");
        frequencyCountTextArea.append("i = 07 = IIIIIII                 v = 01 = I          \n");
        frequencyCountTextArea.append("j =                              w = 02 = II         \n");
        frequencyCountTextArea.append("k =                              x =                 \n");
        frequencyCountTextArea.append("l = 04 = IIII                    y = 02 = II         \n");
        frequencyCountTextArea.append("m = 03 = III                     z =                 \n");

    }//GEN-LAST:event_jButton11ActionPerformed


    public JButton getFrequencyCountBtn() {
        return frequencyCountBtn;
    }

    public void setFrequencyCountBtn(JButton frequencyCountBtn) {
        this.frequencyCountBtn = frequencyCountBtn;
    }

    public JPanel getFrequencyCountPanel() {
        return frequencyCountPanel;
    }

    public void setFrequencyCountPanel(JPanel frequencyCountPanel) {
        this.frequencyCountPanel = frequencyCountPanel;
    }

    public JTextArea getInputText() {
        return inputText;
    }

    public void setInputText(JTextArea inputText) {
        this.inputText = inputText;
    }

    public JTextArea getFrequencyCountTextArea() {
        return frequencyCountTextArea;
    }

    public void setFrequencyCountTextArea(JTextArea frequencyCountTextArea) {
        this.frequencyCountTextArea = frequencyCountTextArea;
    }
}
