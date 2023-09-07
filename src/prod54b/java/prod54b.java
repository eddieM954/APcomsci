package prod54b.java;
import java.util.*;

public class prod54b {
    public static void main(String[] args){
        Scanner Keyboard = new Scanner(System.in);


       System.out.print("What is the first number?");
       int num1 = Keyboard.nextInt();

       System.out.print("What is the second number? ");
       int num2 = Keyboard.nextInt();
       System.out.print("What is the third number? ");
        int num3 = Keyboard.nextInt();
        System.out.print("What is the fourth number? ");
        int num4 = Keyboard.nextInt();
        int sum = num1 + num2 + num3 + num4;
        System.out.print("The sum of the four numbers is " + sum);






    }
}
