package OOPJava.Polymorphism;

public class VCBank extends Bank {
    @Override
    public void getRateOfInterest() {
        System.out.println("VCBank - rate of interest is " + (getRate() + 7));
    }
}
