package lab5;

public class SmartLight {
    private boolean isTurnedOn;

    public SmartLight() {
        this.isTurnedOn = false;
    }

    public void turnOn(){
        this.isTurnedOn = true;
        System.out.println("Turned on");
    }

    public void turnOff(){
        this.isTurnedOn = false;
        System.out.println("Turned off");
    }
}
