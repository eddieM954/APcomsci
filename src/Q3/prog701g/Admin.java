package Q3.prog701g;
//Admin is a child of the parnet class "Person"
public class Admin extends Person {
    private String myFavw;
    // Inherited myFirst and myLast from Person

    public Admin(String fn, String ln, String fav){
        super(fn, ln); // Call constructor of the super/parent class
        myFavw = fav;
    }
    public String getFavw(){return myFavw;}



}
