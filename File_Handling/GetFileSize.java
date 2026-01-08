package File_Handling;

import java.io.File;
import java.io.IOException;

public class GetFileSize {
    public static void main(String[] args) throws IOException
    {
        File f = new File("F:\\File_Handling\\fl2.txt");
        
        long size = f.length();
        System.out.println("File size (bytes): " + size);

        long lastModified = f.lastModified();
        System.out.println("Last modified (milliseconds): " + lastModified);

        System.out.println(f.isFile());
    }
}
