package OOPJava.SOLID.OCP;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addToCart(Item item){
        items.add(item);
    }

    public double calculateCardValue(){
        double value = 0.0;
        for (Item item : items){
            value += item.price;
        }
        return value;
    }
}
