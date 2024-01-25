package Q3.prog702p;

public class wallie extends animal {
    private int mySteps;

    public wallie(String name, String word, int steps){
        super(name, word);
        mySteps = steps;
    }
    public int getSteps(){return mySteps;}
}
