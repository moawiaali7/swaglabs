package interfacepackage;

public class TestCleanAndMove {
    //clean class and Move class are implements 1 interface
    // drawTable is Interface
    //clean is a class
    //move is a class
    public static void main(String[] args) {
        DrawTable d= new Clean();
        DrawTable w=new Move();
        w.draw();
        d.draw();
    }
}
