package interfacepackage;

public class Put implements DrawTable,PrintTable{
    @Override
    public void draw() {
        System.out.println("this is method from drawTable interface");
    }

    @Override
    public void print() {
        System.out.println("this is method from printTable interface");

    }
}
