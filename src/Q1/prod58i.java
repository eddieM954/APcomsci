package Q1;
import java.util.*;
public class prod58i {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount I wish to borrow is $");
        double p = input.nextDouble();  // principal

        System.out.print("The loan rate is ");
        double r = input.nextDouble();  //rate

        System.out.print("the # of months to pay off the loan is ");
        double m = input.nextDouble();   //months

        double r_over_1200 = r/1200;
        double mp = p * (r_over_1200 * (Math.pow((1+r_over_1200), m) / (Math.pow( (1+r_over_1200), m) -1)));

        System.out.printf("My monthly payments will be $%.2f\n", mp);
        System.out.printf("The total interest paid is $%.2f\n" , mp * m);
        System.out.printf("The total amount paid is $%.2f\n, ", ((mp * m) + p));
    }
}
