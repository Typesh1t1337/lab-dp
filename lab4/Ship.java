package lab4;

public class Ship implements Transport{

    public DeliveryStatus status = DeliveryStatus.IN_PROGRESS;
    @Override
    public void deliver() {
        try{
            System.out.println("Ship delivery started...");
            Thread.sleep(1000);
            System.out.println("Ship delivery completed.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
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
