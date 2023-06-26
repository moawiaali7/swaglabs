package polymorphism;

public class Bank {

    public float  getRateOfInterest(float a,float b){
        return a+b;
    }
}
 class SBA extends Bank{
    public float  getRateOfInterest(float a,float b){
        return a*b;
    }
}
     class CC extends Bank{
     public float  getRateOfInterest (float a,float b){
         return a/b;
     }
 }
     class VIS extends Bank{
         public float  getRateOfInterest(float a,float b){
             return a-b;
         }
     }