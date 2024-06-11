package OOPJava.Abstraction;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract void paint();

    public String getColor() {
        return color;
    }
}
