package Q2.LP314;

public class ClLP314 {
    private int myAwNew;
    private int myAwJer;
    private int myAwConn;
    private int myMarNew;
    private int myMaryJer;
    private int myMarConn;
    private double myPercent;
    private double myPercent2;
    private int total1;
    private int total2;

    public ClLP314(int awnew, int awjer, int awconn, int marnew, int maryjer, int marconn){
        myAwNew = awnew;
        myAwJer = awjer;
        myAwConn = awconn;
        myMarNew = marnew;
        myMaryJer = maryjer;
        myMarConn = marconn;
        myPercent = 0;
        total1 = 0;
        total2 = 0;
        myPercent2 = 0;

    }
    public void calc(){
        total1 = myAwNew + myAwConn + myAwJer;
        total2 = myMarConn + myMarNew + myMaryJer;
        myPercent = total1 / (total1 + total2);
        myPercent2 = total2 / (total1 + total2);


    }
    public String toString(){
        return String.format("Canidate\tVotes  Percentage\n Awbrey" + total1 + "%.2f" + myPercent + "\nMartinez\t" + total2 + " %.2f" + myPercent2 + "\n Total Votes\t" + (total1 + total2)  );
    }
}
