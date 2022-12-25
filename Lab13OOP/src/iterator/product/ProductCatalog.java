package iterator.product;

public class ProductCatalog implements Iterable {

    private String[] productCatalog;
    private final int SIZE = 100;

    private int length;

    public ProductCatalog() {
        productCatalog = new String[SIZE];
        length = -1;
    }

    public ProductCatalog add(String product) {
        if (this.length == this.productCatalog.length) {
            return this;
        }
        this.productCatalog[this.length + 1] = product;
        this.length = this.length + 1;
        return this;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator(this.productCatalog, this.length);
    }

}
