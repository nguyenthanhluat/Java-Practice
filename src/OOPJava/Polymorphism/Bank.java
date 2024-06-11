package OOPJava.Polymorphism;

public class Bank {
    public int getRate() {
        return rate;
    }

    private int rate = 0;

    public void getRateOfInterest() {
        System.out.println("Bank - rate of interest is " + rate);
    }

    public void addRate(int add) {
        rate = rate + add;
        System.out.println("Bank - rate add is " + rate);
    }

    //Overloading
    public void addRate(int add, int addMore) {
        rate = rate + add + addMore;
        System.out.println("Bank - rate add more is " + rate);
    }
}
