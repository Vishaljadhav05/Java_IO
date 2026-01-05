package Character_Stream_Classes;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;


public class OutputStreamWriterDemo {
    public static void main(String[] args) throws Exception
    {

        String str = "This is a OutputStreamWriter txt file.........   ";
        char[] str2 = {'a','b','c','d','e'};

        FileOutputStream fos = new FileOutputStream("F:\\OutputStreamReaderDemo.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);

  
        osw.write(str);
        osw.write(str2);
        
        //fos.close();
        osw.close();
    }
}
