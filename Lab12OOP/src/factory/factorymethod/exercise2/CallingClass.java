package factory.factorymethod.exercise2;

public class CallingClass {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();

        Fruit fruit = fruitFactory.provideFruit("Apple");
        fruit.produceJuice();

        Fruit fruit1 = fruitFactory.provideFruit("Banana");
        fruit1.produceJuice();

        Fruit fruit2 = fruitFactory.provideFruit("Orange");
        fruit2.produceJuice();
    }
}
