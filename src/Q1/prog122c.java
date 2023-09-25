package Q1;

public class prog122c {
    public static void main(String[] args){
        int num = 0;
        int num2 = 1;
        int num3 = 0;

        while (num < 10){

            num += 2;
            num2 += 2;
            num3  += 4;
            int num4 = (int)Math.pow(num,2 );
            System.out.println(num + "   "  + num2  + "    " + num3 + "    "  +   num4);
        }
    }
}
