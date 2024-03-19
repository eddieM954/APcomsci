public class prog152a{
    public static int sum(int num){
        if(num == 9669){
            return num;
        }
        return sum (num + 3) + num;
    }
    public static void main(String[] args) {
        System.out.println("The sum of multiples of 3 to 9669 is " + sum(3));
    }
}
