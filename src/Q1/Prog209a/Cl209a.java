package Q1.Prog209a;


public class Cl209a {
    private int myLessthen500;
    private int myGreatthen500;
    private int myTotal;
    private int myNum;

    public Cl209a(int num){
        myNum = num;
        myGreatthen500 = 0;
        myLessthen500 = 0;
        myTotal = 0;
    }
    public void calc(){
        if (myNum >= 500){myGreatthen500 += 1;}
        else if (myNum < 500){myLessthen500 += 1;}
        myTotal = myGreatthen500 + myLessthen500;
    }
    public int getMyLessthen500(){return myLessthen500;}
    public int getMyGreatthen500(){return myGreatthen500;}
    public int getMyTotal(){return myTotal;}
    public int getMyNum(){return myNum;}
}
