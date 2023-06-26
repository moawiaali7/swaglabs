package abstractpackage;

public abstract class Car {
    //abstract method
    abstract void honda ();
    //constructor method
    Car(){
        System.out.println("this is constructor method for abstract class");

    }
    //non-abstract method
    void nonAbstract() {
        System.out.println("this non abstract method");
    }
}
