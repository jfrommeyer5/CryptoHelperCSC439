package Ciphers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GCDAndInverse extends BaseCipher {

    private JLabel inverseOfJLabel;
    private JTextField inverseOfJTextField;
    private JLabel modJLabel;
    private JTextField modJTextField;
    private JPanel topJPanel;



    public GCDAndInverse(){
        super();

        inverseOfJLabel = new JLabel();
        inverseOfJTextField = new JTextField();
        modJLabel = new JLabel();
        modJTextField = new JTextField();
        topJPanel = new JPanel();

        inverseOfJLabel.setText("Inverse of");
        topJPanel.add(inverseOfJLabel);

        inverseOfJTextField.setPreferredSize(new Dimension(100,20));
        topJPanel.add(inverseOfJTextField);

        modJLabel.setText("Mod");
        topJPanel.add(modJLabel);

        modJTextField.setPreferredSize(new Dimension(100,20));
        topJPanel.add(modJTextField);

        getMainCipherPanel().add(topJPanel, BorderLayout.NORTH);


        initializeActionBtn("Go");

    }




    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        double y = Math.max(Double.parseDouble(modJTextField.getText()), Double.parseDouble(inverseOfJTextField.getText()));
        double z = Math.min(Double.parseDouble(modJTextField.getText()), Double.parseDouble(inverseOfJTextField.getText()));
        double w = 0;
        double ans = 0;

        getMainCipherTextArea().setText("The inverse algorithm used here is not euclid's algo, rather it is one I came up with that is not\n as efficient\n\n");

        boolean exit = false;

        while(!exit)
        {
            w = y%z;
            if (w != 0)
            {
                y = z;
                z = w;
            }
            else
            {
                exit = true;
                ans = z;
            }
        }

//        System.out.println("gcd is " + ans);
        getMainCipherTextArea().append("gcd is " + ans + "\n");

        if (ans==1)
        {
            y = Double.parseDouble(modJTextField.getText());
            z = Double.parseDouble(inverseOfJTextField.getText());

            for (int x = 1; x <= y; x++)
            {
                w = ((-(y*x-1)/z));
                w = (w + ((int)(-w/y) + 1)*y);
                if (w-((int)w)==0)
                {
//                    System.out.println("The inverse is " + w);
                    getMainCipherTextArea().append("The inverse is " + w + "\n");
                    break;
                }
            }
        }
        else
        {
//            System.out.println("There is no inverse, sorry");
            getMainCipherTextArea().append("There is no inverse, sorry\n");
        }
    }
}
