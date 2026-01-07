package Character_Stream_Classes;

import java.io.StringWriter;

public class StringWriterDemo {
    public static void main(String[] args) {
        try {
            StringWriter sw = new StringWriter();
            sw.write("THis is a StringWriter Class file.....!");

            System.out.println(sw);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
