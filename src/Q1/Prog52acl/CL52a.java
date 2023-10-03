package Q1.Prog52acl;

public class CL52a {  // rectangle (Helper Class)
    private int myLen;
    private int myWid;
    private int myArea;
    private int myPerim;

    // input section (constructor
    public CL52a(int len, int wid){
        // set  up private data
        myLen = len;
        myWid = wid;
        myArea = 0;
        myPerim=0;
    }

    // calculation section ( Mutators/ setters)
    public void calc(){
        myArea= myLen * myWid;
        myPerim= 2 * myLen + 2 * myWid;
    }
    //output section ( Accessors/ Getters
    public int getArea(){
        return myArea;
    }
    public int getPerim(){
        return myPerim;
    }
}
