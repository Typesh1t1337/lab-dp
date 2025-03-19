package lab4;

public class Ship implements Transport{

    public DeliveryStatus status = DeliveryStatus.IN_PROGRESS;
    @Override
    public void deliver() {
        System.out.println("by sea");
    }

    @Override
    public String getType() {
        return "Ship";
    }

    @Override
    public void setStatus(DeliveryStatus deliveryStatus) {
        this.status = deliveryStatus;
    }

    public DeliveryStatus getStatus(){
        return this.status;
    }
}
