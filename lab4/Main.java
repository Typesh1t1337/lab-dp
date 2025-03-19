package lab4;

public class Main {
    public static void main(String[] args) {
        Logistics logistics;
        Transport transport;

        logistics = new RoadLogistics();
        transport = logistics.createTransport();
        transport.deliver();

        LogisticsManager manager = LogisticsManager.getInstance();

        Transport truck = new Truck();
        Transport ship = new Ship();
        Transport plane = new Plane();

        manager.registerTransport(truck);
        manager.registerTransport(ship);
        manager.registerTransport(plane);


        try {
            Thread.sleep(1000);
            manager.showDeliverySummary();
            Thread.sleep(3000);
            manager.showDeliverySummary();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
