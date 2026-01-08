package File_Handling;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        // File f = new File("F:\\Smart Programming core Java\\Code\\Java_IO\\File_Handling\\CreateByFile");

        // if (f.mkdir()) {
        //     System.out.println("success");
        // } else {
        //     System.out.println("Failed.");
        // }

        File f2 = new File("F:\\CreateByFile\\CreateByFileInner\\CreateByFileInnerInner");

        if (f2.mkdirs()) {
            System.out.println("success");
        } else {
            System.out.println("Failed.");
        }
    }
}
