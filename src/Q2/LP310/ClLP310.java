package Q2.LP310;

public class ClLP310 {
    private double myBurger;
    private double myFries;
    private double mySoda;
    private int myNum1;
    private int myNum2;
    private int myNum3;
    private double myTotal;
    private double myTax;
    private double myTotalTax;

    public ClLP310(int num1, int num2, int num3){
        myNum1 = num1;
        myNum2 = num2;
        myNum3 = num3;
        myBurger = 0.0;
        myFries = 0.0;
        mySoda = 0.0;
        myTotal = 0.0;
        myTax = 0.0;
        myTotalTax = 0.0;
    }

    public void calc(){
        myBurger = myNum1 * 1.69;
        myFries = myNum2 * 1.09;
        mySoda = myNum3 * .99;
        myTotal = myBurger + myFries + mySoda;
        myTax = myTotal * .065;
        myTotalTax = myTax + myTotal;
    }

    public String toString(){
        return String.format("Total before tax:  " +  myTotal + "Tax: ", myTax + "Total after tax:" + myTotalTax);
    }

}
