package File_Handling;

import java.io.File;
import java.io.IOException;

public class SearchFile1 {
     public static void main(String[] args) throws IOException
    {
        File f = new File("F:\\Smart Programming core Java\\Code\\Java_IO\\File_Handling\\");
        String[] str = f.list();

        // CreateByFile
        // CreateFolder.class
        // CreateFolder.java
        // DeleteFile.class
        // DeleteFile.java
        // FL1.class
        // FL1.java
        // fl2.txt
        // GetFileSize.class
        // GetFileSize.java
        // GetSpaceInfo.class
        // GetSpaceInfo.java
        // Notes.txt
        // Rename.class
        // Rename.java
        // SearchFile1.class
        // SearchFile1.java

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
