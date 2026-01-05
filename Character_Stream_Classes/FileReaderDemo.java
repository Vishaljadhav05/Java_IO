package Character_Stream_Classes;

import java.io.FileReader;

public class FileReaderDemo {
     public static void main(String[] args) throws Exception
    {

        FileReader fr = new FileReader("F:\\InputStreamReaderDemo.txt");

        int i;
        while ((i=fr.read()) != -1) {
            System.out.print((char)i);
        }
        
        fr.close();
    }
}
