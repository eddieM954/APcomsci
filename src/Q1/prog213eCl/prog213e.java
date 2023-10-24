package Q1.prog213eCl;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;


public class prog213e {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("Langdat/prog213e.txt"));

            while(input.hasNext()){
                int age = input.nextInt();
                Cl213e wowza = new Cl213e(age);
                wowza.calc();
                int myagetwenty = wowza.getMyagetwenty();
                System.out.println(myagetwenty);

            }
        }catch (IOException e){
            System.out.print("");
        }
    }
}
