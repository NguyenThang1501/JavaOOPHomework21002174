package decorator.shape;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw() {
        shape.draw();
        setRedBorder();

    }

    public void setRedBorder() {
        System.out.println("Red border");
    }
}
