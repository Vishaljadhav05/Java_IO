package File_Handling;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

class MyFilter implements FilenameFilter{

     String n;
    MyFilter(String n){
        this.n= n;

    }
    public boolean accept(File dir, String name){
        //return name.startsWith(n);
        //Returns name start with G
        //GetFileSize.class
        // GetFileSize.java
        // GetSpaceInfo.class
        // GetSpaceInfo.java

        return name.endsWith(n);
        //Returns all the file who ends with java
        //CreateFolder.java
        // DeleteFile.java
        // FL1.java
        // GetFileSize.java
        // GetSpaceInfo.java
        // Rename.java
        // SearchFile1.java
        // SearchFile2.java

    }
}
public class SearchFile2 {
     public static void main(String[] args) throws IOException
    {
        File f = new File("F:File_Handling\\");
        
        MyFilter mf = new MyFilter("java");

        String[] str = f.list(mf);

        

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}