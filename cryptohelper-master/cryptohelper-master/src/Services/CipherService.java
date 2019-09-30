package Services;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public interface CipherService {

    //public void searchCeasar(int m, String inputString, String searchString);

    String formatString(JTextArea jta);
    String formatString(JTextField jtf);
    double calculateFriedman(String inputString);
    JTable buildTable();

    void performSearch(JTextArea j);
    void performSearchAgain(JTextArea j);



}
