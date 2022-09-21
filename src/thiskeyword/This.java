package thiskeyword;

public class This {
    public float length;
    public float breadth;

    public This(){
        this(20,30);
        System.out.println("Inside This");
    }
    public  This(float length){
        this.length=length;
        System.out.println("Inside This1");
    }
    public This(float length,float breadth){
        this.length=length;
        this.breadth=breadth;
        System.out.println("Inside This2");
    }
}
