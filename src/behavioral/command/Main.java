package behavioral.command;

public class Main {
    public static void main(String[] args) {

        Light light = new Light();

        TurnLightOnCommand turnLightOnCommand = new TurnLightOnCommand(light);
        TurnLightOffCommand turnLightOffCommand = new TurnLightOffCommand(light);

        Switcher switcher = new Switcher(turnLightOnCommand);
        switcher.execute();

        switcher = new Switcher(turnLightOffCommand);
        switcher.execute();

        SwitcherAdvanced switcherAdvanced = new SwitcherAdvanced();

        switcherAdvanced.addCommand(turnLightOnCommand);
        switcherAdvanced.addCommand(turnLightOffCommand);
        switcherAdvanced.addCommand(turnLightOnCommand);
        switcherAdvanced.addCommand(turnLightOffCommand);
        switcherAdvanced.addCommand(turnLightOnCommand);
        switcherAdvanced.addCommand(turnLightOffCommand);

        switcherAdvanced.execute();
    }
}
