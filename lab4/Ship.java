package lab4;

public class Ship implements Transport{

    @Override
    public void deliver() {
        System.out.println("by sea");
    }
}
