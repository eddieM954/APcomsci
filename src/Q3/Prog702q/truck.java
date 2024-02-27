package Q3.Prog702q;

public class truck extends vehicle{
    private int miles;

    public truck(String name, int tires, double value, int miles){
        super(name, tires, value);
    }

    public int getMiles(){return miles;}

}
