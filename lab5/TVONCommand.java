package lab5;

public class TVONCommand implements Command {
    private SmartTV tv;

    @Override
    public void execute() {
        tv.turnOn();
    }

    @Override
    public void undo() {
        tv.turnOff();
    }
}
