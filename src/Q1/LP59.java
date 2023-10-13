package Q1;

public class LP59 {
    public static void main(String[] args) {
        int num = 0;
        System.out.print("x^1 x^2 x^3 x^4 x^5");
        System.out.println("");
        while (num < 6){
            num +=1;
            //System.out.println(num);
            int num2 = (int)Math.pow(num,2);
            int num3 = (int)Math.pow(num,3);
            int num4 = (int)Math.pow(num,4);
            int num5 = (int)Math.pow(num,5);

            System.out.println(num + "\t" + num2 + "\t" + num3 + "\t" + num4 + "\t" + num5);
        }

    }

}
