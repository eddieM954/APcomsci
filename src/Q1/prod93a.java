package Q1;
import java.util.*;


public class prod93a {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("How many Kilowatts were used? ");
        int kilo = input.nextInt();

        System.out.println("Kilowatts used:     " + kilo);
        double rate = kilo * 0.0475;
        System.out.printf("Base Rate:   " + kilo + "@ $ 0.0475    $%.2f\n", rate );

        double sur = rate * .1;

        System.out.printf("SurCharge    $%.2f\n ", + sur);
        double city = rate * .03;

        System.out.printf("City Tax      $%.2f\n ", + city);
        double total = city + sur + rate;

        System.out.printf("Pay this amount   $%.2f\n ",  + total);

        double after = rate * .04;
        System.out.printf("After May 20th pay    $%.2f\n", + (after + total));



    }
}
