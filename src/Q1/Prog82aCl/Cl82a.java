package Q1.Prog82aCl;

public class Cl82a {
    private int myLimit;
    private int mySpeed;
    private int myFine;

    public Cl82a (int limit, int speed){
        myLimit = limit;
        mySpeed = speed;
        myFine = 0;
    }

    public void calc(){
        myFine = 20 + ((mySpeed - myLimit) * 5);
    }
    public int getfine(){
        return myFine;
    }

}
