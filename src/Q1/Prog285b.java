package Q1;

import Q1.Prog285bcl.salesperson;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Prog285b {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/Prog285b.dat"));
            System.out.println("Id\tCode\tSales\tCommission");
            while (input.hasNext()){
                int id = input.nextInt();
                int c = input.nextInt();
                double s = input.nextDouble();

                salesperson fred = new salesperson(id, c ,s );
                fred.setComm();
                System.out.println(fred.toString());
            }
        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}
