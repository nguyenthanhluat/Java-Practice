package OOPJava.SOLID.OCP;

public class ElectronicItem extends Item{
    public ElectronicItem(double price) {
        super.price = price;
    }

    @Override
    public double getPrice() {
        return super.getPrice()*1.11;
    }
}
