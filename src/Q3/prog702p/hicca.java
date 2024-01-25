package Q3.prog702p;

public class hicca extends animal {
    private double myMoney;

    public hicca(String name, String word, double money){
        super(name, word);
        myMoney = money;
    }
    public double getMoney(){return myMoney;}
}
