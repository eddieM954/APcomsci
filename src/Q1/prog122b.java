package Q1;


public class prog122b {
    public static void main(String[] args){
        int hour = 0;
        System.out.println("Hours  Pay");
        while (hour<40){
            hour +=1;
            int pay = hour * 4;
            System.out.println(hour + "     " + pay);
        }
    }
}
