package Q1;
import java.util.*;

public class LP517 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password = "year2023";
        String pass1;
        String pass2;
        String pass3;
        System.out.print("What is the password? ");
        pass1 = input.next();
        if (pass1.equals(password)){
            System.out.print("Welcome");
        }else{
            System.out.println("The password you typed is incorrect.");
            System.out.println("What is the password? ");

        }
        pass2 = input.next();
        if (pass2.equals(password)){
            System.out.print("Welcome");
        }else{
            System.out.println("The password you typed is incorrect. ");
            System.out.println("What is the password? ");
        }
        pass3 = input.next();
        if (pass3.equals(password)){
            System.out.print("Welcome");
        }else{
            System.out.print("The password you typed is incorrect. ");
        }
    }
}