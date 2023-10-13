package Q1;

import java.util.*;
public class prod122i {
    public static void main(String[] args) {
        int num = -26;
        System.out.println("Number\t\tCube Root\t\t Cube");
        while (num < 25){
            num += 1;
            int num2 = Math.abs(num);
            double root = Math.pow(num2, .33) - Math.pow(num2, .33) -Math.pow(num2, .33);
            int cube = (int)Math.pow(num, 3);
            System.out.println(num + "\t\t"+String.format("%.5f" , root)  + "\t\t" + cube);
        }
    }
}
