package Character_Stream;

import java.io.FileWriter;

public class Writerr {
    public static void main(String[] args) {

        try {
            String data = "This is my data..";
            FileWriter fw= new FileWriter("F:\\Smart Programming core Java\\Code\\Java_IO\\Character_Stream\\ Writing.txt");
            fw.write(data);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
