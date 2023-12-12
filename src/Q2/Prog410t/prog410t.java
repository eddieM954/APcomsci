package Q2.Prog410t;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog410t {
    public static void main(String[] args) {
        try{
            Scanner red = new Scanner(new File("Langdat/survey2.dat"));
            Scanner input = new Scanner(new File("Langdat/survey.dat"));
            int[] array = new int[100];
            int[] array2 = new int[100];

            while (input.hasNext()){
                int id = input.nextInt();
                double income= input.nextInt();
                int members = input.nextInt();
                Cl410t wow = new Cl410t(id, income, members);
                System.out.println(wow);





            }

            while (red.hasNext()){
                int id = red.nextInt();
                double income = red.nextInt();
                int members = red.nextInt();
                Cl410t wowza = new Cl410t(id,income, members);
                System.out.println(wowza);
            }
        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}

//for (int lcv = 0; lcv < array.length; lcv++){
//                    if (income > 12707.4){
//                        array[lcv] = input.nextInt();
//
//                    }else if (income < 12707.4){
//                        array2[lcv] =  input.nextInt();
//
//                    }
//
//                }