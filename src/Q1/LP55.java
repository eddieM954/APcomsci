package Q1;

import java.util.*;

public class LP55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = input.nextInt();
        while (num > 0){
            int digit = num % 10;
            System.out.println(digit);
            num = num /10;
        }
    }
}
