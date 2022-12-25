package bridge.computer;

public class PC extends Computer {
    public PC(OperatingSystem os) {
        super(os);
    }

    @Override
    void startup() {
        this.os.startup();
    }

    @Override
    void browseInternet(String url) {
        this.os.loadUrl(url);
        System.out.println("PC is browsing url: " + url);
    }

    @Override
    boolean canMoveComputer() {
        return false;
    }
}
