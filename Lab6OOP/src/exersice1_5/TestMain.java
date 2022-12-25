package exersice1_5;

public class TestMain {
    public static void main(String[] args) {
        Animal animal1 = new Animal("A");
        System.out.println(animal1);

        Mammal mammal1 = new Mammal("M");
        System.out.println(mammal1);

        Cat cat1 = new Cat("Miu");
        System.out.println(cat1);
        cat1.greets();

        Dog dog1 = new Dog("Mic");
        System.out.println(dog1);
        dog1.greets();

        Dog dog2 = new Dog("Lu");
        dog2.greets(dog1);
    }
}
