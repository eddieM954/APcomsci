package Q1;


public class prod88a {
    public static void main(String[] args) {

        // Math.random()* * (max - min) + min
        int num1 = (int)(Math.random() * (13 - 1)) + 1;
        int num2 = (int)(Math.random() * (20 - 2)) + 1;
        // sum, difference, product, average, abs. value of difference, max, and min
        int sum = num1 + num2;
        int dif = num1 - num2;
        int absdif = Math.abs(dif);
        int max, min;
        int pro = num1 * num2;
        double average = (num1 + num2) / 2;



       // The code inside if will only run if the condition is true
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        // Check if max and num1 are the same value using
        if (max == num1) {
            min = num2;
        } else {
            min = num1;
        }


        System.out.println("Original numbers are " + num1 + " and " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + dif);
        System.out.println("Product: " +pro);
        System.out.println("Average = " + average);
        System.out.println("Absolute value: " + absdif);
        System.out.println("Maxium = " + max);
        System.out.println("Minimum = " + min);














    }
}
