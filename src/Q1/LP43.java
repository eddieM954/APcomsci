package Q1;
import java.util.*;

public class LP43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of eggs: ");
        int eggs = input.nextInt();
        double dozen = eggs / 12;
        double trdozen = .5;
        double sixdozen = .45;
        double eledozen = .4;
        double modozen = .35;
        if (dozen < 4){
            System.out.println("The bill is equal to $" + (dozen* trdozen));
        }
        if (dozen > 4 && dozen < 6) {
            System.out.println("The bill is equal to $" + (dozen * sixdozen));
        }
        if (dozen > 6 && dozen < 11){
            System.out.println("The bill is eqaul to $" + dozen * eledozen);
        }


    }
}
