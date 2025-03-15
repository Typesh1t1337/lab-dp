package lab4;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("delivery cargo by land");
    }
}
