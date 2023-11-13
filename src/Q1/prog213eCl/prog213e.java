package Q1.prog213eCl;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;


public class prog213e {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/prog213e.dat"));

            while(input.hasNext()){
                int age = input.nextInt();
                Cl213e wow = new Cl213e(age);
                wow.calc();
                System.out.println(wow);



            }
        }catch (IOException e){
            System.out.print("");
        }
    }
}
