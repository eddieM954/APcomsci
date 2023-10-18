package Q1.prog88aCl;
import java.util.*;

public class prog88aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number 1-13: ");
        int num1 = input.nextInt();
        System.out.print("Enter a number 2-20: ");
        int num2 = input.nextInt();
         Cl88a wow = new Cl88a(num1, num2);
         wow.calc();
         int sum = wow.getsum();
         int pro = wow.getpro();
         int diff = wow.getdiff();
         double average = wow.getaverage();
         int abs = wow.getabs();
         int min = wow.getmin();
         int max = wow.getmax();


    }
}
