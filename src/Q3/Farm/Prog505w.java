package Q3.Farm;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Prog505w {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/prog505w.dat"));
            List<Animal> animals = new ArrayList<Animal>();

            int hay = input.nextInt();
            double hayCost = input.nextDouble();
            int corn = input.nextInt();
            double cornCost = input.nextDouble();

            int cowRows = input.nextInt();
            int cowPens = input.nextInt();

            for(int r = 0; r < cowRows; r++){
                for(int p = 0; p < cowPens; p++){
                    String name = input.next();
                    int weight = input.nextInt();
                    int milk = input.nextInt();
                    int hayEaten = input.nextInt();
                    int cornEaten = input.nextInt();
                    Cow wow = new Cow(name, weight, milk, hayEaten, cornEaten);
                    animals.add(wow);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            int horseRows = input.nextInt();
            int horsePens = input.nextInt();
            for(int r = 0; r < horseRows; r++){
                for(int p=0; p < horsePens; p++){
                    String name = input.next();
                    int weight = input.nextInt();
                    int hayEaten = input.nextInt();
                    int cornEaten = input.nextInt();
                    int rides = input.nextInt();
                    double rideCost = input.nextDouble();
                    Horse fred = new Horse(name, weight, hayEaten, cornEaten, rides, rideCost);
                    animals.add(fred);
                    hay-= hayEaten;
                    corn-=cornEaten;
                }
            }

            // TODO: report income of the day, cumulative weight of all animals,
            // TODO: if there is enough food, cow that makes the most money
            //Income of the day
            double money = 0;










            //Weight





            // if there is enough food




            //which cow makes most money
            double maxCowValue = Double.MAX_VALUE;
            int maxCowIndex =0;






            double minHorseValue = Double.MAX_VALUE;
            int minHorseIndex = 0;
            for(int lcv = 0; lcv < animals.size(); lcv ++){
                if(animals.get(lcv) instanceof Horse){
                    Horse horse = (Horse)animals.get(lcv);

                    if(horse.value(cornCost, hayCost) < minHorseValue){
                        minHorseValue = horse.value(cornCost, hayCost);
                        minHorseIndex = lcv;
                    }
                }
            }
            System.out.printf("Horse %s makes the least money\n", animals.get(minHorseIndex).getName());

        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}
