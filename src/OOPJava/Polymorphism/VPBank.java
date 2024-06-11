package OOPJava.Polymorphism;

public class VPBank extends Bank {
    @Override
    public void getRateOfInterest() {
        System.out.println("VPBank - rate of interest is " + (getRate() + 9));
    }
}
