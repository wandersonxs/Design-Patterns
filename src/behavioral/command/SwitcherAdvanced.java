package behavioral.command;

import java.util.ArrayList;
import java.util.List;

// Invoker
public class SwitcherAdvanced {

    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }
    public void execute() {
        commands.forEach(n-> n.execute());
    }
}
