package finalpackage;

public class FinalVariable {
    // can not reassign a value to final variable
    final int speedLimit=55;
    final int minSpeed=30;
   // for example
  /* public void Variable(){
        speedLimit=66;
        minSpeed=77;
    }*/

    public static void main(String[] args) {

        FinalVariable f=new FinalVariable();
       System.out.println( f.speedLimit);
        System.out.println( f.minSpeed);

    }


    }


