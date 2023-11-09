package Q2.Lp39;
import java.util.*;

public class LP39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birthdate:");
        System.out.print("Year: ");
        int year1 = input.nextInt();
        System.out.print("Month: ");
        int month1 = input.nextInt();
        System.out.print("Day: ");
        int day1 = input.nextInt();
        System.out.println("Enter today's date: ");
        System.out.print("Year: ");
        int year2 = input.nextInt();
        System.out.print("Month: ");
        int month2 = input.nextInt();
        System.out.print("Day: ");
        int day2 = input.nextInt();
        ClLP39 wow = new ClLP39(year1, year2, month1, month2, day1, day2);
        wow.calc();
        System.out.println(wow);

    }
}
