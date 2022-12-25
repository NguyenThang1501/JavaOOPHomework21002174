package factory.abstractfactory.exercise2;

public class RoundedShapeFactory extends ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new RoundedSquare();
        }
        return null;
    }
}
