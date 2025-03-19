package lab4;

public class Plane implements Transport{
    public DeliveryStatus status = DeliveryStatus.IN_PROGRESS;

    @Override
    public void deliver() {
        try{
            System.out.println("Plane delivery started...");
            Thread.sleep(1000);
            System.out.println("Plane delivery completed.");
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
    }

    @Override
    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    @Override
    public DeliveryStatus getStatus(){
        return this.status;
    }

    @Override
    public String getType() {
        return "Plane";
    }
}
