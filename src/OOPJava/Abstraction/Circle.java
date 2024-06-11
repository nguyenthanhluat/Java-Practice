package OOPJava.Abstraction;

public class Circle extends Shape{
    public Circle(String color) {
        super(color);
    }

    @Override
    void paint() {
        System.out.println("Circle paint " + getColor());
    }
}
