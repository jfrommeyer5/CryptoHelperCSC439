package Services;

import javax.swing.*;

public interface CipherService {

    //public void searchCeasar(int m, String inputString, String searchString);

    String formatString(JTextArea jta);
    String formatString(JTextField jtf);

    JTable buildTable();
}
