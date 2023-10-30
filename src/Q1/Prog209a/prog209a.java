package Q1.Prog209a;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog209a {
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(new File("langdat/prog215a.txt"));

            while(input.hasNext()){
                int num = input.nextInt();
                Cl209a wowza = new Cl209a(num);
                wowza.calc();
                int myGreatthen500 = wowza.getMyGreatthen500();
                int myLessthen500 = wowza.getMyLessthen500();
                int myTotal = wowza.getMyTotal();
                System.out.print(myLessthen500);
            }
        }   catch(IOException e){
            System.out.print("This does not work");
        }
    }
}
