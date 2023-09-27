package Q1;
import java.util.*;

public class prog122h {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = 0;
        System.out.println("Number    Square   Square Root   Cube     4th Root");
        while (num < 20){
            num += 1;
            int sqr = (int)Math.pow(num, 2);
            double root = Math.sqrt(num);
            int cube = (int)Math.pow(num, 3);
            System.out.println(num + "    " + sqr + "    " + String.format("%.4f", root) + "    "  + root + "     "+    cube);



        }
    }
}
// System.out.printf( "%d   %d   %.4f" , num,sqr,root,cube );