package Q2;
import java.util.*;

public class MSOE1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = input.nextLine();
        for (int lcv = 0; lcv < str.length(); lcv ++){
            String s = str.substring(str.length()-1);


            if (s == str){
                System.out.println("That is a palindrome!!!");
            }else{
                System.out.println("That is not a palindrome.");
            }
        }

    }
}
