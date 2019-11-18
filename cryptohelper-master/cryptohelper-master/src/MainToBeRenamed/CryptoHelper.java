package MainToBeRenamed;

import Ciphers.*;
import ServiceImpl.CipherServiceImpl;
import Services.CipherService;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import Menu.OptionsMenu;

public class CryptoHelper extends javax.swing.JFrame {
    
    public CryptoHelper() {
        initComponents();
    }

    private void initComponents() {
        termsOfTheGPL = new TermsOfTheGPL();
        frequencyCount = new FrequencyCount();
        runTheAlphabet = new RunTheAlphabet();
        biGraphs = new BiGraphs();
        triGraphs = new TriGraphs();
        nGraphs = new NGraphs();
        affineKnownPlaintextAttack = new AffineKnownPlaintextAttack();
        affineEncipher = new AffineEncipherDecipher("encipher");
        affineDecipher = new AffineEncipherDecipher("decipher");
        splitOffAlphabets = new SplitOffAlphabets();
        polyMonoCalculator = new PolyMonoCalculator();
        viginereEncipher = new ViginereEncipher();
        viginereDecipher = new ViginereDecipher();
        viginereBruteForce = new ViginereBruteForce();
        autoKeyCyphertextAttack = new AutoKeyCyphertextAttack();
        autoKeyPlaintextAttack = new AutoKeyPlaintextAttack();
        autoKeyDecipher = new AutoKeyDecipher();
        hillBruteForce = new HillBruteForce();
        columnTranspositionWorksheet = new ColumnTranspositionWorksheet();
        gcdAndInverse = new GCDAndInverse();
        substitutionSolver = new SubstitutionSolver();
        base64Encode = new Base64Encode();

        baconEncipher = new BaconEncipher();
        baconDecipher = new BaconDecipher();

        morseEncode = new MorseEncode();
        pigMorse = new pigmorse();

        alBhedEncipher = new AlBhed();
        alBhedDecipher = new AlBhedDecrypt();


//        base64Decode = new Base64Decode();
        playfairEncipher = new PlayfairEncipher();



        optionsMenu = new OptionsMenu();

        pigLatinEncipher = new encryptPL();
        pigLatinDecipher = new decryptPL();

        encryptkw = new encryptKW();
        decryptkw = new decryptKW();
        
        caesarcipher = new caesarCipher();
        columnEncrypt = new columnEncrypt();
        columnDecrypt = new columnDecrypt();
        jscrollPane34 = new JScrollPane();
        jscrollPane35 = new JScrollPane();

        jScrollPane29 = new JScrollPane();
        jScrollPane30 = new JScrollPane();
        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        jSplitPane1 = new JSplitPane();
        jScrollPane1 = new JScrollPane();
        inputText = new JTextArea();
        rightHandNavPanelTab = new JTabbedPane();
        jScrollPane10 = new JScrollPane();
        jScrollPane29 = new JScrollPane();
        jScrollPane30 = new JScrollPane();
        jScrollPane31 = new JScrollPane();
        jScrollPane32 = new JScrollPane();
        jScrollPane33 = new JScrollPane();

        scytaleEncipher = new Scytale_Encipher();
        scytaleDecipher = new Scytale_Decipher();


        Object[] ciphersList = {frequencyCount, runTheAlphabet, encryptkw, decryptkw, pigLatinEncipher, pigLatinDecipher, caesarcipher, baconEncipher, baconDecipher, alBhedEncipher, alBhedDecipher, columnEncrypt,
                columnDecrypt, biGraphs, triGraphs, nGraphs, affineKnownPlaintextAttack, affineEncipher, affineDecipher, splitOffAlphabets, polyMonoCalculator,
                viginereEncipher, viginereDecipher, viginereBruteForce, autoKeyCyphertextAttack, autoKeyPlaintextAttack, autoKeyDecipher, hillBruteForce,
                columnTranspositionWorksheet, gcdAndInverse, base64Encode, substitutionSolver, termsOfTheGPL, playfairEncipher, morseEncode, pigMorse};

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("CryptoHelper \u00a9Gary Watson 2005 (Under the terms of the GPL)");
        jSplitPane1.setDividerLocation(80);
        jSplitPane1.setOrientation(JSplitPane.VERTICAL_SPLIT);
        inputText.setFont(new Font("Monospaced", 0, 12));
        inputText.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        inputText.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(inputText);
/*
        jbuttonOpenFile.setText("Open File!");
        jbuttonOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButttonOpenFileActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        jScrollPane1.setColumnHeaderView(jbuttonOpenFile);
*/
        jSplitPane1.setTopComponent(jScrollPane1);
        rightHandNavPanelTab.setTabPlacement(JTabbedPane.RIGHT);
        addActionButtonActionListener(ciphersList);
        addMouseListeners(ciphersList);
        addKeyListeners(ciphersList);
        addRightHandNavPanelTabs(ciphersList);

        scytaleEncipher.getMainCipherTextArea().addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        scytaleEncipher.getMainCipherTextArea().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        scytaleEncipher.getActionButton().addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                scytaleEncipher.setInputText(inputText);
            }
        });

        rightHandNavPanelTab.addTab("Scytale Encipher", scytaleEncipher.getMainCipherPanel());
//end Scytale_Encipher

        scytaleDecipher.getMainCipherTextArea().addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        scytaleDecipher.getMainCipherTextArea().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        scytaleDecipher.getActionButton().addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                scytaleDecipher.setInputText(inputText);
            }
        });

        rightHandNavPanelTab.addTab("Scytale Decipher", scytaleDecipher.getMainCipherPanel());
//end Scytale_dDecipher

        jSplitPane1.setBottomComponent(rightHandNavPanelTab);

        getContentPane().add(jSplitPane1, BorderLayout.CENTER);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1000)/2, (screenSize.height-800)/2, 1000, 800);
    }
    // </editor-fold>//GEN-END:initComponents

    public void addActionButtonActionListener(Object[] ciphersList){
        try{
            for(int i = 0; i < ciphersList.length; i++){
                Method m = ciphersList[i].getClass().getMethod("getActionButton", null);

                JButton actionButton = (JButton) m.invoke(ciphersList[i]);
                BaseCipher object = (BaseCipher) ciphersList[i];
                actionButton.addActionListener( new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        object.setInputText(inputText);
                    }
                });
            }
        }
        catch(Exception e){
            //todo error handling.
        }
    }

    public void addMouseListeners(Object[] ciphersList){
        try{
            for(int i = 0; i < ciphersList.length; i++){
                Method m = ciphersList[i].getClass().getMethod("getMainCipherTextArea", null);

                JTextArea mainCipherTextArea = (JTextArea) m.invoke(ciphersList[i]);
                mainCipherTextArea.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent evt) {
                        jTextAreaMouseClicked(evt);
                    }
                });
            }
        }
        catch(Exception e){
            //todo error handling
        }
    }

    public void addKeyListeners(Object[] ciphersList){

        try{
            for(int i = 0; i < ciphersList.length; i++){
                Method m = ciphersList[i].getClass().getMethod("getMainCipherTextArea", null);

                JTextArea mainCipherTextArea = (JTextArea) m.invoke(ciphersList[i]);
                mainCipherTextArea.addKeyListener(new KeyAdapter() {
                    public void keyReleased(KeyEvent evt) {
                        jTextAreaKeyReleased(evt);
                    }
                });
            }
        }
        catch(Exception e){
            //todo error handling
        }
    }

    public void addRightHandNavPanelTabs(Object[] ciphersList){

        try{
            for(int i = 0; i < ciphersList.length; i++){

                Method getMainCipherPanel = ciphersList[i].getClass().getMethod("getMainCipherPanel", null);
                Method getMainCipherPanelText = ciphersList[i].getClass().getMethod("getMainCipherPanelText", null);

                JPanel mainCipherPanel = (JPanel) getMainCipherPanel.invoke(ciphersList[i]);
                String mainCipherPanelText = (String) getMainCipherPanelText.invoke(ciphersList[i]);
                rightHandNavPanelTab.addTab(mainCipherPanelText, mainCipherPanel);
            }
        }
        catch(Exception e){
            //todo error handling
        }
    }

    private void jButttonOpenFileActionPerformed(java.awt.event.ActionEvent evt) throws IOException {


        final JFileChooser fc = new JFileChooser();

//In response to a button click:
        int returnVal = fc.showOpenDialog(null);

        String inputFile = fc.getSelectedFile().getPath();

        String intmandun = " ";

        try {
            intmandun = new String(Files.readAllBytes(Paths.get(inputFile)));
        } catch (IOException e) {
            e.printStackTrace();
        }

//        String lines = Files.readAllLines(Paths.get(inputFile));
//        String intman = lines;
        String inputString = intmandun;
        inputText.setText(inputString);
    }

    private void jTextAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaKeyReleased
        if (evt.isControlDown())
        {
            if (evt.getKeyCode()== KeyEvent.VK_F)
            {
                performSearch((JTextArea)evt.getSource());
            }
            else if (evt.getKeyCode()== KeyEvent.VK_G)
            {
                performSearchAgain((JTextArea)evt.getSource());
            }
        }
    }//GEN-LAST:event_jTextAreaKeyReleased
    private void performSearch(JTextArea j)
    {
            Caret c = j.getCaret();
            String str = j.getText();
            str = str.toUpperCase();
            searchStr = JOptionPane.showInputDialog("Please input a string to search for.", searchStr);
            searchStr = searchStr.toUpperCase();
            int x = str.indexOf(searchStr, c.getDot());
            c.setDot(x);
            if(x>=0)
            {
                c.moveDot(c.getDot() + searchStr.length());
                c.setSelectionVisible(true);
            }            
    }
    private void performSearchAgain(JTextArea j)
    {
            Caret c = j.getCaret();
            String str = j.getText();
            str = str.toUpperCase();
            int x = str.indexOf(searchStr, c.getDot());
            c.setDot(x);
            if(x>=0)
            {
                c.moveDot(c.getDot() + searchStr.length());
                c.setSelectionVisible(true);
            }            
    }
    private void jTextAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaMouseClicked
        if (evt.getButton()== MouseEvent.BUTTON3)
        {
            optionsMenu.getOptionsMenu().show((JTextArea)evt.getSource(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTextAreaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CryptoHelper().setVisible(true);
            }
        });
    }

    private String searchStr;

    private CipherService cipherService = new CipherServiceImpl();

    private TermsOfTheGPL termsOfTheGPL;
    private FrequencyCount frequencyCount;
    private RunTheAlphabet runTheAlphabet;
    private BiGraphs biGraphs;
    private TriGraphs triGraphs;
    private NGraphs nGraphs;
    private AffineKnownPlaintextAttack affineKnownPlaintextAttack;
    private AffineEncipherDecipher affineEncipher;
    private AffineEncipherDecipher affineDecipher;
    private SplitOffAlphabets splitOffAlphabets;
    private PolyMonoCalculator polyMonoCalculator;
    private ViginereEncipher viginereEncipher;
    private ViginereDecipher viginereDecipher;
    private ViginereBruteForce viginereBruteForce;
    private AutoKeyCyphertextAttack autoKeyCyphertextAttack;
    private AutoKeyPlaintextAttack autoKeyPlaintextAttack;
    private AutoKeyDecipher autoKeyDecipher;
    private HillBruteForce hillBruteForce;
    private ColumnTranspositionWorksheet columnTranspositionWorksheet;
    private GCDAndInverse gcdAndInverse;
    private SubstitutionSolver substitutionSolver;
    private Base64Encode base64Encode;
    private pigmorse pigMorse;

    //private Base64Decode base64Decode;

    private BaconEncipher baconEncipher;
    private BaconDecipher baconDecipher;
    private AlBhed alBhedEncipher;
    private AlBhedDecrypt alBhedDecipher;

    private PlayfairEncipher playfairEncipher;


    private OptionsMenu optionsMenu;

    private encryptPL pigLatinEncipher;
    private decryptPL pigLatinDecipher;

    private encryptKW encryptkw;
    private decryptKW decryptkw;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;

    private caesarCipher caesarcipher;
    private javax.swing.JScrollPane jScrollPane33;
    
    private columnEncrypt columnEncrypt;
    private columnDecrypt columnDecrypt;
    private javax.swing.JScrollPane jscrollPane34;
    private javax.swing.JScrollPane jscrollPane35;

    private Scytale_Encipher scytaleEncipher;
    private Scytale_Decipher scytaleDecipher;
    
    private MorseEncode morseEncode;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;

    private javax.swing.JButton jbuttonOpenFile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane rightHandNavPanelTab;
    private javax.swing.JTextArea inputText;
    // End of variables declaration//GEN-END:variables

}
