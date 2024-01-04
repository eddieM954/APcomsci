package Q2.prog215i;

public class Cl215i {
    private int myVehicle;
    private double myMiles;
    private double myGallons;
    private double myMPG;
    private double myMax;
    private double myMin;


    public Cl215i(int vehicle, double miles, double gallons){
        myVehicle = vehicle;
        myMiles = miles;
        myGallons = gallons;
        myMPG = 0.0;
        myMax = 0.0;
        myMin = 0.0;
    }
    public void calc(){
        myMPG = myMiles / myGallons;
        myMax = Math.max(myMin, myMPG);
    }
    public String toString(){
        return String.format("%d\t%.2f\t%.2f\t%.1f",myVehicle,myMiles,myGallons,myMPG);
    }
}
