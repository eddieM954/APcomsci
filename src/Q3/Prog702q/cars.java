package Q3.Prog702q;

public class cars extends vehicle{
    private int carValue;

    public cars(String name, int tires, int value){
        super(name,tires);
        carValue = value;
    }
    public int getValue(){return carValue;}
}
