package File_Handling;

import java.io.File;

public class Rename {
    
    public static void main(String[] args) throws Exception
    {
        File f = new File("F:\\fl1.txt");
        File f2 = new File("F:\\fl2.txt");

        if (f.renameTo(f2)) {
            System.out.println("Success.");
        }
        else{
            System.out.println("Failed.");
        }
    }
}
