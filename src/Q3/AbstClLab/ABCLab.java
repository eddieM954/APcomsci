package Q3.AbstClLab;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ABCLab {
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        //Circle
        System.out.print("Enter circle radius: ");
        double r = kbd.nextDouble();
        Shape sh1 = new Circle(r);
        // Rectangle
        System.out.print("Enter Height: ");
        double rh = kbd.nextDouble();
        System.out.print("Enter width: ");
        double rw = kbd.nextDouble();
        Shape sh2 = new Rectangle(rh, rw);
        // Triangle
        System.out.print("Enter triangle base: ");
        double tb = kbd.nextDouble();
        System.out.print("Enter triangle height: ");
        double th = kbd.nextDouble();
        Shape sh3 = new Triangle(th, tb);

        ((Circle)sh1).printClass();
        sh1.calculateArea();
        sh1.calculateCircumference();

        ((Rectangle)sh2).printClass();
        sh2.calculateArea();
        sh2.calculateCircumference();

        ((Triangle)sh3).printClass();
        sh3.calculateArea();
        sh3.calculateCircumference();

    }
}
