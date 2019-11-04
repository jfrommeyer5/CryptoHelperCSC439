package Ciphers;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;

public class HillBruteForce extends BaseCipher {
    private JLabel friedmanCutoffLabel;
    private JTextField friedmanCutoffTextField;
    private JPanel topJPanel;

   public HillBruteForce(){
        super();
        initializeActionBtn("Go");
        setMainCipherPanelText("Hill Brute Force");

        friedmanCutoffLabel = new JLabel();
        friedmanCutoffTextField = new JTextField();
        topJPanel = new JPanel();

        topJPanel.setLayout(new BorderLayout());

        friedmanCutoffLabel.setText("Friedman cutoff");
        topJPanel.add(friedmanCutoffLabel, BorderLayout.WEST);

       friedmanCutoffTextField.setFont(new Font("Monospaced", 0, 12));

        friedmanCutoffTextField.setPreferredSize(new Dimension(50, 19));
        friedmanCutoffTextField.setText("0.060");

        topJPanel.add(friedmanCutoffTextField, BorderLayout.EAST);

        getMainCipherPanel().add(topJPanel, BorderLayout.NORTH);
    }

    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        String inputString = getCipherService().formatString(getInputText());
        String outputString = "";
        double friedman = 0.0;

        if (inputString.length()%2!=0)
        {
            JOptionPane.showMessageDialog(null,
                    "Please input a message with an even number of characters",
                    "Warning",JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        char[] array = new char[inputString.length()];
        char[] array2 = new char[inputString.length()];

        for (int x = 0; x < array.length; x++) array[x] = (char)(inputString.charAt(x)-'A' + 1);

        System.out.println();

        for (int q = 1; q <= 26; q++)
        {
            for (int w = 1; w <= 26; w++)
            {
                for (int e = 1; e <= 26; e++)
                {
                    for (int r = 1; r <= 26; r++)
                    {
                        for (int x = 0; x < array.length; x = x + 2)
                        {
                            array2[x] = (char)((q * array[x] +
                                    w * array[x+1])%26);
                            array2[x+1] = (char)((e * array[x] +
                                    r * array[x+1])%26);
                        }
                        for (int x = 0; x < array.length; x++)
                        {
                            if (array2[x] == 0) array2[x] = 26;
                            array2[x] = (char)(array2[x]+'A' - 1);
                        }

                        outputString = new String(array2);
                        friedman = getCipherService().calculateFriedman(outputString);
                        if (friedman >= Double.parseDouble(friedmanCutoffTextField.getText()))
                            getMainCipherTextArea().append("" + friedman + " = " +
                                    q + ", " + w + ", " + e + ", " + r + " = " +
                                    outputString + "\n");
                    }
                }
            }
        }
    }
}
