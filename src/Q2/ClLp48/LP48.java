package Q2.ClLp48;
import java.util.*;

public class LP48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the value of A: ");
        int a = input.nextInt();
        System.out.print("What is the value of C: ");
        int c = input.nextInt();
        System.out.print("What is the value of M: ");
        int m = input.nextInt();
        System.out.print("What is the value of X0: ");
        int x0 = input.nextInt();
         ClLP48 wow = new ClLP48(a,c,m,x0);
         for (int lcv =0; lcv < 10; lcv++){
             System.out.println(wow);
         }
    }
}
