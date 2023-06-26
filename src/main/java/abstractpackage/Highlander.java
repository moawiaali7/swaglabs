package abstractpackage;

public class Highlander extends Toyota{
    // class can inheritance(extends) to abstract class and abstract class can  implements interface in different package
    @Override
    public void colors() {
        System.out.println("this method from paint table interface");
    }

    @Override
    public void print() {
        System.out.println(" this method from print table interface");
    }
    public void suv(){
        System.out.println("this method from highlander class ");
    }
}
