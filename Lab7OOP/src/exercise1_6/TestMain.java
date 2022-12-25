package exercise1_6;

public class TestMain {
    public static void main(String[] args) {
        Cat cat = new Cat("meo");
        cat.greets();

        Dog dog1 = new Dog("Cho1");
        dog1.greets();

        Dog dog2 = new Dog("Cho2");
        dog1.greets(dog2);

        BigDog bigDog = new BigDog("Be bu");
        bigDog.greets();
        bigDog.greets(dog1);

        BigDog bigDog1 = new BigDog("Be bu 1");
        bigDog1.greets(bigDog);
    }
}
