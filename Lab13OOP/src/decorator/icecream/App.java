package decorator.icecream;

public class App {
    public static void main(String[] args) {
        VanillaIceCream vanillaIceCream = new VanillaIceCream();
        HoneyToppingDecorator honeyToppingDecorator = new HoneyToppingDecorator(vanillaIceCream);
        System.out.println(honeyToppingDecorator.getDescription());
    }
}
