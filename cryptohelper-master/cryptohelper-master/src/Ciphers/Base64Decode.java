package Ciphers;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Base64Decode extends BaseCipher {

    private ArrayList<String> encodedMesgInBinary;
    private JLabel jLabel;
    private JSpinner jSpinner;
    private JPanel topPanel;

    public Base64Decode(){
        super();

        jLabel = new JLabel();
        jSpinner = new JSpinner();
        topPanel = new JPanel();

        jLabel.setText("Number of times encoded");
        topPanel.add(jLabel);

        jSpinner.setPreferredSize(new Dimension(50, 20));
        jSpinner.setValue(new Integer(1));
        jSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent evt) {
                jSpinnerStateChanged(evt);
            }
        });
        topPanel.add(jSpinner);

        getMainCipherPanel().add(topPanel, BorderLayout.NORTH);

        initializeActionBtn("Decode");
        setMainCipherPanelText("Base64Decode");
    }


    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {

        getMainCipherTextArea().setText("");
        encodedMesgInBinary = new ArrayList<>();
        String text = getInputText().getText();

        convertToDecimal(text);
    }

    public void convertToDecimal(String text){

        int equalsSignCount = 0;
        String binary = "";
        ArrayList<String> base64Separation = new ArrayList<>();

        ArrayList<Integer> base64MapValues = new ArrayList<Integer>();
        ArrayList<String> encodedBase64ValuesBinary = new ArrayList<>();

        Map<String, String> base64EncodingMap = createBase64Map();
        String decodedMessage = "";

        for(int j = 0; j < (Integer) jSpinner.getValue(); j++) {

             base64Separation = new ArrayList<>();
             base64MapValues = new ArrayList<Integer>();
             encodedBase64ValuesBinary = new ArrayList<>();
             decodedMessage = "";
             binary = "";
             equalsSignCount = 0;

            for (int i = text.length(); i > 0; i--) {
                if (text.charAt(i - 1) == '=') {
                    equalsSignCount++;
                    text = text.substring(0, i - 1);
                }
            }

            char textArray[] = text.toCharArray();

            for (int i = 0; i < textArray.length; i++) {
                if (base64EncodingMap.containsKey(Character.toString(textArray[i]))) {
                    base64MapValues.add(Integer.valueOf(base64EncodingMap.get(Character.toString(textArray[i]))));
                }
            }

            for (int i = 0; i < base64MapValues.size(); i++) {
                encodedBase64ValuesBinary.add(Integer.toBinaryString(base64MapValues.get(i)));

                String temp = encodedBase64ValuesBinary.get(i);
                while (temp.length() % 6 != 0) {
                    temp = "0" + temp;
                }
                encodedBase64ValuesBinary.set(i, temp);
            }

            for (int i = 0; i < encodedBase64ValuesBinary.size(); i++) {
                binary = binary + encodedBase64ValuesBinary.get(i);
            }


            for (int i = 0; i < binary.length(); i += 8) {
                base64Separation.add(binary.substring(i, Math.min(i + 8, binary.length())));
            }

            for (int i = 0; i < base64Separation.size(); i++) {
                decodedMessage = decodedMessage + (char) Integer.parseInt((base64Separation.get(i)), 2);
            }

            text = decodedMessage;
        }

        getMainCipherTextArea().append(decodedMessage);

    }


    private Map<String, String> createBase64Map(){
        Map<String, String> base64DecodingMap = new HashMap<String, String>();
        base64DecodingMap.put("A","0");
        base64DecodingMap.put("B","1");
        base64DecodingMap.put("C","2");
        base64DecodingMap.put("D","3");
        base64DecodingMap.put("E","4");
        base64DecodingMap.put("F","5");
        base64DecodingMap.put("G","6");
        base64DecodingMap.put("H","7");
        base64DecodingMap.put("I","8");
        base64DecodingMap.put("J","9");
        base64DecodingMap.put("K","10");
        base64DecodingMap.put("L","11");
        base64DecodingMap.put("M","12");
        base64DecodingMap.put("N","13");
        base64DecodingMap.put("O","14");
        base64DecodingMap.put("P","15");
        base64DecodingMap.put("Q","16");
        base64DecodingMap.put("R","17");
        base64DecodingMap.put("S","18");
        base64DecodingMap.put("T","19");
        base64DecodingMap.put("U","20");
        base64DecodingMap.put("V","21");
        base64DecodingMap.put("W","22");
        base64DecodingMap.put("X","23");
        base64DecodingMap.put("Y","24");
        base64DecodingMap.put("Z","25");
        base64DecodingMap.put("a","26");
        base64DecodingMap.put("b","27");
        base64DecodingMap.put("c","28");
        base64DecodingMap.put("d","29");
        base64DecodingMap.put("e","30");
        base64DecodingMap.put("f","31");
        base64DecodingMap.put("g","32");
        base64DecodingMap.put("h","33");
        base64DecodingMap.put("i","34");
        base64DecodingMap.put("j","35");
        base64DecodingMap.put("k","36");
        base64DecodingMap.put("l","37");
        base64DecodingMap.put("m","38");
        base64DecodingMap.put("n","39");
        base64DecodingMap.put("o","40");
        base64DecodingMap.put("p","41");
        base64DecodingMap.put("q","42");
        base64DecodingMap.put("r","43");
        base64DecodingMap.put("s","44");
        base64DecodingMap.put("t","45");
        base64DecodingMap.put("u","46");
        base64DecodingMap.put("v","47");
        base64DecodingMap.put("w","48");
        base64DecodingMap.put("x","49");
        base64DecodingMap.put("y","50");
        base64DecodingMap.put("z","51");
        base64DecodingMap.put("0","52");
        base64DecodingMap.put("1","53");
        base64DecodingMap.put("2","54");
        base64DecodingMap.put("3","55");
        base64DecodingMap.put("4","56");
        base64DecodingMap.put("5","57");
        base64DecodingMap.put("6","58");
        base64DecodingMap.put("7","59");
        base64DecodingMap.put("8","60");
        base64DecodingMap.put("9","61");
        base64DecodingMap.put("+","62");
        base64DecodingMap.put("/","63");

        return base64DecodingMap;
    }

    private void jSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        JSpinner js = (JSpinner)evt.getSource();

        if (((Integer)js.getValue()).intValue() < 1) js.setValue(new Integer(1));
    }

    public JSpinner getjSpinner() {
        return jSpinner;
    }

    public void setjSpinner(JSpinner jSpinner) {
        this.jSpinner = jSpinner;
    }
}
