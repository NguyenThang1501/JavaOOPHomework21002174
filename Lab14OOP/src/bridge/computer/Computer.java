package bridge.computer;

public abstract class Computer {
    protected OperatingSystem os;

    public Computer(OperatingSystem os) {
        this.os = os;
    }

    abstract void startup();

    abstract void browseInternet(String url);

    abstract boolean canMoveComputer();
}
