package Q2.prog214b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog214b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/214b"));

            while (input.hasNext()) {
                int emnum = input.nextInt();
                double year = input.nextDouble();
                double rate = input.nextDouble();
                double shift = input.nextDouble();
                double hours = input.nextDouble();
                Cl214b wow = new Cl214b(emnum, year, rate, shift, hours);
                wow.calc();
                System.out.println(wow);


            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}