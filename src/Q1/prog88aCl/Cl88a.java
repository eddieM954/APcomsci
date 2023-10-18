package Q1.prog88aCl;

public class Cl88a {
    private int myNum1;
    private int myNum2;
    private int mySum;
    private int myDiff;
    private int myPro;
    private double myAverage;
    private int myAbs;
    private int myMax;
    private int myMin;

    public Cl88a(int num1, int num2){
        myNum1 = num1;
        myNum2 = num2;
        mySum = 0;
        myDiff = 0;
        myPro = 0;
        myAverage = 0;
        myAbs = 0;
        myMax = 0;
        myMin = 0;

    }
    public void calc(){
        mySum = myNum1 + myNum2;
        myPro = myNum1 * myNum2;

    }

}
