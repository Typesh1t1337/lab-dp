package lab5;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CommandScheduler {
    private ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

    public void scheduleCommand(Command command, long delay){
        scheduler.schedule(command::execute, delay, TimeUnit.MILLISECONDS);
    }

    public void shutDown(){
        scheduler.shutdown();
    }
}
