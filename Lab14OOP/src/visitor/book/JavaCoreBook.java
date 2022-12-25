package visitor.book;

public class JavaCoreBook extends ProgrammingBook {
    private String resource;
    private String favouriteBook;

    public JavaCoreBook(double price, String resource, String favouriteBook) {
        super(price);
        this.resource = resource;
        this.favouriteBook = favouriteBook;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getResource() {
        return resource;
    }

    public String getFavouriteBook() {
        return favouriteBook;
    }
}
