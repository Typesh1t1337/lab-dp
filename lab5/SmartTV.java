package lab5;

public class SmartTV {

    private boolean isTurnedOn;
    private int channel;

    public SmartTV() {
        this.isTurnedOn = false;
        this.channel = 0;
    }

    public void turnOn(){
        this.isTurnedOn = true;
        System.out.println("Smart tv turned on!");
    }

    public void turnOff(){
        this.isTurnedOn = false;
        System.out.println("Smart tv turned off!");
    }

    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("channel successfully set");
    }
}
