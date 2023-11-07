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

    public Cl213e(int age){
        myAge = age;
        myDis = 0;
        myPercent = 1;
        myAgetwenty = 0;
        myAge20to39 = 0;
        myAge40to59 = 0;
        myAge60to79 = 0;
        myAge79nup = 0;



    }

    public void calc(){

        while (myAge < 20 ){ myAgetwenty += 1;}
        while (myAge > 19 && myAge <= 39 ) myAge20to39++ ;
        while (myAge > 39 && myAge <= 59) myAge40to59++ ;
        while (myAge > 59 && myAge <= 79) myAge60to79++;
        while (myAge > 79) myAge79nup++;
        myDis = myAgetwenty + myAge20to39 + myAge40to59 + myAge60to79 + myAge79nup;


    }
    public void setComm() {calc();}


    public int getMyage(){return myAge; }
    public int getMyagetwenty(){ return myAgetwenty;}
    public int getMyDis(){return myDis;}
    public int getMyAge20to39(){return myAge20to39;}
    public int getMyage40to59(){return myAge40to59;}
    public int getMyage60to79(){return myAge60to79;}



    public String toString(){
        return String.format("Age<20",myAgetwenty,myDis);
    }
}
