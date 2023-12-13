package Q2.prog215h;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class prog215h {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/prog215h.txt"));
            ArrayList<Cl215h> list = new ArrayList<Cl215h>();

            while (input.hasNext()){
                double score = input.nextDouble();
                double average = 0.0;
                Cl215h wow = new Cl215h(score, average);
                list.add(wow);

                for (int lcv = 0; lcv < list.size(); lcv ++){
                    Cl215h me = list.get(lcv);
                }
                for (Cl215h me : list){
                    System.out.printf("%f", me.getScore());
                }

            }
        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}