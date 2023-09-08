package prod54b.java;
import java.util.*;

public class prod54c {
    public static void main(String[] args){
        Scanner Keyboard = new Scanner(System.in);

        System.out.print("What is the radius? ");
        double radius = Keyboard.nextDouble();

         double circum = (2 * radius * 3.14159);
        System.out.printf("Circumfrence: %.3f\n", + circum);
        double area =  ((radius * radius) * 3.14159);


        System.out.printf("Area of the circle %.3f\n ", area);

    }
}
