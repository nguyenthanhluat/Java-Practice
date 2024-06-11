package OOPJava.Abstraction;

public class PinkFlower implements DrawFlower{
    @Override
    public String getColor() {
        return "pink";
    }

    @Override
    public String getNational() {
        return "VietNam";
    }

    @Override
    public void draw() {
        System.out.println("Pink flower drawing..." + getColor() + " in " + getNational());
    }
}
