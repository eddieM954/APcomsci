package Q2.LP310;
import java.util.*;

public class LP310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of burger: ");
        int num1 = input.nextInt();
        System.out.print("Enter the number of fries: ");
        int num2 = input.nextInt();
        System.out.print("Enter the number of sodas: ");
        int num3 = input.nextInt();

        ClLP310 wow = new ClLP310(num1, num2, num3);
        wow.calc();
        System.out.println(wow);
    }

}
