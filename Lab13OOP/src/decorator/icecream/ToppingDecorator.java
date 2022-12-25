package decorator.icecream;

public abstract class ToppingDecorator implements IceCream {
    @Override
    public abstract String getDescription();

    public abstract String addTopping();
}
