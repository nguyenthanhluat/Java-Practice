package OOPJava.Polymorphism;

public class VIBBank extends Bank {
    @Override
    public void getRateOfInterest() {
        System.out.println("VIBBank - rate of interest is " + (getRate() + 8));
    }
}
