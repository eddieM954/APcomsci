package Q1.Prog93aCl;

public class prog93Cl {
    private int kwatts;
    private double baserate;
    private double surcharge;
    private double citytax;
    private double finaltotal;
    private double aftermay;

    public prog93Cl(int kw) {
        kwatts = kw;
        surcharge = 0;
        baserate = 0;
        citytax = 0;
        finaltotal = 0;
        aftermay = 0;
    }

    public void calc() {
        baserate = kwatts * 4.75;
        surcharge = baserate / 10;
        citytax = baserate * .03;
        finaltotal = baserate + surcharge + citytax;
        aftermay = finaltotal * .04 + finaltotal;

    }
    public String toString(){
        return kwatts + "\t" + surcharge + "\t" + baserate + "\t" + citytax + "\t" + finaltotal;
    }
}
