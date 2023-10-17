package Q1.prog76aCl;

public class Cl76a {
    private int myNum;
    private int myNum2;
    private int myTotal;

    public Cl76a(int num){
        myNum = num;
        myNum2 = 0;
        myTotal = 0;

    }

    public void calc(){
        myNum2 = myNum * 9;
        myTotal = myNum2 * 12345679;
    }


    public int getnum2(){
        return myNum2;
    }
    public int gettotal(){
        return myTotal;
    }
}
