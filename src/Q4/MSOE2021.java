package Q4;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class MSOE2021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        String line = sentence + input.nextLine();
        String[] s = line.split(" ");

        boolean tru = false;
        for(String word : line){
            if (word.substring(word.length()-1,word.length()).equals(letter)){
                System.out.print(word);
                tru = true;
            }

        }




    }
}
