package File_Handling;

import java.io.File;

public class ReadOnlyDemo {

    public static void main(String[] args) {
        File f = new File("F:\\SP Core Java\\Code\\Java_IO\\File_Handling\\ReadOnlyFile.txt");
        
        if (f.setReadOnly()) {
            System.out.println("SUccess");
        } else {
            System.out.println("Failed !");
        }

        System.out.println("-------------------------------------");
        System.out.println("File can be read : "+ f.canRead());
        System.out.println("Can we write in file: " + f.canWrite());
    }
}