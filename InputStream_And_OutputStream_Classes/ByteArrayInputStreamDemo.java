package InputStream_And_OutputStream_Classes;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String str = "This is Data....";
        byte[] b = str.getBytes();

        ByteArrayInputStream ba = new ByteArrayInputStream(b);
        int i;

        while ((i=ba.read()) != -1) {
            System.out.print((char)i);
        }
    }
}
