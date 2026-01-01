package Byte_Stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileIS {
    public static void main(String[] args)
    {
        try {
            FileInputStream fis = new FileInputStream("F:\\Smart Programming core Java\\Code\\Java_IO\\Byte_Stream\\a.txt");
            int i;
            while ((i=fis.read()) != -1) {
                System.out.print((char)i);
            }
            fis.close(); // Sometimes exception may occur and the resouce is not close !!! 
            //So we can provide it in finally block
        } 
        catch (IOException e) {
            System.out.println(e);
        }
        
    }
}
