package OOPJava.Abstraction;

public class AbstractionPractice {
    public static void testAbstraction(){
        Shape rectangle = new Rectangle("red");
        Shape circle = new Circle("blue");
        rectangle.paint();
        circle.paint();

        //Interface
        DrawFlower pinkFlower = new PinkFlower();
        pinkFlower.draw();
    }
}
