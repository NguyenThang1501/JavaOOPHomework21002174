package visitor.computer;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
