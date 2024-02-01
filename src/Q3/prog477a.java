package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog477a {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/Prog477a.dat"));

            int[][]score = new int[6][3];
            for(int lcv = 0; lcv < score.length; lcv++){
                for(int i = 0; i < score[lcv].length; i++) {
                    int gender = input.nextInt();
                    int grade = input.nextInt();
                    if (gender == 1 && grade == 1) {
                        score[0][0]++;
                    } else if (gender == 2 && grade == 1) {
                        score[0][1]++;
                    }else if(gender == 1 && grade == 2) {
                        score[1][0]++;
                    }else if(gender == 2 && grade == 2) {
                        score[1][1]++;
                    }else if(gender == 1 && grade == 3){
                        score[2][0]++;
                    }else if(gender == 2 && grade == 3){
                        score[2][1]++;
                    }else if(gender == 1 && grade == 4){
                        score[3][0]++;
                    }else if(gender == 2 && grade == 4){
                        score[3][1]++;
                    }else if(gender == 1 && grade == 5){
                        score[4][0]++;
                    }else if(gender == 2 && grade == 5){
                        score[4][1]++;
                    }
                }



            }
            for (int row =0; row < score.length ; row++){
                for (int col =0; col < score[0].length; col++){
                    score[row][2] += score[row][col]; // sum of row

                }
            }
            for (int[]row : score){
                for (int n : row)
                    System.out.print(n + " ");
                System.out.println();
            }
            System.out.println();

        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}
// else if(gender == 1 && grade == 2){
//                        score[1][0]++;
//
//                    }