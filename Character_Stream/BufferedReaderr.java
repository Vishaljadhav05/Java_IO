package Character_Stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class BufferedReaderr {
    public static void main(String[] args) {
       try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

             System.out.println("Enter Name: ");
             String str = br.readLine();

             System.out.println(str);

             isr.close();
             br.close();
       } catch (Exception e) {
           System.out.println(e);
       }
    }
}
