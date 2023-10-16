package Q1.Prog54cCL;

public class Cl54c {
    private int myRadius;
    private double myArea;
    private double myCircum;

    public Cl54c(int radius,double area, double circum){
        myRadius = radius;
        myArea = 0;
        myCircum = 0;
    }
    public void calc(){
        myArea = (int)Math.pow(myRadius, 2) * 3.14159;
        myCircum = 2 * 3.14159 * myRadius;
    }
    public double getarea(){
        return myArea;
    }
    public double getcircum(){
        return myCircum;
    }
}
