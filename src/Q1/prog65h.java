package Q1;
import java.util.*;

public class prog65h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Pounds: ");
        double pound = input.nextInt();

        System.out.print("Enter Shillings: ");
        double shill = input.nextInt();

        System.out.print("Enter Pence: ");
        double pence = input.nextInt();

        double decimal = (shill / 20) - (pence / 100);
        System.out.println("Decimal pounds:" +String.format("%.2f",pound + decimal));
    }
}
// 12 pence to a shilling, 20 shilling to a pound