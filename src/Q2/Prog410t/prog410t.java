package Q2.Prog410t;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog410t {
    public static void main(String[] args) {
        try{
            Scanner red = new Scanner(new File("Langdat/survey2.dat"));
            Scanner input = new Scanner(new File("Langdat/survey.dat"));
            int[] array = new int[1000];
            int[] array2 = new int[1000];
            System.out.println("Id\t");
            while (input.hasNext()){
                int id = input.nextInt();
                int income= input.nextInt();
                int members = input.nextInt();
                Cl410t wow = new Cl410t(id, income, members);
                for (int lcv = 0; lcv < array.length; lcv++){
                    if (income > 12707.4){
                        array[lcv] = input.nextInt();
                        //System.out.println(array[lcv]);




                    }else{
                        if (income < 12707.4){
                            array2[lcv] = input.nextInt();
                            System.out.println(array2[lcv]);
                        }
                    }

                }



            }

            while (red.hasNext()){
                int id = red.nextInt();
                int income = red.nextInt();
                int members = red.nextInt();
                Cl410t wowza = new Cl410t(id,income, members);
                for (int lcv = 0; lcv < array.length; lcv++){
                    if (income > 12707.4){
                        array[lcv] = red.nextInt();
                        //System.out.println(array[lcv]);



                    }else{
                        if (income < 12707.4){
                            array2[lcv] = red.nextInt();
                            System.out.println(array2[lcv]);
                        }
                    }

                }
            }



        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}