package Q2.prog215i;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog215i {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/prog215i.dat"));
            System.out.println("Vehicle  Miles Gallons  MPG");
            while (input.hasNext()){
                int vehicle = input.nextInt();
                double miles = input.nextDouble();
                double gallons = input.nextDouble();
                double mpg = 0.0;
                Cl215i wow = new Cl215i(vehicle, miles, gallons);
                wow.calc();
                System.out.println(wow);



            }


        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}