package abstractpackage;

public class TestCar {
    public static void main(String[] args) {
        Car  C= new CRV();
        Car car= new HRV();
        C.honda();
        car.honda();
        C.nonAbstract();
        car.nonAbstract();
    }
}
