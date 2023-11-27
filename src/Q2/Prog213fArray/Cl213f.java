package Q2.Prog213fArray;

public class Cl213f {
    private double myCost;
    private double myHours;
    private double myCents;

    public Cl213f(int hours){
        myCost = 0;
        myHours = hours;
        myCents = 0;
    }
    public void calc(){
        if (myHours < 0) System.out.println("Error");
        else if (myHours < 2001 && myHours > 0) myCents = .07 ;
        else if (myHours > 1999 && myHours < 8001) myCents = .05;
        else if (myHours > 7999) myCents = .04;
        myCost = myCents *= myHours;
    }
    public String toString(){
        return String.format("The cost of %.2f\tis %.2f  ", myHours,myCost);
    }

}
