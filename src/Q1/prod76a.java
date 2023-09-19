package Q1;
import java.util.*;


public class prod76a {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number you do not like that is 1-9: ");
        int num1 = input.nextInt();

        System.out.println("       " + num1);
        System.out.println("     X 9");
        System.out.println("---------");
        int num2 = num1 * 9;
        System.out.println("      " + num2);
        int num3 = num2 * 12345679;
        System.out.println("---------");
        System.out.println(num3);

    }
}
