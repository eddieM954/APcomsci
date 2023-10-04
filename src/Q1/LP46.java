package Q1;

public class LP46 {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * (10 - 1)) + 1;
        int num2 = (int) (Math.random() * (10 - 1)) + 1;
        int max, min;

        if (num1 > num2){
            max = num1;
        } else {
            max = num2;
        }
        if (max == num1) {
            min = num2;
        } else {
            min = num1;
        }

        System.out.println(num1);
        System.out.println(num2);



    }
}

