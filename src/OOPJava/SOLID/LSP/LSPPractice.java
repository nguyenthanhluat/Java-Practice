package OOPJava.SOLID.LSP;

public class LSPPractice {
    public static void testLSP(){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(50);
        rectangle.setHeight(100);
        System.out.println(rectangle.calculateArea());

        Rectangle square = new Square();
        square.setHeight(50);
        System.out.println(square.calculateArea());
    }
}
