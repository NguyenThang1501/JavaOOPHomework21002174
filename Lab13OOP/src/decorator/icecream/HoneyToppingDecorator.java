package decorator.icecream;

public class HoneyToppingDecorator extends ToppingDecorator {
    IceCream iceCream;

    public HoneyToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " with " + addTopping();
    }

    @Override
    public String addTopping() {
        return "Honey Topping";
    }
}
