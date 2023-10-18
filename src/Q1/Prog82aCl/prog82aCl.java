package Q1.Prog82aCl;
import java.util.*;

public class prog82aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the speed limit: ");
        int limit = input.nextInt();

        System.out.print("Enter the vehicle speed: ");
        int speed = input.nextInt();

        Cl82a wow = new Cl82a( limit, speed);
        wow.calc();
        int fine = wow.getfine();

        System.out.print("---------$" + fine);
    }
}
