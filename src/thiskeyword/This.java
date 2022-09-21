package thiskeyword;
//this class runs first then main run
public class This {
    public float length;
    public float breadth;

    public This(){              //default constructor
        this(20,30); //call the paremeterised constructor as value is passed and  then the value stored in instance variable
        System.out.println("Inside This");
    }
    public  This(float length){   //parameterised constructor
        this.length=length;
        System.out.println("Inside This1");
    }
    public This(float length,float breadth){ //parameterised constructor
        this.length=length;
        this.breadth=breadth;
        System.out.println("Inside This2");
    }
}
