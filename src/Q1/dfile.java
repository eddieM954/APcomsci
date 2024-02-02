package Q1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class dfile {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/Prog285b.dat"));

            while (input.hasNext()){

            }
        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}

