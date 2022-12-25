package decorator.icecream;

public class NutsToppingDecorator extends ToppingDecorator {
    IceCream iceCream;

    public NutsToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " with " + addTopping();
    }

    @Override
    public String addTopping() {
        return "NutsTopping";
    }
}
