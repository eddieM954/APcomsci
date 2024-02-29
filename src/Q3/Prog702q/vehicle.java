package Q3.Prog702q;

public class vehicle {
    private String carName;
    private int carTires;
    private int carValue;


    public vehicle(String name, int tires){
        carName = name;
        carTires = tires;
        carValue = 0;
    }
    public String getName(){return carName;}
    public int getTires(){return carTires;}
    public int getValue(){return carValue;}
}
