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

            for(int lcv = 0; lcv < mat.length; lcv++){
                for(int i = 0; i < mat[0].length; i++){
                    mat[lcv][i]= input.nextInt();
                        sat[lcv][i] = input.nextInt();
                            rat[lcv][i] =input.nextInt();
                }
            }
            for(int lcv = 0; lcv < mat.length; lcv++){
                for( int i = 0; i < mat[0].length; i++){

                }
            }








        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}
//int[][]mat = new int[5][6];
//            int[][]sat = new int[5][6];
//            int[][]rat = new int[5][6];
//            int cnt = 10;
//
//
//            for(int lcv = 0; lcv < mat.length; lcv++)
//                for(int i = 0; i < mat[lcv].length; i++)
//                    mat[lcv][i] = input.nextInt();
//
//
//            for (int[] row : mat) {
//                for (int n : row)
//                    System.out.print(n + "\t");
//                System.out.println();
//            }
//            for(int lcv =1; lcv < cnt; lcv++){
//                for(int i = 1; i < cnt; lcv++){
//                   if (mat[lcv][i] != 0 ){
//                       System.out.println(lcv + " " + i + " " + mat[lcv][i]);
//
//                   }
//                }
//                System.out.println();
//            }
//            System.out.println();
//
//
//
//            for(int lcv = 0; lcv < sat.length; lcv++)
//                for(int i = 0; i < sat[lcv].length; i++)
//                    sat[lcv][i] = input.nextInt();
//
//            for (int[] row : sat) {
//                for (int n : row)
//                    System.out.print(n + "\t");
//                System.out.println();
//            }
//
//
//            for(int lcv =1; lcv < cnt; lcv++){
//                for(int i = 1; i < cnt; lcv++){
//                    if (sat[lcv][i] != 0 ){
//                        System.out.println(lcv + " " + i + " " + sat[lcv][i]);
//
//                    }
//                }
//                System.out.println();
//            }
//
//
//
//            for(int lcv = 0; lcv < rat.length; lcv++)
//                for(int i = 0; i < rat[lcv].length; i++)
//                    rat[lcv][i] = input.nextInt();
//
//
//            for (int[] row : rat) {
//                for (int n : row)
//                    System.out.print(n + "\t");
//                System.out.println();
//            }
//
//            for(int lcv =1; lcv < cnt; lcv++){
//                for(int i = 1; i < cnt; lcv++){
//                    if (rat[lcv][i] != 0 ){
//                        System.out.println(lcv + " " + i + " " + rat[lcv][i]);
//
//                    }
//                }
//                System.out.println();
//            }