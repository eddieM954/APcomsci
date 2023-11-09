package Q2.Lp39;

public class ClLP39{
    private int myYear1;
    private int myYear2;
    private int myMonth1;
    private int myMonth2;
    private int myDay1;
    private int myDay2;
    private int myDays;
    private int myHours;

    public ClLP39(int year1, int year2, int month1, int month2, int day1, int day2){
        myYear1 = year1;
        myYear2 = year2;
        myMonth1 = month1;
        myMonth2 = month2;
        myDay1 = day1;
        myDay2 = day2;
        myDays = 0;
        myHours = 0;

    }

    public void calc(){
        myDays = ((myYear2 - myYear1) * 365) + ((myMonth2 - myMonth1) * 30) + ((myDay2 - myDay1));
        myHours = ((myDays / 3)* 24);
    }
    public String toString(){
        return String.format("You have been alive for " + myDays + " days" + "\t" + "You have slept for " + myHours + " hours.");
    }

}
