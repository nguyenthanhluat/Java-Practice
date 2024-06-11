package OOPJava.Abstraction;

public class Rectangle extends Shape{

    public Rectangle(String color) {
        super(color);
    }

    @Override
    void paint() {
        System.out.println("Rectangle paint " + getColor());
    }
}
