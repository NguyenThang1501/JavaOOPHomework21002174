package visitor.book;

public class ConcreteVisitor implements Visitor {
    private double totalPrice;

    public ConcreteVisitor() {
        this.totalPrice = 0.0;
    }

    @Override
    public void visit(BusinessBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getPublisher());
    }

    @Override
    public void visit(DesignPatternBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getResource());
        System.out.println(book.getBestseller());
    }

    @Override
    public void visit(JavaCoreBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getResource());
        System.out.println(book.getFavouriteBook());
    }

    public double getTotalPrice(){
        return this.totalPrice;
    }
}
