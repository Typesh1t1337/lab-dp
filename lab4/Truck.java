package lab4;

public class Truck implements Transport{

    private DeliveryStatus status  = DeliveryStatus.IN_PROGRESS;
    @Override
    public void deliver() {
        System.out.println("delivery cargo by land");
    }

    @Override
    public String getType() {
        return "Truck";
    }

    @Override
    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    public DeliveryStatus getStatus() {
        return status;
    }
}
