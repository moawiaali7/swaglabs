package finalpackage;

 final public class FinalClass {
     // can not inherit final class to other class
     int speedLimit=55;
    int minSpeed=30;
     public static void main(String[] args) {

         FinalClass f=new FinalClass();
         System.out.println( f.speedLimit);
         System.out.println( f.minSpeed);

     }
}
     //for example
     /*public class OtherClass extends FinalClass{
     public static void sayhi() {
        System.out.println("HI");
    }
    }*/