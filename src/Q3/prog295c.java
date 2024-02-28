package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;


public class prog295c {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/merge1.dat"));
            Scanner input2 = new Scanner(new File("langdat/merge2.dat"));
            Scanner input3 = new Scanner(new File("langdat/merge3.dat"));
            Scanner input4 = new Scanner(new File("langdat/merge4.dat"));
            ArrayList<prog295c>list = new ArrayList<prog295c>();


           //while (input.hasNext()){
           //    String tea = input.nextLine();
           //    System.out.println(tea);
           //}
            while (input2.hasNext()){
                String bea = input.nextLine();
                System.out.println(bea);
            }

        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}
