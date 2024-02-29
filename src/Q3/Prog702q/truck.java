package Q3.Prog702q;

public class truck extends vehicle{
    private int miles;

    public truck(String name, int tires, int miles){
        super(name, tires);
        miles = miles;
    }

    public int getMiles(){return miles;}

}
