package interfacepackage;

public interface PaintTable extends PrintTable {
    // interface can have method without body.
    //interface can extend another interface.
    //interface can have default method.
    //interface can have static method.

    //method without body
    void colors();

    //default method
    default void red(){
        System.out.println("default method");
    }

    //static method
    static int array(int i){
        return i*i*i;
    }
}
