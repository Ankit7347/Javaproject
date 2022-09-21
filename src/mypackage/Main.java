package mypackage;

public class Main {
    public static void main(String[] arg){
        Dog dog1= new Dog();//Default Constructor

        dog1.breed="Undefined";
        dog1.age=4;
        dog1.color="WhiteBrown";
        dog1.bark="Whooh! Whooh";

        System.out.println(dog1.breed);
        System.out.println(dog1.age);
        System.out.println(dog1.color);
        System.out.print("Dog eats: ");
        dog1.eat();
        System.out.println(dog1.bark());


        Dog dog2 =new Dog("Shepherd","Black_Brown","Wau",6);
        System.out.println(dog2.breed);
        System.out.println(dog2.age);
        System.out.println(dog2.color);

        System.out.print("Dog eats: ");
        dog2.eat();
        System.out.println(dog2.bark());
    }
}
