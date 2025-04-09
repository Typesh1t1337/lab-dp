package lab5;

public class TurnOffCommand implements Command {
    private SmartLight light;

    public TurnOffCommand(SmartLight light){
        this.light = light;
    }

    @Override
    public String execute() {
        light.turnOff();
        System.out.println("executed");
        return "Executed";
    }

    public String executeSIm(){
        light.turnOff();
        return "Turned offssss";
    }


    @Override
    public void undo(){
        light.turnOn();
        System.out.println("success undo");
    }

    public SmartLight getLight() {
        return light;
    }
}
