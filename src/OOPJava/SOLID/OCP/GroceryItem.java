package OOPJava.SOLID.OCP;

public class GroceryItem extends Item{
    public GroceryItem(double price) {
        super.price = price;
    }

    @Override
    public double getPrice() {
        return super.getPrice()*1.03;
    }
}
