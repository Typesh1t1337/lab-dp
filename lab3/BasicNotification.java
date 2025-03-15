package lab3;

public class BasicNotification implements Notification{
    public String customerName;
    public BasicNotification() {

    }

    public BasicNotification(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void send(String message){
        System.out.println(this.customerName + " " + message);
    }



}
