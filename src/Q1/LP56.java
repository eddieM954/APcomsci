package Q1;
import java.util.*;

public class LP56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        while (num > 100 && num < 1000){
            int sum = num%=10;
            sum /= 10;
            int sum2 = sum%10;
            sum2/=10;
            int sum3 = sum2%10;
            System.out.print(num + sum + sum2);
        }
    }
}
