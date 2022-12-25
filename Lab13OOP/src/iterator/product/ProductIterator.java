package iterator.product;

public class ProductIterator implements Iterator {
    private String[] productCatalog;
    private int length;

    private int currentPosition;

    public ProductIterator(String[] productCatalog, int length) {
        this.productCatalog = productCatalog;
        this.length = length;
    }

    @Override
    public boolean hasNext() {
        return (this.currentPosition <= length - 1) && (this.currentPosition < this.productCatalog.length - 1);
    }

    @Override
    public Object next() {
        return this.productCatalog[currentPosition++];
    }
}
