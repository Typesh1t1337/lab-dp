package lab5;

public class TVONCommand implements Command {
    private SmartTV tv;

    @Override
    public String  execute() {
        tv.turnOn();
        return "executed";
    }

    @Override
    public void undo() {
        tv.turnOff();
    }
}
