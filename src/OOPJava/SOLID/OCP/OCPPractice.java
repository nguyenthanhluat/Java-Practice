package OOPJava.SOLID.OCP;

public class OCPPractice {
    public static void testOCP(){
        Item electronic = new ElectronicItem(800);
        Item gift = new GiftItem(500);
        Item grocery = new GroceryItem(600);

        Cart cart = new Cart();
        cart.addToCart(electronic);
        cart.addToCart(gift);
        cart.addToCart(grocery);
        System.out.println(cart.calculateCardValue());
    }
}
