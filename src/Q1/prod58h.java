package Q1;
import java.util.*;

public class prod58h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How much was saved? ");
        int p = input.nextInt();


        System.out.print("How much was the interest rate? ");
        double r = input.nextDouble();

        System.out.print("Number of times compounded per year? ");
        int n = input.nextInt();

        System.out.print("How many days of interest? ");
        int t = input.nextInt();


        double x = ((n * t)/ 365);



        double z = p * (1 +((.01 * r) / n) * Math.pow(x, 1));

        System.out.printf("The interest earned is %.2f\n", +  (z - p));
        System.out.printf("The total amount in savings is now %.2f\n", + z);


    }
}
