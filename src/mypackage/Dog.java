package mypackage;

public class Dog {
    public String breed;
    public int age;
    public String color;
    public String bark;
    public Dog(){
        System.out.println("Default constructor");
    }

    public Dog(String Breed,String Color,String Bark,int Age){
        //doesn't have void and return type
        System.out.println("Parameterized constructor");
        breed=Breed;
        color=Color;
        bark=Bark;
        age=Age;
    }

    public void eat(){
        System.out.println("Milk and Curd");
    }
    public String bark(){
        return(bark);

    }
}
