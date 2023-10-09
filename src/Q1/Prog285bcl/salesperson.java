package Q1.Prog285bcl;

public class salesperson {
    private int myId;
    private int myCode;
    private double mySales;
    private double myComm;
    private void calc(){
        if(myCode == 5 || myCode == 8){
            if (mySales<= 5000)
                myComm = getSales() * .075;
            else
                myComm = 5000 * .075 + (mySales - 5000 ) * .085;
        }else if(myCode == 17){
            if (mySales <= 3500)
                myComm = mySales * .095;
            else
                myComm = 3500 * .095 + (getSales() - 3500) * .12;
        }
    }

    public salesperson(int id, int code, double sales){
        myId = id;
        myCode = code;
        mySales = sales;
        myComm = 0;
    }

    public void setComm(){calc();}

    public int getId(){return myId;}
    public int getCode(){return myCode;}
    public double getComm(){return myComm;}
    public double getSales(){return mySales;}

    public String toString(){
        return myId + "\t" + myCode + "\t" + mySales + "\t" + myComm;

    }
}
