package InputStream_And_OutputStream_Classes;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("null");
        BufferedInputStream bis = new BufferedInputStream(fis);

        int i;
        while ((i = bis.read()) != -1) {
            System.out.println((char)i);
        }

        fis.close();
        bis.close();
    }
    
}
