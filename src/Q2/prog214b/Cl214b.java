package Q2.prog214b;
public class Cl214b {
    private int myEmnum;
    private double myY2D;
    private double myRate;
    private double myShift;
    private double myHours;
    private double myGross;
    private double myWith;
    private double myFica;
    private double myNet;
    private double myTax;
    private double myTax2;

    public Cl214b(int emnum, double year, double rate, double shift,double hours){
        myEmnum = emnum;
        myY2D = year;
        myRate = rate;
        myShift = shift;
        myHours = hours;
        myGross = 0;//
        myWith = 0;//
        myFica = 0;
        myNet = 0;
        myTax = 0;//
        myTax2 = 0;
    }
    public void calc(){
        myGross = myHours * (myRate * myShift);
        if (myGross < 100) myTax = 0;
        else if (myGross > 100 && myGross < 150) myTax = .08;
        else if (myGross > 150 && myGross < 200) myTax = .12;
        else if (myGross > 200 && myGross < 300) myTax = .15;
        else if (myGross >= 300) myTax = .175;
        myWith = myTax *= myGross;
        if (myY2D > 17500) myTax2 = 0;
        else if (myY2D + myGross <= 17500) myTax2 = .0605;
        if (myY2D < 17300 && (myY2D + myGross) > 17300) myFica = ((myY2D + myGross)/ 17300)/ .0605;
        myFica = myGross * myTax2;
        myNet = myGross -( myFica + myWith);
    }
    public String toString(){
        return String.format("Employee Number: " + myEmnum + "\nHours: " + myHours + "\tRate: " + myRate + "\t Shift Factor: " + myShift + "\n\tCurrent Year to Date: " + myY2D + "\nGross Pay: " + myGross + "\t\nWithholding:%.2f" , myWith ,"\nFica: " , myFica , "\nNet Pay: %.2f" , myNet);

    }
}