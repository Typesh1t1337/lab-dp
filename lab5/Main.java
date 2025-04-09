package lab5;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Command command = new TurnOnCommand(new SmartLight());
        Command command1 = new TurnOffCommand(new SmartLight());
        command.undo();
        RemoteControl remoteControl = new RemoteControl(command);
        remoteControl.pressButton();
        remoteControl.getAllHistories();
        remoteControl.undoLastCommand();

    }
}
