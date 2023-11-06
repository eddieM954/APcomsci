package Q2.Prog213fArray;

public class Cl213f {
    private double myKwh;
    private double myCost;

    public Cl213f(double kwh){
        myKwh = kwh;
        myCost = 0;
    }
    public void calc(){
        if (myKwh < 2001){myCost *= .07;}
        else if (myKwh > 2000 && myKwh < 10001){myCost *= .05;}
        else if (myKwh > 10000){myCost *= .04;}
    }

    public String toString(){
        return String.format("The Cost of", myKwh);
    }

}
