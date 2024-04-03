import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog901a {
    public static void printFile(Scanner input){
        String text = "";
        while (input.hasNext()) {
            text += input.nextLine() + "";
        }
        reversestring(text);
    }

    public static reversestring(String e){
        String reverse = "";
        for(int lcv = 0; lcv < e.lenght()-1; lcv++){
            reverse += e.substring(lcv-1, lcv);
        }
        return(reverse);
    }


    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog512h.dat"));
            printFile(input);
            

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
    
}
