package Q1;

public class prog122h {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Number    Square   Square Root   Cube     4th Root");
        while (num < 20){
            num += 1;
            int sqr = (int)Math.pow(num, 2);
            double root = Math.sqrt(num);
            int cube = (int)Math.pow(num, 3);
            System.out.printf(num + "             %.4f\n",   sqr + "        " + root + "          "  +   cube );

        }
    }
}
