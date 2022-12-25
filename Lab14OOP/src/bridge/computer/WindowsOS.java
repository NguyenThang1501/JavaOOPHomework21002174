package bridge.computer;

public class WindowsOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("WindowOs is starting up");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("WindowOs is loading url: " + url + " windowOS");
    }
}
