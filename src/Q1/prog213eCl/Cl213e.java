package Q1.prog213eCl;

public class Cl213e {
    private int myAge;
    private int myDis;
    private double myPer;


    public Cl213e(int age){
        myAge = age;
        myDis = 0;
        myPer = 0.0;
    }
    public void calc(){
        if (myAge < 20 ) myDis++;
        else if (myAge >= 20 && myAge < 40) myDis ++;
        else if (myAge > 39 && myAge < 60) myDis ++;
        else if (myAge > 60 && myAge < 80) myDis++;
        else if (myAge > 79) myDis++;
    }
    public int getMyAge(){return myAge;}
    public int getMyDis(){return myDis;}
    public double getMyPer(){return myPer;}

    public String toString(){
        return String.format("" + myDis);
    }

}

