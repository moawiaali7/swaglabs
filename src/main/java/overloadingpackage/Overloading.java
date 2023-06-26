package overloadingpackage;

public class Overloading {

    public static void main(String[] args) {
        int result = addNumber(55, 67);
        int result2 = addNumber(55, 67, 55);
        double result3= addNumber(5.6,7.9);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        addNumber();
    }

    public static int addNumber(int a, int b) {
        return a + b;

    }

    public static int addNumber(int a, int b, int c) {
        return a * b * c;

    }
    // static keyword in order to call this method on main method
    public static void addNumber() {
       int a = 33;
        System.out.println(a);
    }
    public static double addNumber(double a, double b) {
        return a+b;

}
}