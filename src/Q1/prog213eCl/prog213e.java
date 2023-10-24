package Q1.prog213eCl;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;


public class prog213e {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("prog213e.txt"));

            while(input.hasNext()){
                int myAge = input.nextInt();
                Cl213e wowza = new Cl213e(myAge);
                wowza.calc();
                System.out.print(wowza);
            }
        }catch (IOException e){
            System.out.print("");
        }
    }
}
