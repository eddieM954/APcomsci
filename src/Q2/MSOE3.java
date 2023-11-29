package Q2;

import java.util.Scanner;

public class MSOE3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the value of n: ");
        double n = scanner.nextDouble();

        System.out.print("Enter the value of R1: ");
        double R1 = scanner.nextDouble();

        System.out.print("Enter the value of R2: ");
        double R2 = scanner.nextDouble();

        System.out.print("Enter the value of D ");
        double d = scanner.nextDouble();


        double num1 = (n - 1) * (1 / R1 - 1 / R2);
        double num2 = (n - 1) * d / (n * R1 * R2);
        double answer = 1 / (num1 + num2);
        System.out.println("The answer is " + answer);

    }
}