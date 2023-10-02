package Q1;
import java.util.*;

public class LP43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of eggs: ");
        int egg = input.nextInt();
        double dozen = 12;
        double bread = .5;

        if (egg<48 && egg>0){
            (egg /= dozen) *= .5;
            System.out.print(egg);

        }
    }
}
