package Q2.prog214c;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class prog214c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/prog214c.dat"));
            ArrayList<Cl214c> list = new ArrayList<Cl214c>();
            while (input.hasNext()) {
                String type = input.next();
                double gallon = input.nextDouble();
                String carwash = input.next();

                Cl214c wow = new Cl214c(type, gallon, carwash);
                list.add(wow);

                for (int lcv = 0; lcv < list.size(); lcv ++){
                    Cl214c me = list.get(lcv);
                    me.calc();
                }
                for (Cl214c me : list){
                    System.out.println(String.format("CompSci Petrol Company\n" + type + "\t\t" + me.getGallon() + "@ " + me.getGas() + "\nGasoline%.2f  " , me.getfirstot() , "\nWash" , carwash , "\n" , me.getcar() , "\nTotal due\n%.2f", me.getTotal() ));

                }

            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}