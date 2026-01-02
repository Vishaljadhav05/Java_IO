package Byte_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyPaste {
    //Copying data from 1 file to other
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("F:\\Smart Programming core Java\\Code\\Java_IO\\Byte_Stream\\copy.txt");
            FileOutputStream fos = new FileOutputStream("F:\\Smart Programming core Java\\Code\\Java_IO\\Byte_Stream\\paste.txt");
            int i;

            while ((i=fis.read()) != -1) {
                //System.out.print((char)i);
                fos.write(i);
            }

            fis.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }


    }
    
}
