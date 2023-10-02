package Q1;
import java.util.*;

public class LP42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        int weight = input.nextInt();

        System.out.print("Enter the length in centimeters: ");
        int length = input.nextInt();

        System.out.print("Enter the width in centimeters: ");
        int width = input.nextInt();

        System.out.print("Enter the height in centimeters: ");
        int height = input.nextInt();

        if (weight > 27){
            System.out.println("Too Heavy");
        }
        if ((length * width * height)> 10000){
            System.out.print("Too Large");
        }
        if (weight > 27 && length * width * height > 10000){
            System.out.println("Too Heavy and too large");
        }

    }
}
