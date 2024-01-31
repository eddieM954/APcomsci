package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog477a {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/Prog477a.dat"));
            int gender = input.nextInt();
            int grade = input.nextInt();
            int[][]score = new int[5][2];
            for(int lcv = 0; lcv < score.length; lcv++){
                for(int i = 0; i < score[0].length; i++){
                    if(gender == 1 && grade == 1 || gender == 2 && grade == 1){
                        score[lcv][i]++;
                    }
                }
            }


        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}
