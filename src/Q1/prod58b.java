package Q1;
import java.util.*;

public class prod58b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What does the variable A equal? ");

        int a = input.nextInt();

        System.out.print("What does the variable B equal? ");
        int b = input.nextInt();

        System.out.print("What does the variable C equal? ");
        int c = input.nextInt();


        int posroot = (-b + (int)Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        int negroot = (-b - (int)Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.print(" Positive Root:" + posroot);
        System.out.print(" Negative root:"+ negroot);









    }



}
