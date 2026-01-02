package Character_Stream;

import java.io.FileReader;

public class Readerr {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("F:\\Smart Programming core Java\\Code\\Java_IO\\Character_Stream\\Creating.txt");

            int i;
            while ((i=fr.read()) != -1) {
                System.out.print((char)i);
            }
            fr.close();

        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
