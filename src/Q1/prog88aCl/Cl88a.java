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
        if (myNum1 > myNum2) {
            myMax = myNum1;
        } else {
            myMax = myNum2;
        }
        if (myMax == myNum1) {
            myMin = myNum2;
        } else {
            myMin = myNum1;
        }

        myDiff = myMax - myMin;
        myAbs = Math.abs(myDiff);
        myAverage = (myNum1 + myNum2)/ 2;

    }
    public int getsum(){
        return mySum;
    }
    public int getpro(){
        return myPro;
    }
    public int getdiff(){
        return myDiff;
    }
    public double getaverage(){
        return myAverage;
    }
    public int getmax(){
        return myMax;
    }
    public int getmin(){
        return myMin;
    }
    public int getabs(){
        return myAbs;
    }

}
