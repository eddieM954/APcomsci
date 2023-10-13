package Q1;



import java.util.*;

public class LP56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.print(sum);
    }
}
