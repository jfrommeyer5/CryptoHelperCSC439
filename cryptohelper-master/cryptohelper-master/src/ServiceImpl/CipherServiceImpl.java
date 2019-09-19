package ServiceImpl;


import Services.CipherService;

import javax.swing.*;

public class CipherServiceImpl implements CipherService {


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
}
