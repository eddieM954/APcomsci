package Q1.Prog54cCL;
import java.util.*;

public class Prog54cCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the raidus? ");
        int radius = input.nextInt();


        Cl54c wow = new Cl54c(radius, area, circum);
        double area = wow.getarea();
        double circum = wow.getcircum;
        wow.calc();

    }
}
