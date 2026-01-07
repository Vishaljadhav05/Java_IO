package Character_Stream_Classes;

import java.io.BufferedReader;
import java.io.FileReader;

class BufferedReaderDemo {

    public static void main(String[] args) throws Exception
    {
        FileReader fr = new FileReader("F:\\BufferedReaderDemo.txt");
        BufferedReader bf =  new BufferedReader(fr);

        int i;
        while ((i = bf.read()) != -1) {
            System.out.print((char)i);
        }

        bf.close();
        fr.close();
    }
}