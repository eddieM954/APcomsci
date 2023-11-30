package Q2.Cl435a;

public class Cl435a {
    private int myVehicle;
    private int myGate;
    private double myToll;
    private double myCost;
    private int myType;

    String car = "";

    public Cl435a(int vehicle, int gate){
        myVehicle = vehicle;
        myGate = gate;
        myToll = 0.0;
        myCost = 0.0;
        myType = 0;


    }
    public void calc(){
        if (myVehicle == 1) car = "Compact Car";
        else if (myVehicle == 2) car = "Small Car";
        else if (myVehicle == 3) car = "Mid Size Car";
        else if (myVehicle == 4) car = "Full Size Car";
        else if (myVehicle == 5) car = "Truck" ;
        else if (myVehicle ==6) car = "16 Wheeler";

        if (myVehicle == 1) myType = 1;
        else if (myVehicle == 2) myType = 2;
        else if (myVehicle == 3) myType = 3;
        else if (myVehicle == 4) myType = 4;
        else if (myVehicle == 5) myType = 5 ;
        else if (myVehicle ==6) myType = 6;

        if (myGate == 1) myToll = 1.35;
        else if (myGate ==2 )myToll = 2.00;
        else if (myGate == 3)myToll = 2.50;
        else if (myGate == 4)myToll = 3.25;
        else if (myGate == 5)myToll = 4.10;
        else if (myGate == 6)myToll = 4.80;
        else if (myGate == 7)myToll = 5.50;
        else if (myGate == 8)myToll = 6.00;

        myCost = myToll * myCost;



    }
    public String toString(){
        return String.format("Car Type\tBase Toll\tFactor\tCost\n" + car + "\t$" + myToll +"\t"+ myType + "\t" + myCost  );
    }
}
