package File_Handling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) throws Exception
    {
        File f = new File("F:\\file.txt");

        if (f.delete()) {
            System.out.println("Deleted.");
        } else {
            System.out.println("Not Deleted!");
        }
        
    }
}
