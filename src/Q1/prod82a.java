package Q1;
import java.util.*;

public class prod82a {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Speed Limit: ");
        int limit = input.nextInt();

        System.out.print("Enter the vehicle speed:  ");
        int speed = input.nextInt();

        int fine = 20 + ((speed - limit) * 5);
        System.out.print("Fine:   $" + fine);
    }
}
