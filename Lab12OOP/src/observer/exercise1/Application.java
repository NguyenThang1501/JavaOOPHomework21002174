package observer.exercise1;

public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();
        LogOpenListener logger = new LogOpenListener("log.txt");
        EmailNotificationListener email = new EmailNotificationListener("admin2@example.com");
        editor.events.subscribe("open", logger);
        editor.events.subscribe("open", email);

        LogOpenListener loggingListener = new LogOpenListener("log_save.txt");
        EmailNotificationListener emailAlerts = new EmailNotificationListener("admin@example.com");
        editor.events.subscribe("save", emailAlerts);
        editor.events.subscribe("save", loggingListener);

        editor.openFile("test1.txt");
        editor.openFile("test2.txt");
        try {
            editor.saveFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

