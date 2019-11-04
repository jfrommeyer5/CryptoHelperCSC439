package Ciphers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

public class SubstitutionSolver extends BaseCipher{

    private JLabel dictionaryFileJLabel;
    private JTextField dictionaryFileJTextField;
    private JButton browseJButton;
    private JButton generateJButton;
    private JToolBar topJToolbar;

    boolean actionButtonToggle = false;
    Thread substitutionThread;
    SubstitutionSolverImpl substitutionSolverImpl;
    private int[][][][] dictionary;


    public SubstitutionSolver(){
        super();

        dictionaryFileJLabel = new JLabel();
        dictionaryFileJTextField = new JTextField();
        browseJButton = new JButton();
        generateJButton = new JButton();
        topJToolbar = new JToolBar();

        getMainCipherPanel().addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                jPanelComponentShown(evt);
            }
        });

        dictionaryFileJLabel.setText("Dictionary File:");
        topJToolbar.add(dictionaryFileJLabel);

        topJToolbar.add(dictionaryFileJTextField);

        browseJButton.setText("Browse");
        topJToolbar.add(browseJButton);

        generateJButton.setText("Generate");
        topJToolbar.add(generateJButton);

        getMainCipherPanel().add(topJToolbar, BorderLayout.NORTH);;




        initializeActionBtn("Go");
        setMainCipherPanelText("Substitution Solver");
    }

    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        if (actionButtonToggle == false)
        {
            String inputString = getCipherService().formatString(getInputText());
            substitutionSolverImpl = new SubstitutionSolverImpl(inputString);
            substitutionThread = new Thread(substitutionSolverImpl);
            substitutionThread.start();
            actionButtonToggle = true;
            getActionButton().setText("Stop");
        }
        else
        {
            substitutionSolverImpl.stop();
            actionButtonToggle = false;
            getActionButton().setText("Go");
        }
    }

    private void jPanelComponentShown(ComponentEvent evt){
        try
        {
            JarFile jf = new JarFile("cryptohelper-master\\cryptohelper-master\\src\\CryptoHelper.jar");

            ZipEntry ze = jf.getEntry("english.wow");

            BufferedReader br = new BufferedReader(new InputStreamReader(jf.getInputStream(ze)));
            dictionary = new int[26][26][26][26];

            for(int x = 0; x < 26; x++)
            {
                for (int y = 0; y < 26; y++)
                {
                    for(int l = 0; l < 26; l++)
                    {
                        for(int r = 0; r < 26; r++)
                        {
                            dictionary[x][y][l][r] = 1;
                        }
                    }
                }
            }
            String temp = "";
            while ((temp = br.readLine()) != null)
            {
                String[] parse = temp.split(", ");
                dictionary[parse[0].charAt(0)-65][parse[0].charAt(1)-65][parse[0].charAt(2)-65][parse[0].charAt(3)-65] = Integer.parseInt(parse[1]);
            }
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null,
                    "Error:Cannot read from file.\n");
        }
    }

    class SubstitutionSolverImpl implements Runnable
    {
        String ciphertext;
        long iteration = 0;
        char[] key;
        boolean stopToggle = false;

        public void stop()
        {
            stopToggle = true;
        }

        public SubstitutionSolverImpl(String ciphertext)                               // this is the classes constructor
        {
            this.ciphertext = ciphertext;
            key = new char[256];
        }

        public void run()                                                           // this is the "main" method of the thread
        {
            getMainCipherTextArea().setText("best overall = " + score(ciphertext) + " : best score = " + score(ciphertext) + "\n");

//            jTextArea21.append("" + ciphertext.replaceAll("/(.....)/", '\1 ');

            randomize(key);

            double bestScore = score(ciphertext);
            double bestOverall = bestScore - 1;
            int numSmallAdjusts = 0;

            int bestI = 0;
            int bestJ = 0;


            while(true)
            {
                if (stopToggle) return;
//                jTextArea21.append("");

                double bestAdj = bestScore;

                char[] testKey = new char[256];


                for (int i = 0; i < 26; i++)
                {
                    for (int j = i+1; j < 26; j++)
                    {
                        for (int x = 0; x < 256; x++) testKey[x] = key[x];
                        char temp = testKey[i+65];
                        testKey[i+65] = testKey[j+65];
                        testKey[j+65] = temp;

                        double sc = score(plaintext(ciphertext, testKey));

//                        for (int l = 0; l < 26; l++) jTextArea21.append("" + testKey[l+65] + ", ");
//                        jTextArea21.append("\n" + score(plaintext(ciphertext, testKey)) + "\n");
//                        jTextArea21.append("\n");
//                        for (int l = 0; l < 26; l++) jTextArea21.append("" + key[l+65] + ", ");
//                        jTextArea21.append("" + score(plaintext(ciphertext, key)) + "\n");
//                        jTextArea21.append("\n\n");

                        if (sc > bestAdj)
                        {
                            bestAdj = sc;
                            bestI = i;
                            bestJ = j;
                        }
                    }
                }

                if (bestAdj > bestScore)
                {
                    char temp = key[bestI+65];
                    key[bestI+65] = key[bestJ+65];
                    key[bestJ+65] = temp;
                    bestScore = bestAdj;
                    if (bestScore > bestOverall)
                    {
                        numSmallAdjusts = 0;
                        bestOverall = bestScore;
                        getMainCipherTextArea().setText("best overall = " + bestOverall + " : best score = " + bestScore + " : iteration = " + iteration + "\n");
                        getMainCipherTextArea().append("" + plaintext(ciphertext, key)/*.gsub(/(.....)/, '\1 '*/ + "\n");
                    }
                }
                else
                {
                    if (numSmallAdjusts < 5)
                    {
                        smallAdj(key);
                        numSmallAdjusts += 1;
                    }
                    else
                    {
                        randomize(key);
                        numSmallAdjusts = 0;
                    }
                    bestScore=score(plaintext(ciphertext, key));
                }
            }
        }                                                                       // thread is terminating.

        private double score(String string)
        {
            iteration += 1;
            double tally = 0;

            for (int x = 0; x < string.length() - 4; x++)
            {
                tally += Math.log((dictionary[string.charAt(x)-65][string.charAt(x+1)-65][string.charAt(x+2)-65][string.charAt(x+3)-65]));
            }
            return tally;
        }

        private void smallAdj(char[] key)
        {
            int rNum = (int)(Math.random() * 5);

            for (int i = 0; i < rNum; i++)
            {
                int j = (int)(Math.random() * 26);
                int k = (int)(Math.random() * 26);

                if (j!=k)
                {
                    char temp = key[j+65];
                    key[j+65] = key[k+65];
                    key[k+65] = temp;
                }
            }
        }

        private String plaintext(String ciphertext, char[] key)
        {
            String returnString = "";

            for (int x = 0; x < ciphertext.length(); x++)
            {
                returnString = returnString + key[ciphertext.charAt(x)];
            }
            return returnString;
        }

        private void randomize(char[] key)
        {
            ArrayList array = new ArrayList();

            for (int x = 0; x < 26; x++)
            {
                array.add(x, new Character((char)(x + 65)));
            }

            for (int x = 0; x < 26; x++)
            {
                int y = (int)(Math.random() * array.size());
                key[x+65] = ((Character)array.get(y)).charValue();
                array.remove(y);
            }
        }
    }





}
