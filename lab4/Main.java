package lab4;

public class Main {
    public static void main(String[] args) {
        Logistics logistics;
        Transport transport;

        logistics = new RoadLogistics();
        transport = logistics.createTransport();
        transport.deliver();
    }
}
