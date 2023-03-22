package behavioral.command;

// Invoker
public class Switcher {

    private Command command;

    public Switcher(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
