package OOPJava.SOLID.OCP;

public class GiftItem extends Item{
    public GiftItem(double price) {
        super.price = price;
    }

    @Override
    public double getPrice() {
        return super.getPrice()*1.08 + super.price * 0.02;
    }
}
