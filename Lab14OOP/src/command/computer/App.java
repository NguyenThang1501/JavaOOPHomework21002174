package command.computer;

public class App {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();

        Switch switcher = new Switch();

        Command command1 = new ShutdownCommand(computer1);
        Command command2 = new RestartCommand(computer1);

        switcher.executeAndStore(command1);
        switcher.executeAndStore(command2);
        System.out.println();

        switcher.reexecuteAllCommand();
    }
}
