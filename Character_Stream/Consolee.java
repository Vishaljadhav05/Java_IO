package Character_Stream;

import java.io.Console;

public class Consolee {
    public static void main(String[] args) {
        try {
            Console c = System.console();
            String email1 = c.readLine("Enter email: ");

            char[] pass1 = c.readPassword("Enter password: ");
            String pass = new String(pass1);

            if (email1.equals("admin@gmail.com") && (pass.equals("admin123"))) {
                System.out.println("Login Successfull...");
            }
            else{
                System.out.println("Login failed !");
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
