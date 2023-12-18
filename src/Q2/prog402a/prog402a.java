package Q2.prog402a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog402a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("langdat/prg402a.dat"));
            int [] list = new int[300];
            System.out.println("Id Score Diff");
            while (input.hasNext()) {
                int id = input.nextInt();
                int score = input.nextInt();

                System.out.println(id + "\t" + score +" "+ (score - 242));

                for (int lcv = 0; lcv < list.length; lcv ++){
                    list[lcv] = score;



                }

            }
            double average = 0;
            for (int x : list)
                average += x;
            average /= list.length;
            System.out.print("The average is " + average);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}