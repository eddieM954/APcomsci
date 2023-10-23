package Q1;
import java.util.*;

public class prod72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the first time? ");
        int first = input.nextInt();
        System.out.print("What is the second time? ");
        int second = input.nextInt();
        int time = 0;
        if (second > first){
            time = second - first;
        }else{
            time = (2400 - first) + second;

        }
        System.out.print(time);
    }
}
