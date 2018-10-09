package factory.shape;

public class ShapeFactory {
    private static ShapeFactory instance = null;
    private ShapeFactory() {}

    public Shape makeCircle() {
        return new Circle();
    }

    public Shape makeSquare() {
        return new Square();
    }

    public static ShapeFactory getShapeFactory() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }
}
