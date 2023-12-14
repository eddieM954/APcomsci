package Q2.prog215h;

public class Cl215h {
    private double myScore;
    private double myAverage;

    public Cl215h(double score, double average){
        myScore = score;
        myAverage = average;
    }

    public String toString(){
        return String.format("%.1f\n", myScore);
    }
    public double getScore(){return myScore;}
    public double getAverage(){return myAverage;}

}
