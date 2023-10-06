package Q1;
import java.util.*;

public class LP49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1 - 20? ");
        int num = input.nextInt();
        int num2 = (int) (Math.random() * (20 - 1)) + 1;
        System.out.println("The secret number is " + num2 );
        if (num == num2 ){
            System.out.println("You Won!!!");
        }else {
            System.out.println("Better Luck Next Time");
        }
    }
}
