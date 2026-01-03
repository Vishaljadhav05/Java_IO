package InputStream_And_OutputStream_Classes;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputSreamDemo {
    public static void main(String[] args) throws Exception
    {
        String str = "This is DEMO....!!";

        FileOutputStream fos1 = new FileOutputStream("F:\\Smart Programming core Java\\Code\\Java_IO\\InputStream_And_OutputStream_Classes\\byteArrayOS1.txt");
        FileOutputStream fos2 = new FileOutputStream("F:\\\\Smart Programming core Java\\\\Code\\\\Java_IO\\\\InputStream_And_OutputStream_Classes\\\\byteArrayOS2.txt");

        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        ba.write(str.getBytes());
        ba.writeTo(fos1);
        ba.writeTo(fos2);

    }
}
