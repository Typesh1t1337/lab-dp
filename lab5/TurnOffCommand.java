package lab5;

public class TurnOffCommand implements Command {
    private SmartLight light;

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo(){
        light.turnOn();
    }
}
