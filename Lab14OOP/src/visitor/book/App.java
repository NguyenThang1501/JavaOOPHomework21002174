package visitor.book;

public class App {
    public static void main(String[] args) {
        ConcreteVisitor visitor = new ConcreteVisitor();

        Book businessBook1 = new BusinessBook(50.0, "DHQG");
        businessBook1.accept(visitor);
        System.out.println();

        Book designPatternBook1 = new DesignPatternBook(60.0, "Store", "HeadFirst");
        designPatternBook1.accept(visitor);
        System.out.println();

        Book javaCoreBook1 = new JavaCoreBook(70.0, "Store", "Google");
        javaCoreBook1.accept(visitor);
        System.out.println();

        System.out.println(visitor.getTotalPrice());
    }
}
