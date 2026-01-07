package Character_Stream_Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
    public static void main(String[] args) throws Exception
    {
        FileWriter fw = new FileWriter("F:\\BufferedWriterDemo.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("THis is Buffered writer file....");

        bw.close();
        fw.close();
    }
}
