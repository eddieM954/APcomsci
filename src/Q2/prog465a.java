package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog465a {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/Prog285b.dat"));

            int[][]mat = new int[5][5];
            int[][]rat = new int[5][5];
            for(int r = 0; r < mat.length-1; r++)
                for(int c =0; c < mat[r].length-1; c++)
                    mat[5][5] = input.nextInt();
            for (int r =0;r< mat.length-1; r++)




            for(int d = 0; d < rat.length-1; d++)
                for (int e = 0; e < rat[d].length-1;e++)
                    rat[5][5]=input.nextInt();

        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}