package observer.exercise2;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        super(subject);
        this.subject.attach(this);
    }

    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
