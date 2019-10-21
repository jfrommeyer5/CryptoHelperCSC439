package Ciphers;


import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Base64Encode extends BaseCipher {

    private ArrayList<String> base64InDecimal;

    public Base64Encode(){
        super();
        initializeActionBtn("Encode");
    }



    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {

        getMainCipherTextArea().setText("");
        base64InDecimal = new ArrayList<>();
        String text = getInputText().getText();

        convertToBase64(text);

    }

    public void convertToBase64(String text){

        int textLength = getInputText().getText().length();

        String binaryRep = "";
        ArrayList<String> binaryRepArrayList = new ArrayList<>();
        ArrayList<String> base64Separation = new ArrayList<>();
        char[] textSplit = text.toCharArray();
        String encodedMessage = "";
        int countForAddingEqualSigns = 0;

        for(int i = 0; i < textLength; i++){
            binaryRepArrayList.add(Integer.toBinaryString(textSplit[i]));

            String temp = binaryRepArrayList.get(i);
            while(temp.length() % 8 != 0){
                temp = "0" + temp;
            }
            binaryRepArrayList.set(i, temp);
        }

        for(int i = 0; i < binaryRepArrayList.size(); i++){
            binaryRep = binaryRep + binaryRepArrayList.get(i);
        }

        for(int i = 0; i < binaryRep.length(); i+=6){
            base64Separation.add(binaryRep.substring(i, Math.min(i + 6, binaryRep.length())));
        }

        for(int i = 0; i < base64Separation.size(); i++){

            while(base64Separation.get(i).length() != 6){
                if(base64Separation.get(i).length() != 6){
                    base64Separation.set(i, base64Separation.get(i) + "00");
                    countForAddingEqualSigns++;
                }
            }
        }

        for(int i = 0; i < base64Separation.size(); i++){
            base64InDecimal.add(Integer.toUnsignedString(Integer.parseInt((base64Separation.get(i)),2)));
        }


        Map<String, String> base64EncodingMap = createBase64Map();

        for(int i = 0; i < base64InDecimal.size(); i++){

            if(base64EncodingMap.containsKey(base64InDecimal.get(i))){
                encodedMessage = encodedMessage + base64EncodingMap.get(base64InDecimal.get(i));
            }
        }

        for(int i = 0; i < countForAddingEqualSigns; i++){
            encodedMessage = encodedMessage + "=";
        }

        getMainCipherTextArea().append(encodedMessage);
    }


    private Map<String, String> createBase64Map(){
        Map<String, String> base64EncodingMap = new HashMap<String, String>();
        base64EncodingMap.put("0","A");
        base64EncodingMap.put("1","B");
        base64EncodingMap.put("2","C");
        base64EncodingMap.put("3","D");
        base64EncodingMap.put("4","E");
        base64EncodingMap.put("5","F");
        base64EncodingMap.put("6","G");
        base64EncodingMap.put("7","H");
        base64EncodingMap.put("8","I");
        base64EncodingMap.put("9","J");
        base64EncodingMap.put("10","K");
        base64EncodingMap.put("11","L");
        base64EncodingMap.put("12","M");
        base64EncodingMap.put("13","N");
        base64EncodingMap.put("14","O");
        base64EncodingMap.put("15","P");
        base64EncodingMap.put("16","Q");
        base64EncodingMap.put("17","R");
        base64EncodingMap.put("18","S");
        base64EncodingMap.put("19","T");
        base64EncodingMap.put("20","U");
        base64EncodingMap.put("21","V");
        base64EncodingMap.put("22","W");
        base64EncodingMap.put("23","X");
        base64EncodingMap.put("24","Y");
        base64EncodingMap.put("25","Z");
        base64EncodingMap.put("26","a");
        base64EncodingMap.put("27","b");
        base64EncodingMap.put("28","c");
        base64EncodingMap.put("29","d");
        base64EncodingMap.put("30","e");
        base64EncodingMap.put("31","f");
        base64EncodingMap.put("32","g");
        base64EncodingMap.put("33","h");
        base64EncodingMap.put("34","i");
        base64EncodingMap.put("35","j");
        base64EncodingMap.put("36","k");
        base64EncodingMap.put("37","l");
        base64EncodingMap.put("38","m");
        base64EncodingMap.put("39","n");
        base64EncodingMap.put("40","o");
        base64EncodingMap.put("41","p");
        base64EncodingMap.put("42","q");
        base64EncodingMap.put("43","r");
        base64EncodingMap.put("44","s");
        base64EncodingMap.put("45","t");
        base64EncodingMap.put("46","u");
        base64EncodingMap.put("47","v");
        base64EncodingMap.put("48","w");
        base64EncodingMap.put("49","x");
        base64EncodingMap.put("50","y");
        base64EncodingMap.put("51","z");
        base64EncodingMap.put("52","0");
        base64EncodingMap.put("53","1");
        base64EncodingMap.put("54","2");
        base64EncodingMap.put("55","3");
        base64EncodingMap.put("56","4");
        base64EncodingMap.put("57","5");
        base64EncodingMap.put("58","6");
        base64EncodingMap.put("59","7");
        base64EncodingMap.put("60","8");
        base64EncodingMap.put("61","9");
        base64EncodingMap.put("62","+");
        base64EncodingMap.put("63","/");

        return base64EncodingMap;
    }

}
