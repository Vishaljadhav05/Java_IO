package Byte_Stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileIS2 {
    public static void main(String[] args)
    {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("F:\\Smart Programming core Java\\Code\\Java_IO\\Byte_Stream\\a.txt");
            int i;
            while ((i=fis.read()) != -1) {
                System.out.print((char)i);
            }
        } 
        catch (IOException e) {
            System.out.println(e);
        }
        finally{ //This process is become very lengthy so we use the concept of try with resource...
            try {
                fis.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }
        
    }
}
