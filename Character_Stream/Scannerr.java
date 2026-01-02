package Character_Stream;

import java.util.Scanner;

public class Scannerr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Email: ");
        String email = sc.next();

        System.out.println("Enter Password: ");
        String pass = sc.next();

        if (email.equals("admin@gmail.com") && pass.equals("123")) {
            System.out.println("Login Successfully..");
        }
        else{
            System.out.println("Login Failed !");
        }



        sc.close();
    }
}
