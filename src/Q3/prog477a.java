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
            int[][]male = new int[5][1];
            int num = 0;
            for(int lcv =0; lcv < male.length-1; lcv++){
                for(int i = 0; i < male[lcv].length-1; i++){
                    if (gender == 1 && grade == 1){
                        male[lcv][i] = num++;
                    }
                }
            }
            for(int r = 0; r < male.length; r++){
                for(int c = 0; c < male[0].length; c++){
                    System.out.print(male[r][c]+ " ");
                }
                System.out.println();
            }
            System.out.println();


        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}
