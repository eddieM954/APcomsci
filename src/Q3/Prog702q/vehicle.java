package Q3.Prog702q;

public class vehicle {
    private String carName;
    private int carTires;
    private double carValue;


    public vehicle(String name, int tires, double value){
        carName = name;
        carTires = tires;
        carValue = value;
    }
    public String getName(){return carName;}
    public int getTires(){return carTires;}
    public double getValue(){return carValue;}
}
