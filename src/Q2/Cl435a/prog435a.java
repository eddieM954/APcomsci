package Q2.Cl435a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog435a {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/prog435a.dat"));
            System.out.println("Car Type\tBase Toll\tFactor\tCost");
            while (input.hasNext()){
                int vehicle = input.nextInt();
                int gate = input.nextInt();
                Cl435a wow = new Cl435a(vehicle, gate);
                wow.calc();
                System.out.println(wow);

            }
        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}