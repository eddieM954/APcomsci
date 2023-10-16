package Q1.Prog213b;
import java.io.IOException;
import java.util.*;
import java.io.File;

public class Prog213cl {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("Langdat/prog213b.txt"));

            while (input.hasNext()){
                int qnt = input.nextInt();
                Cl213b wowsa = new Cl213b(qnt);
                wowsa.calc();
                System.out.println(wowsa);
            }

        }catch(IOException e){
            System.out.println("Can't find data file");
        }
    }
}
