package Ciphers;

import ServiceImpl.CipherServiceImpl;
import Services.CipherService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public abstract class CookieCutterViginereCiphers extends BaseCipher {

    private JSplitPane splitPane;
    private JTable table;

    private JPanel bottomCenterPanel;

    private JPanel bottomTextPanel;
    private JTextArea outputTextArea;
    private JScrollPane outputScrollPane;

    private CipherService cipherService;

    CookieCutterViginereCiphers(){
        super();

        splitPane = new JSplitPane();
        table = new JTable();

        bottomTextPanel = new JPanel();
        outputTextArea = new JTextArea();
        outputScrollPane = new JScrollPane();
        bottomCenterPanel = new JPanel();

        cipherService = new CipherServiceImpl();

        splitPane.setDividerLocation(300);
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);


        table = cipherService.buildTable();
        getjScrollPane().setViewportView(table);

        splitPane.setTopComponent(getjScrollPane());

        bottomTextPanel.setLayout(new BorderLayout());
        bottomTextPanel.setOpaque(false);

        bottomCenterPanel.setLayout(new BorderLayout());

        outputTextArea.setFont(new Font("Monospaced", 0, 12));
        outputScrollPane.setViewportView(outputTextArea);

        bottomTextPanel.add(bottomCenterPanel, BorderLayout.NORTH);
        bottomTextPanel.add(outputScrollPane, BorderLayout.CENTER);

        bottomCenterPanel = initializeBottomTextPanel();
        bottomTextPanel.add(bottomCenterPanel, BorderLayout.NORTH);

        splitPane.setBottomComponent(bottomTextPanel);

        getMainCipherPanel().add(splitPane, BorderLayout.CENTER);

    }

    @Override
    public abstract void actionButtonActionPerformed(ActionEvent evt);

    public abstract JPanel initializeBottomTextPanel();


    public JTable getTable() {
        return table;
    }

    @Override
    public CipherService getCipherService() {
        return cipherService;
    }

    public JTextArea getOutputTextArea() {
        return outputTextArea;
    }

}
