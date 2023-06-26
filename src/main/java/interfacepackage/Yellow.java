package interfacepackage;

public class Yellow implements PaintTable{
    @Override
    public void colors() {
        System.out.println("this method from paintTable interface");

    }

    @Override
    public void print() {
        System.out.println("this method form printTable interface");

    }
}
