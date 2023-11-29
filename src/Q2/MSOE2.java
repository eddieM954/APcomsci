package Q2;

import java.util.*;
public class MSOE2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        int a = input.nextInt();
        System.out.print("Enter the value of C: ");
        int c = input.nextInt();
        System.out.print("Enter the value of A in degrees: ");
        double adeg = input.nextDouble();

        double cdeg = (adeg * c ) / a;
        double perim = 180 - cdeg - adeg;
        System.out.println(String.format("A degree: " + adeg + "\tB degree:"+ perim +"\tC degree: " + cdeg ));
    }
}