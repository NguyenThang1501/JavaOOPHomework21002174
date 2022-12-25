package command.computer;

import java.util.LinkedList;
import java.util.List;

public class Switch {
    private List<Command> historyCommands;

    public Switch() {
        historyCommands = new LinkedList<>();
    }

    public void store(Command command) {
        historyCommands.add(command);
    }

    public void execute(Command command) {
        command.execute();
    }

    public void executeAndStore(Command command) {
        execute(command);
        store(command);
    }

    public void reexecuteAllCommand() {
        for (Command command : historyCommands) {
            command.execute();
        }
    }
}
