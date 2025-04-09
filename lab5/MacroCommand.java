package lab5;

import java.util.List;

public class MacroCommand implements  Command{
    private List<Command> commands;

    public MacroCommand(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public String execute() {
        for(Command command: commands){
            command.execute();
        }
        return "executed";
    }

    @Override
    public void undo() {
        for(int i = commands.size() - 1; i>=0; i--){
            commands.get(i).undo();

        }
    }
}
