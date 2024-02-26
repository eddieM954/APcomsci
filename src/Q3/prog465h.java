import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class prod465h {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("prog465h.dat"));

            while (input.hasNext()){
                int row = input.nextInt();
                int col = input.nextInt();
                int[][]mat = new int[row][col];

                for(int lcv = 0; lcv < mat.length; lcv++)
                    for(int i = 0; i < mat[0].length; i++)
                        mat[lcv][i] = input.nextInt();

                for(int[] r: mat){
                    for(int num: r){
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }

                int cnt = 0;

                for(int lcv = 0; lcv < mat.length; lcv++){
                    for(int i = 0; i < mat[0].length; i++){
                        if(mat[lcv][i] != 0){
                            cnt++;
                        }
                    }
                }
                int num = 0;
                if(cnt * 3 < row * col){
                    int[][]add = new int [cnt][3];
                    for(int lcv = 0; lcv < add.length; lcv++){
                        for(int i = 0; i < add[0].length;i++){
                            if(mat[lcv][i] != 0){
                                add[num][0] = lcv+1;
                                add[num][1] = i+1;
                                add[num][2] = mat[lcv][i];
                                num++;
                            }
                        }
                    }
                    for(int[] i: add){
                        for(int p: i){
                            System.out.println(p + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("The original matrix is sparse");

                }else if(cnt * 3 == row * col){
                    int[][]add = new int [cnt][3];
                    for(int lcv = 0; lcv < add.length; lcv++){
                        for(int i = 0; i < add[0].length;i++){
                            if(mat[lcv][i] != 0){
                                add[num][0] = lcv+1;
                                add[num][1] = i+1;
                                add[num][2] = mat[lcv][i];
                                num++;
                            }
                        }
                    }
                    for(int[] i: add){
                        for(int p: i){
                            System.out.println(p + " ");
                        }
                    }
                    System.out.println("The original matrix and the sparse matrix are equally efficient");

                }else{
                    System.out.println("The orginal matrix is abundant");
                }

            }
        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}
