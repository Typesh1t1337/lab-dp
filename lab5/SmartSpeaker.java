package lab5;

public class SmartSpeaker {
    private boolean isPlaying;

    public SmartSpeaker() {
        this.isPlaying = false;
    }

    public void play(){
        this.isPlaying = true;
    }

    public void pause(){
        this.isPlaying  = false;
    }
}
