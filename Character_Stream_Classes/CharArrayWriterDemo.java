package Character_Stream_Classes;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayWriterDemo {


    public static void main(String[] args) throws Exception 
    {

        
        CharArrayWriter caw = new CharArrayWriter();
        caw.write("This is car array writer file");

        FileWriter fw1 = new FileWriter("F:\\fw1.txt");
        FileWriter fw2 = new FileWriter("F:\\fw2.txt");
        FileWriter fw3= new FileWriter("F:\\fw3.txt");


        caw.writeTo(fw1);
        caw.writeTo(fw2);
        caw.writeTo(fw3);

        caw.close();
        fw1.close();
        fw2.close();
        fw3.close();
    }
}

