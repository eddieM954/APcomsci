package Q1;
import java.util.*;
import static java.lang.Math.*;

public class LP416 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a angle in degrees: ");
        double deg = input.nextInt();
        double radians = toRadians(deg);
        double sin = sin(radians);
        double cosine = cos(radians);
        double tan = tan(radians);
        System.out.println("Sine: " +(String.format("%.2f", + sin)));
        System.out.println("Cosine: " +(String.format("%.2f", + cosine)));
        System.out.println("Tangent: "+ (String.format("%.2f", + tan)));


    }
}
