package factory.shape;

public class Driver {
    public static void main(String[] args) {
        ShapeFactory f = ShapeFactory.getShapeFactory();
        Shape shape1 = f.makeCircle();
        shape1.draw();
        Shape shape2 = f.makeSquare();
        shape2.draw();
    }
}
