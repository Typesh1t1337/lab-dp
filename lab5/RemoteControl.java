package lab5;
import java.util.Stack;

public class RemoteControl {
    private Command command;
    private Stack<Command> history = new Stack<>();

    public RemoteControl(Command command){
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void getAllHistories(){
        for(Command command1: history){
            System.out.println(command1.execute());
        }
    }

    public void pressButton(){
        command.execute();
        history.push(command);
        System.out.println("pressed");
    }

    public void undoLastCommand(){
        if(!history.isEmpty()){
            Command command = history.pop();
            command.undo();
            System.out.println("undo");
        } else{
            System.out.println("its empty");
        }
    }
}
