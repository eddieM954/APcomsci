package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class prog465h {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/Prog465h.dat"));

            int[][]mat = new int[5][6];
            int[][]sat = new int[5][6];
            int[][]rat = new int[5][6];
            int x = 0;

            for(int lcv = 0; lcv < mat.length; lcv++)
                for(int i = 0; i < mat[lcv].length; i++)
                    mat[lcv][i] = input.nextInt();

            for(int lcv = 0; lcv < mat.length; lcv++){
                for(int i = 0; i < mat[lcv].length;i++){
                    System.out.print(mat[lcv][i] + " ");
                    if(mat[lcv][i] > 0 || mat[lcv][i] < 0){
                        x++;
                    }
                    if (x < 10 ){
                        System.out.println("The Original Matrix is Sparse");
                    }else if (x == 10){
                        System.out.println("The Original Matrix and the Sparse Matrix are Equally Efficient");
                    }else{
                        System.out.println("The Original Matrix is Abundant");
                    }
                }
                System.out.println();
            }






            System.out.println();
            for(int lcv = 0; lcv < sat.length; lcv++)
                for(int i = 0; i < sat[lcv].length; i++)
                    sat[lcv][i] = input.nextInt();
            for(int lcv = 0; lcv < sat.length; lcv++){
                for(int i = 0; i < sat[lcv].length;i++){
                    System.out.print(sat[lcv][i] + " ");
                }
                System.out.println();
            }




            System.out.println();
            for(int lcv = 0; lcv < rat.length; lcv++)
                for(int i = 0; i < rat[lcv].length; i++)
                    rat[lcv][i] = input.nextInt();
            for(int lcv = 0; lcv < rat.length; lcv++){
                for(int i = 0; i < rat[lcv].length;i++){
                    System.out.print(rat[lcv][i] + " ");
                }
                System.out.println();
            }





        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}