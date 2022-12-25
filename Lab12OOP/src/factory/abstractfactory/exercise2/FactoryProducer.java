package factory.abstractfactory.exercise2;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type) {
        if (type.equalsIgnoreCase("RoundedShape")) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
