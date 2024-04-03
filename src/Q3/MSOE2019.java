package Q3;
import java.util.Scanner;
public class MSOE2019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 letters: ");
        String letters = input.nextLine();
        System.out.println("Enter a word: ");
        String line = input.nextLine();
        int cnt = 0;

        for(int lcv = 0; lcv < line.length();lcv++ ){
            String s = line.substring(lcv,lcv+2);

            if(s == letters){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
