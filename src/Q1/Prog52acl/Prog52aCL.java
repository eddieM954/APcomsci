package Q1.Prog52acl;
import java.util.*;

public class Prog52aCL {  // Driver Class (Main)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = input.nextInt();
        System.out.print("Enter Width: ");
        int w = input.nextInt();

        // Calculation Section
        CL52a wow = new CL52a(l,w);
        wow.calc();  // Dont forget to call cal or setThing

        int area = wow.getArea();
        int perim = wow.getPerim();

        // output section

        System.out.println("Rectangle area:" + area);
        System.out.println("Rectangle perimeter: " + perim);
    }
}
