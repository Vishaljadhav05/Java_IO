package Character_Stream_Classes;

import java.io.CharArrayReader;

public class CharArrayReaderDemo {
    public static void main(String[] args) throws Exception 
    {
        char[] ch = {'a','b','c','d','e'};
        CharArrayReader car = new CharArrayReader(ch);

        int i;
        while ((i = car.read()) != -1) {
            System.out.print((char)i + " ");
        }

        car.close();
    }
}
