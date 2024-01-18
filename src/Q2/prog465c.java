package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog465c {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/Prog465c.txt"));
            int col = input.nextInt();
            int row = input.nextInt();
            int sum = 0;
            int[][]mat = new int[col][row];
            for(int r =0; r < mat.length; r++)
                for(int c = 0; c < mat[r].length; c++)
                    mat[r][c] = input.nextInt();

            for(int r = 0; r < mat.length; r++){
                for(int c = 0; c < mat[0].length; c++){
                    System.out.print(mat[r][c]+ " ");
                }
                System.out.println();
            }
            System.out.println();

            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat[i].length;j++){
                    if(i == 0 || i == mat.length - 1) {
                        sum += mat[i][j];
                    }else{
                        sum += mat[i][mat[i].length - 1 ] +mat[i][0];
                    }
                }

            }
            System.out.print("The total of the edges is"+ sum);


        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}
