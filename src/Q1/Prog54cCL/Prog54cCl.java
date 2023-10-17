package Q1.Prog54cCL;
import java.util.*;

public class Prog54cCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the radius? ");
        double radius = input.nextDouble();


        Cl54c wow = new Cl54c(radius);
        wow.calc();
        double area = wow.getarea();
        double circum = wow.getcircum();


        System.out.println("The are area of the circle = "+ String.format("%.3f",area));
        System.out.println("The circumference of the circle is " + String.format("%.3f", circum));

    }
}
