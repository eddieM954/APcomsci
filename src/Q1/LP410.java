package Q1;
import java.util.*;

public class LP410 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangular Prism");
        System.out.print("Enter the length: ");
        int len = input.nextInt();
        System.out.print("Enter the width:");
        int wid = input.nextInt();
        System.out.print("Enter the height:");
        int hei = input.nextInt();
        int volume = len * wid * hei;
        System.out.print("The volume is " + volume);
        System.out.println("");

        System.out.println("Sphere");
        System.out.print("Enter the radius: ");
        int rad = input.nextInt();
        int cir = rad * 2;
        double num = ((int)Math.pow(cir, 3 ) * 3.14159) / 6;
        System.out.printf("The volume is: %.2f\n", + num);

        System.out.println("Cube");
        System.out.print("Enter the length of each side: ");
        int lencu = input.nextInt();
        int num2 = (int)Math.pow(lencu, 3);
        System.out.print("The volume is " + num2);


    }
}
