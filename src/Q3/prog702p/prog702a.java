package Q3.prog702p;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class prog702a {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/Prog702a.dat"));
            List<animal>list = new ArrayList<animal>();

            int num = input.nextInt();
            while (num != 99){
                String name = input.next();
                String word = input.next();

                if (num == 1){
                    double money = input.nextDouble();
                    animal e = new hicca(name, word, money);
                    list.add(e);
                }else if(num == 2){
                    int steps = input.nextInt();
                    animal e = new wallie(name, word, steps);
                    list.add(e);
                }else if(num == 2){
                    String eword = input.next();
                    animal e = new beeper(name, word, eword);
                    list.add(e);
                }

            }
            double value = 0;
            double avgStep =0;
            double avgSize = 0;

            for (animal x : list){
                if (x instanceof hicca){
                   // value += ((animal)x).getMoney();
                }
            }





        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}