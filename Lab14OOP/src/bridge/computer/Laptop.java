package bridge.computer;

public class Laptop extends Computer {
    public Laptop(OperatingSystem os) {
        super(os);
    }

    @Override
    void startup() {
        this.os.startup();
    }

    @Override
    void browseInternet(String url) {
        this.os.loadUrl(url);
        System.out.println("Laptop is browsing url: " + url);
    }

    @Override
    boolean canMoveComputer() {
        return true;
    }
}
