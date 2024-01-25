package Q3.prog702p;

public class beeper extends animal{
    private String extraWord;

    public beeper(String name, String word, String eword){
        super(name, word);
        extraWord = eword;
    }
    public String getEWord(){return extraWord;}
}
