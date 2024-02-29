package Q3.Prog702q;

public class bus extends vehicle{
    private String busCity;

    public bus(String name, int tires, String city){
        super(name, tires);
        busCity = city;
    }
    public String getCity(){return busCity;}
}
