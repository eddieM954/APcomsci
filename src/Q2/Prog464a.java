package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog464a {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/prog464a.dat"));

            int[][] mat = new int[5][6];
            for (int row = 0; row < mat.length; row++){
                for(int col = 0; col < mat[0].length-1; col++){
                    mat[row][col]= input.nextInt();
                    //read in 5x5 matrix
                }
            }
            //Find biggest number in each row
            //then set the last column to that number
            //for every single row
            for(int r = 0; r < mat.length; r++){
                int rowbig = Integer.MIN_VALUE;
                for(int c = 0; c < mat[0].length-1; c++){
                    if (mat[r][c] > rowbig)
                        rowbig = mat[r][c];
                }
                mat[r][5] = rowbig;
            }
            // print out the 2d array
            for(int[] row : mat){
                for ( int num : row){
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}