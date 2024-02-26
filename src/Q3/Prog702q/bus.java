package Q3.Prog702q;

public class bus extends vehicle{
    private String busCity;

    public bus(String name, int tires, double value, String city){
        super(name, tires, value);
        busCity = city;
    }
}
