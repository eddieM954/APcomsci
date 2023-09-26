package Q1;


public class prog122d {
    public static void main(String[] args) {
        int num = -13;
        System.out.println("X      Y");
        while (num < 16){
            num += 1;
            int y = (int)Math.pow(num, 6) - (3 *((int)Math.pow(num, 5))) - (93 *((int)Math.pow(num, 4))) +  (87 * (int)(Math.pow(num, 3))) + (1596 *(int)Math.pow(num,2 )) - (1380 * num) - 2800;

            System.out.println(num + "   " +  y);

        }


        //System.out.println(y);
    }
}
//        int y = (int)Math.pow(num, 6) - (3 *((int)Math.pow(num, 5)))  -(-93 *((int)Math.pow(num, 4))) +  (87 * (int)(Math.pow(num, 3))) + (1596 *(int)Math.pow(num,2 )) - (1380 * num) - 2800;
