package Q1;

public class LP514 {
    public static void main(String[] args) {

        System.out.println("Dice 1 Dice 2 Total");
        for (int i = 0; i < 5; i++) {
            int num = (int) (Math.random() * (7 - 1)) + 1;
            int num2 = (int) (Math.random() * (7 - 1)) + 1;
            int total = num + num2;
            System.out.println("   " + num + "      " + num2 + "     " + total);

        }
    }
}