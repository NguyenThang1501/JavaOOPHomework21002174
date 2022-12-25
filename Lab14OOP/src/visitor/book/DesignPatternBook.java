package visitor.book;

public class DesignPatternBook extends ProgrammingBook {
    private String resource;
    private String bestseller;

    public DesignPatternBook(double price, String resource, String bestseller) {
        super(price);
        this.resource = resource;
        this.bestseller = bestseller;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getResource() {
        return this.resource;
    }

    public String getBestseller() {
        return bestseller;
    }
}
