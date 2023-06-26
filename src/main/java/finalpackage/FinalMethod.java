package finalpackage;

public class FinalMethod {
    // can not inherit final method to other class

    public static void main(String[] args) {

      FinalMethod fa = new FinalMethod();
      fa.sayhi();

    }
    final public void sayhi(){
        System.out.println("HI");
    }

       }
    // for example
    /*public class OtherClass extends FinalMethod{
    public static void sayhi() {
       System.out.println("HI");

   }

       }*/


