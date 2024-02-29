package Q3.Prog702q;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class prod702q {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/prog702q.txt"));
            List<vehicle>list = new ArrayList<vehicle>();

            int type = input.nextInt();
            while (type != 99){
                String name = input.next();
                int tires = input.nextInt();

                if (type == 1){
                    int value = input.nextInt();
                    vehicle p = new cars(name,tires, value);
                    list.add(p);
                }else if (type == 2){
                    int miles = 0;
                    vehicle p = new truck(name, tires, miles);
                    int num2 = miles /4;


                    list.add(p);
                }else if(type == 3){
                    String city = "";
                    vehicle p = new bus(name, tires, city);
                    list.add(p);
                }



            }
        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}