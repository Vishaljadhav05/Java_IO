package File_Handling;

import java.io.File;
import java.io.IOException;

public class GetSpaceInfo {
    public static void main(String[] args)throws IOException 
    {
        File f = new File("F:\\");

        long l = f.getFreeSpace();
        System.out.println("Free Space : "+l/(1024*1024*1024));  //21 gb free


        long l2 = f.getTotalSpace();
        System.out.println("Total Space : "+l2/(1024*1024*1024)); //166 gb Total
    }
}
