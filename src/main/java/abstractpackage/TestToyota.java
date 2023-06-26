package abstractpackage;

import interfacepackage.PaintTable;

public class TestToyota {
    //All method are available from abstract class and interface from different package

    public static void main(String[] args) {
        Highlander hi=new Highlander();
        hi.suv();
        hi.colors();
        hi.red();
        hi.print();
        hi.camry();
        System.out.println(PaintTable.array(7));
    }
}
