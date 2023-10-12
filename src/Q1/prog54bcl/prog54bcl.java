package Q1.prog54bcl;
import java.util.*;

public class prog54bcl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the first number? ");
        int num1 = input.nextInt();
        System.out.print("What is the second number? ");
        int num2 = input.nextInt();
        System.out.print("What is the third number? ");
        int num3 = input.nextInt();
        System.out.print("What is the fourth number? ");
        int num4 = input.nextInt();

        Cl54b wow = new Cl54b(num1, num2, num3, num4);
        wow.calc();
        int sum = wow.getsum();

        System.out.print(sum);

    }
}