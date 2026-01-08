package File_Handling;

import java.io.File;

public class FL1 {

    public static void main(String[] args) throws Exception
    {
        File f = new File("F:\\fl1.txt");

        if (f.createNewFile()) {
            System.out.println("File Created Successfully.");
        }
        else{
            System.out.println("File Not Created.");
        }
    }
}