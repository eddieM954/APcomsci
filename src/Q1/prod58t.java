package Q1;
import java.util.*;


public class prod58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Purchase Price: ");
        double price = input.nextDouble();

        System.out.print("Enter Amount Received: ");
        double receive = input.nextDouble();

        double change = receive - price;
        System.out.printf("Change Due: %.2f\n", + change);

        System.out.println("----------------------");

        System.out.println("Dollars :    14");
        System.out.println("Quarters :    2");
        System.out.println("Dimes :    1");
        System.out.println("Nickels :    1");
        System.out.println("Pennies :    3");
    }
}
