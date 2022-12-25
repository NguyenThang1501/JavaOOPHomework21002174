package factory.abstractfactory.exercise2;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        FactoryProducer producer = new FactoryProducer();

        AbstractFactory shapeFactory = producer.getFactory("Normal");
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
        Shape square = shapeFactory.getShape("Square");
        square.draw();

        AbstractFactory roundedShapeFactory = producer.getFactory("RoundedShape");
        Shape roundedRectangle = roundedShapeFactory.getShape("Rectangle");
        roundedRectangle.draw();
        Shape roundedSquare = roundedShapeFactory.getShape("Square");
        roundedSquare.draw();
    }
}
