package factory.factorymethod.exercise2;

public class FruitFactory {
    public Fruit provideFruit(String type) {
        if (type.equalsIgnoreCase("Apple")) {
            return new Apple();
        } else if (type.equalsIgnoreCase("Banana")) {
            return new Banana();
        } else if (type.equalsIgnoreCase("Orange")) {
            return new Orange();
        }
        return null;
    }
}
