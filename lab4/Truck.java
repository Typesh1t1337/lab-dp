package lab4;

public class Truck implements Transport{

    private DeliveryStatus status  = DeliveryStatus.IN_PROGRESS;
    @Override
    public void deliver() {
        try{
            System.out.println("Truck delivery started...");
            Thread.sleep(1000);
            System.out.println("Truck  delivery completed.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
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
