package mypackage;

public class Main {
    public static void main(String arg[]){
        Dog dog1= new Dog();
        dog1.age=4;
        dog1.breed="Undefined";
        dog1.color="WhiteBrown";

        dog1.bark();
        System.out.print("Dog eats: ");
        System.out.println(dog1.eat());

    }

}
