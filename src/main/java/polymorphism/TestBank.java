package polymorphism;

public class TestBank {

    public static void main(String[] args) {

        Bank B =new Bank();
        System.out.println("Bank rate of interest: "+B.getRateOfInterest(2.5f,5.7f));
        B=new SBA();
        System.out.println("SBA rate of interest: "+B.getRateOfInterest(3,8));
        B= new CC();
        System.out.println("CC rate of interest: "+B.getRateOfInterest(7,9));
        B=new VIS();
       System.out.println("VIS rate of interest: "+B.getRateOfInterest(11,9));

    }
}
