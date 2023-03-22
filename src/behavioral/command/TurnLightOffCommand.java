package behavioral.command;

public class TurnLightOffCommand implements Command {

    private Light light;

    public TurnLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
