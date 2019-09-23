package Ciphers;

import ServiceImpl.CipherServiceImpl;
import Services.CipherService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ViginereEncipher extends BaseCipher {

    //IS NOT FINISHED YET BUT WIP
    private JSplitPane splitPane;
    private JTable table;
    private JPanel keyWordPanel;
    private JLabel keyWordLabel;
    private JTextArea keyWordTextArea;
    private JPanel bottomTextPanel;


    private CipherService cipherService;

    public ViginereEncipher(){
        super();
        splitPane = new JSplitPane();
        table = new JTable();
        keyWordPanel = new JPanel();
        keyWordLabel = new JLabel();
        keyWordTextArea = new JTextArea();
        bottomTextPanel = new JPanel();


        cipherService = new CipherServiceImpl();

        splitPane.setDividerLocation(300);
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);

        table = cipherService.buildTable();
        getjScrollPane().setViewportView(table);

        splitPane.setTopComponent(getjScrollPane());

        bottomTextPanel.setLayout(new BorderLayout());
        bottomTextPanel.setOpaque(false);

        keyWordPanel.setLayout(new BorderLayout());

        keyWordLabel.setText("Keyword");
        keyWordPanel.add(keyWordLabel, BorderLayout.WEST);

        keyWordTextArea.setFont(new Font("Monospaced", 0, 12));
        keyWordPanel.add(keyWordTextArea, BorderLayout.CENTER);





        initializeActionBtn("Enchiper");

        //splitPane.setBottomComponent();

        getMainCipherPanel().add(splitPane, BorderLayout.CENTER);

    }

    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        String inputString = cipherService.formatString(getInputText());
        String outputString = "";
        String s1 = cipherService.formatString(getMainCipherTextArea());

        for (int x = 0; x < inputString.length(); x++)
        {
            outputString = outputString + table.getValueAt(s1.charAt(x%s1.length())-'A', inputString.charAt(x)-'A');
        }

        char[] charArray = new char[outputString.length() + ((outputString.length()-1)/5)];

        for (int x = 0, y = 0; x < outputString.length(); x++, y++)
        {
            charArray[y] = outputString.charAt(x);
            if ((x+1)%5 == 0 && (x+1)!= outputString.length()) charArray[++y] = ' ';
        }

        getMainCipherTextArea().setText(new String(charArray));
    }
}
