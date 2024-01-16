package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog465a {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/prog465a.dat"));

            int[][]mat = new int[5][5];
            int[][]rat = new int[5][5];
            int[][]p = new int[5][5];
            for(int r = 0; r < mat.length-1; r++)
                for(int c =0; c < mat[r].length-1; c++)
                    mat[r][c] = input.nextInt();
            for (int r =0;r< mat.length-1; r++){
                for (int c = 0; c < mat[0].length-1;c++ ){
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }
            System.out.println();





            for(int d = 0; d < rat.length-1; d++)
                for (int e = 0; e < rat[d].length-1;e++)
                    rat[d][e]=input.nextInt();
            for(int d =0; d < rat.length-1; d++){
                for (int e = 0; e < rat[0].length-1; e++){
                    System.out.print(rat[d][e]+ " ");
                }
                System.out.println();
            }
            //Highest number matrix
            System.out.println();
            for (int lcv =0;lcv < mat.length-1; lcv++){
                for (int i = 0; i < rat.length-1; i++){
                    if (rat[lcv][i] > mat[lcv][i]){
                        p[lcv][i] = rat[lcv][i];
                    }else{
                        p[lcv][i] = mat[lcv][i];
                    }
                    System.out.print(p[lcv][i]+ " ");
                }
            }

        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}