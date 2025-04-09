package lab5;

public class TurnOnCommand implements Command {
    private SmartLight light;

    public TurnOnCommand(SmartLight light) {
        this.light = light;
    }

    @Override
    public String execute() {
       light.turnOn();
       System.out.println("sdddsds");
       return "executedsss";
    }

    @Override
    public void undo(){
        light.turnOff();
    }

}
