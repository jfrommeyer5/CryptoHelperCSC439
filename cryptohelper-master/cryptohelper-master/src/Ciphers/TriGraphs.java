package Ciphers;

import java.awt.event.ActionEvent;

public class TriGraphs extends BaseCipher {

    public TriGraphs(){
        super();
        initializeActionBtn("Show TriGraphs");
        setMainCipherPanelText("TriGraphs");
    }

    @Override
    public void actionButtonActionPerformed(ActionEvent evt) {
        String inputString = getCipherService().formatString(getInputText());

        String tempString;
        Counter counter = new Counter();

        for (int x = 0; x < inputString.length() - 2; x++)
        {
            tempString = inputString.substring(x, x+3);
            if (inputString.indexOf(tempString, x)>=0)
            {
                if (!counter.contains(tempString))
                {
                    counter.add(tempString, x);
                    for (int y = x; y >= 0;)
                    {
                        if ((y = inputString.indexOf(tempString, y+3)) >= 0) counter.inc(y);
                    }
                }
            }
        }

        getMainCipherTextArea().setText("");

        for (int x = 0; x < counter.length; x++)
        {
            getMainCipherTextArea().append(counter.sArray[x]);
            getMainCipherTextArea().append(" = ");
            getMainCipherTextArea().append(new Integer(counter.iArray[x]).toString());
            getMainCipherTextArea().append(" at positions ");
            for (int y = 0; y < counter.iArray[x]; y++)
            {
                getMainCipherTextArea().append("" + counter.pArray[x][y]);
                if (y!=counter.iArray[x] - 1)
                    getMainCipherTextArea().append(",");
            }
            getMainCipherTextArea().append("\n");
        }
    }

}
