package Q3.prog701g;



import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Prog701g {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("langdat/Prog701g.dat"));
            List<Person> list = new ArrayList<Person>();
        }catch(IOException e){
            System.out.println("Cant find data file");

        }
    }
}
