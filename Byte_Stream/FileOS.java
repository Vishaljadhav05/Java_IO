package Byte_Stream;

import java.io.FileOutputStream;

public class FileOS {
    public static void main(String[] args) {
        try {
            String data = " !   This is FileOutputStream File";
            FileOutputStream fos = new FileOutputStream("F:\\Smart Programming core Java\\Code\\Java_IO\\Byte_Stream\\Creating.txt",false);
            byte[] b = data.getBytes();

            fos.write(b);
            fos.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
