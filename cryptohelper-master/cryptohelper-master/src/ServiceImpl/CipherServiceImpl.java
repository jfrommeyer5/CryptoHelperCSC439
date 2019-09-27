package ServiceImpl;


import Services.CipherService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Caret;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class CipherServiceImpl implements CipherService {

    private String searchStr;

    @Override
    public String formatString(JTextArea jta) {
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

    @Override
    public String formatString(JTextField jtf) {
        String inputString = jtf.getText();
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

    public JTable buildTable(){
        JTable jTable = new JTable();

        jTable.setModel(new DefaultTableModel(
                new Object[][]{
                        {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
                        {"B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A"},
                        {"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B"},
                        {"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C"},
                        {"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D"},
                        {"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E"},
                        {"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F"},
                        {"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G"},
                        {"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H"},
                        {"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I"},
                        {"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"},
                        {"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"},
                        {"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"},
                        {"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"},
                        {"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"},
                        {"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"},
                        {"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P"},
                        {"R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q"},
                        {"S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R"},
                        {"T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S"},
                        {"U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T"},
                        {"V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U"},
                        {"W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V"},
                        {"X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W"},
                        {"Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X"},
                        {"Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y"}
                },
                new String[]{
                        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
                }
        ) {
            Class[] types = new Class[]{
                    String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
            };
            boolean[] canEdit = new boolean[]{
                    false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jTable.setRowSelectionAllowed(false);

        return jTable;
    }

    @Override
    public void jTextAreaKeyReleased(KeyEvent evt) {
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
    }

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

    @Override
    public void jTextAreaMouseClicked(MouseEvent evt) {
        if (evt.getButton()== MouseEvent.BUTTON3)
        {
           // CryptoHelper.jPopupMenu1.show((JTextArea)evt.getSource(), evt.getX(), evt.getY());
        }
    }

    public double calculateFriedman(String inputString)
    {
        String tempString;
        double[] array = new double[256];
        double friedman = 0;
        int spinnerValue = 1;

        for (int z = 0; z < spinnerValue; z++)
        {
            tempString = "";
            friedman = 0;

            for (int x = 0; x < inputString.length(); x++)
            {
                if ((x-z%spinnerValue)%spinnerValue==0) tempString = tempString + inputString.charAt(x);
            }

            for (int x = 0; x < 256; x++)
                array[x] = 0;

            for (int x = 0; x < tempString.length(); x++)
            {
                for (char y = 'A'; y <= 'Z'; y++)
                {
                    if (tempString.charAt(x) == y) array[y]++;
                }
            }
            for (char x = 'A'; x <= 'Z'; x++)
            {
                friedman += array[x]/tempString.length() * ((array[x]-1)/(tempString.length()-1));
            }

            return friedman;
        }
        return friedman;
    }



}
