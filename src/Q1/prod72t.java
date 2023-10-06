package Q1;
import java.util.*;

public class prod72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the first time? ");
        int t1 = input.nextInt();
        int x = 24;
        System.out.println("What is the second time? ");
        int t2 = input.nextInt();

        if (t2 > t1){
            t2 -= t1;
        }

    }
}
