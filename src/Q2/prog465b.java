package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog465b {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/Prog465b.dat"));

            int mat[][] = new int[4][5];
            int rat[][] = new int[4][3];
            for(int r =0; r < mat.length-1; r ++)
                for (int c = 0; c < mat[r].length-1; c++)
                    mat[r][c] = input.nextInt();
            for(int r =0; r < mat.length-1; r++){
                for (int c = 0; c < mat[0].length-1; c++){
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }
            System.out.println();

            for(int lcv =0; lcv < mat.length-1;lcv++){
                for (int i = 0; i < mat.length-1;i++){
                    if(mat[lcv][i] < 100){

                    }

                }
            }
            for(int d =0; d < mat.length;d++){
                int[]row = mat[d];
                for(int p =0; p < row.length;p++){
                    System.out.println(d + " " + p);
                }
            }












        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}
