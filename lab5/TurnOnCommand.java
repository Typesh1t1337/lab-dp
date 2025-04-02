package lab5;

public class TurnOnCommand implements Command {
    private SmartLight light;

    public TurnOnCommand(SmartLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
       light.turnOn();
    }

    @Override
    public void undo(){
        light.turnOff();
    }
}
