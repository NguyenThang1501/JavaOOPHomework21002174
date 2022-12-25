package observer.exercise2;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        super(subject);
        this.subject.attach(this);
    }

    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()));
    }
}
