package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog477a {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/Prog477a.dat"));
            int gender = input.nextInt();
            int grade = input.nextInt();
            int[][]mat = new int[6][4];
            for(int lcv =0; lcv < mat.length-1; lcv++){
                for(int i = 0; lcv < mat[lcv].length-1; i++){

                }
            }


        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}
