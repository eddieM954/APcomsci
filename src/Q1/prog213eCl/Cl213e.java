package Q1.prog213eCl;

public class Cl213e {
    private int myAge;
    private int myAgetwenty;
    private int myAge20to39;
    private int myAge40to59;
    private int myAge60to79;
    private int myAge79nup;
    private int myDis;
    private double myPercent;

    public Cl213e(int dis){
        myAge = 0;
        myDis = 0;
        myPercent = 0;
        myAgetwenty = 0;
        myAge20to39 = 0;
        myAge40to59 = 0;
        myAge60to79 = 0;
        myAge79nup = 0;


    }

    public void calc(){
        if (myAge < 20 ) myAgetwenty += 1;
        if (myAge > 19 && myAge <= 39 ) myAge20to39 += 1;
        if (myAge > 39 && myAge <= 59) myAge40to59 += 1;
        if (myAge > 59 && myAge <= 79) myAge60to79 += 1;
        if (myAge > 79) myAge79nup += 1;
    }

}
