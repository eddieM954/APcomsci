package Q1;
import java.util.*;

public class LP41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of copies to be printed: ");
        double copy = input.nextDouble();

        if (copy < 100 && copy > 0){
            copy *=.30;
            System.out.print("Price per copy is : $0.30");
        }
        if (copy < 500 && copy > 100){
            copy *= .28;
            System.out.println("Price per copy is : $0.28");

        }
        if (copy < 750 && copy > 500){
            copy *= .27;
            System.out.println("Price per copy is : $0.27");

        }
        if (copy < 1000 && copy > 750){
            copy *= .26;
            System.out.println("Price per copy is : $0.26");

        }
        if (copy > 1000){
            copy *= .25;
            System.out.println("Price per copy is : $0.25");

        }
        System.out.println("Total cost  is $" + copy);
    }
}
