package Q1;
import java.util.*;
// Duplicate Characters
public class StrInt1 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();

            System.out.print("Duplicate Characters: ");

            for (int lcv = 0; lcv < str.length(); lcv++){
                for (int lcv2 = lcv +1; lcv < str.length(); lcv2++ ){
                    String let1 = str.substring(lcv, lcv+1);
                    String let2 = str.substring(lcv2, lcv2+1);

                    if (let1.equals(let2)){
                        System.out.print(let2 + " ");
                        break;  // break out of current (innermost)loop
                    }
                }
            }

    }
}
