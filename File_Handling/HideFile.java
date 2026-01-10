package File_Handling;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HideFile {
    public static void main(String[] args) throws Exception
    {
        Path p = Paths.get("F:\\SP Core Java\\Code\\Java_IO\\File_Handling\\HidedFile.txt");
        Files.setAttribute(p, "dos:hidden", true, LinkOption.NOFOLLOW_LINKS);
    }
}
