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
                Cl213e wowza = new Cl213e(age);
                wowza.calc();
                int myagetwenty = wowza.getMyagetwenty();
                int mydis = wowza.getMyDis();
                int myage20to39 = wowza.getMyAge20to39();
                System.out.println(age);

            }
        }catch (IOException e){
            System.out.print("");
        }
    }
}
