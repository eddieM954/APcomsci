package Q1.prog76aCl;
import java.util.*;

public class prog76aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number 1-9: ");
        int num = input.nextInt();

        Cl76a wow = new Cl76a (num);
        wow.calc();
        int num2 = wow.getnum2();
        int total = wow.gettotal();

        System.out.println("       "+ num);
        System.out.println("      "+ "X9");
        System.out.println("      " + num2);
        System.out.println("       X12345679");
        System.out.println("    "+ total);
    }
}
