package lab4;

public interface Transport {
    public void deliver();
    String getType();
    void setStatus(DeliveryStatus deliveryStatus);
    DeliveryStatus getStatus();
}
