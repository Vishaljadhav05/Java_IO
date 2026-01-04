package InputStream_And_OutputStream_Classes;

import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream("E:\\ps.txt");
        ps.println("Hello vishal....");
        ps.print(1000);
        ps.println("Demo class");

        ps.close();
    }
}
