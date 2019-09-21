package Ciphers;


//need to bring out of Ciphers folder
//will likely become a Service
public class Counter {
    public int length = 0;

    public String sArray[] = new String[10000];
    public int iArray[] = new int[10000];
    public int pArray[][] = new int[10000][100];

    public void add(String s, int pos)
    {
        sArray[length] = s;
        iArray[length] = 1;
        pArray[length][0] = pos;
        length++;
    }
    public boolean contains(String s)
    {
        for (int x = 0; x < length; x++)
        {
            if (sArray[x].equals(s)) return true;
        }
        return false;
    }
    public void inc(int pos)
    {
        iArray[length - 1]++;
        pArray[length - 1][iArray[length - 1]-1] = pos;
    }


}
