package File_Handling;

import java.io.File;
import java.io.FilenameFilter;

public class SearchFile3 {

    public static void main(String[] args) {
        File f = new File("F:\\File_Handling");
        String[] str = f.list(new FilenameFilter() {
            public boolean accept(File dir, String name){
                return name.startsWith("M");  //MyFilter.class

            }
        });

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}