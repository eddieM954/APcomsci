package Q2.prog215i;

public class Cl215i {
    private int myVehicle;
    private double myMiles;
    private double myGallons;
    private double myMPG;


    public Cl215i(int vehicle, double miles, double gallons){
        myVehicle = vehicle;
        myMiles = miles;
        myGallons = gallons;
        myMPG = 0.0;
    }
    public void calc(){
        myMPG = myMiles / myGallons;
    }
    public String toString(){
        return String.format("%d\t%.2f\t%.2f\t%.1f",myVehicle,myMiles,myGallons,myMPG);
    }
}
