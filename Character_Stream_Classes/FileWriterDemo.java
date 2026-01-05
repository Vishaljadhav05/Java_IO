package Character_Stream_Classes;

import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) throws Exception
    {
        String str = "This is a FileWriter txt file.........   ";
        FileWriter fw = new FileWriter("F:\\FileWriterDemo.txt");
    
        fw.write(str);

        fw.close();
    
    }
}
