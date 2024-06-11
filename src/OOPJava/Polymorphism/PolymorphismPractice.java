package OOPJava.Polymorphism;

public class PolymorphismPractice {
    public static void testPolymorphism() {
        Bank bank = new Bank();
        Bank vpBank = new VPBank();
        Bank vcBank = new VCBank();
        Bank vibBank = new VIBBank();

        bank.getRateOfInterest();
        vpBank.getRateOfInterest();
        vcBank.getRateOfInterest();
        vibBank.getRateOfInterest();

        bank.addRate(4);
        vpBank.addRate(4, 2);
        bank.getRateOfInterest();
        vpBank.getRateOfInterest();
        vcBank.getRateOfInterest();
        vibBank.getRateOfInterest();
    }
}
