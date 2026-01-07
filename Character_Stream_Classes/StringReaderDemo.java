package Character_Stream_Classes;

import java.io.StringReader;

public class StringReaderDemo {
     public static void main(String[] args) throws Exception
    {
        StringReader sr = new StringReader("This is a string reader......!");
        int i;
        while ((i = sr.read()) != -1) {
            System.out.print((char)i);
        }

        sr.close();
    }
}
