package Q2.prog214c;

public class Cl214c {
    private String myType;
    private double myGallon;
    private String myCarwash;
    private double myGas;
    private double mycar;
    private double total;
    private double firsttot;


    public Cl214c(String type, double gallon, String carwash){
        myType = type;
        myGallon = gallon;
        myCarwash = carwash;
        myGas = 0.0;
        mycar = 0;
        total = 0;
        firsttot = 0.0;


    }
    public void calc(){
        if (myType.equals("R")) myGas = 1.359;
        else if (myType.equals("P"))myGas = 1.479;
        else if (myType.equals("H"))myGas = 1.429;
        if (myCarwash.equals("Y") && myGallon <= 10) mycar = 2.00;
        else if (myCarwash.equals("Y") && myGallon > 10 && myGallon < 20)mycar = (myGallon / 20) / 2.00;
        else if (myCarwash.equals("Y") && myGallon > 19) mycar = 0.0;
        firsttot = myGallon * myGas;
        total = myGallon * myGas + mycar;

    }
    public double getGallon(){return myGallon;}
    public double getGas(){return myGas;}
    public double getcar(){return mycar;}
    public double getTotal(){return total;}
    public double getfirstot(){return firsttot;}
}