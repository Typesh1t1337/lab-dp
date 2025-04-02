package lab5;
import java.util.Stack;

public class RemoteControl {
    private Command command;
    private Stack<Command> history = new Stack<>();

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
        history.push(command);
    }

    public void undoLastCommand(){
        if(!history.isEmpty()){
            Command command = history.pop();
            command.undo();
        }
    }
}
