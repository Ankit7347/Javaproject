package thiskeyword;

public class Main {
    public static void main(String[] args){
        This rectangle= new This();
        rectangle.length=12;
        rectangle.breadth=20;

        This rectangle2 =new This(20,40);
        System.out.println(rectangle2.length);
        System.out.println(rectangle2.breadth);
    }
}
