package Q3.prog702p;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class prog702p {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/Prog701g.dat"));
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
                }else if(num == 3){
                    String eword = input.next();
                    animal e = new beeper(name, word, eword);
                    list.add(e);
                }

            }
            double value = 0;
            double avgStep =0;
            double avgSize = 0;
            int cnt =0;
            int cnt2 = 0;
            int cnt3 = 0;
            String word = "";


            for (animal x : list){
                if (x instanceof hicca){
                    value += ((hicca)x).getMoney();
                    cnt ++;
                }
                if (x instanceof beeper){
                     word = ((beeper)x).getEWord();
                    cnt2++;
                }
                if (x instanceof wallie){
                    avgStep += ((wallie)x).getSteps();
                    cnt3++;
                }
            }
            System.out.println("The average value of the Hicca fur %.2f\n" + value / cnt);
            System.out.println("The average number of steps taken by the Wallies is %.2f\n" + avgStep / cnt3);
            System.out.println("The average size of the beepers word is " + word.length() / cnt2);




        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}