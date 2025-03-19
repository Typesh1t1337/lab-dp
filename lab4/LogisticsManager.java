package lab4;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;


public class LogisticsManager {
    private static volatile LogisticsManager instance;
    private static final ReentrantLock lock  = new ReentrantLock();
    private final List<Transport> activeTransports = new ArrayList<>();

    private LogisticsManager() {

    }

    public static LogisticsManager getInstance() {
        if (instance == null){
            lock.lock();
            try {
             if (instance == null){
                 instance = new LogisticsManager();
             }
            } catch (Exception e) {
                System.out.println(e.toString());
                return instance;
            } finally {
                lock.unlock();
            }
        }
        return instance;
    }

    public void registerTransport(Transport transport){
        synchronized (this.activeTransports) {
            activeTransports.add(transport);
        }

        new Thread(() -> {
            transport.deliver();
            updateDeliveryStatus(transport,DeliveryStatus.COMPLETED);
        }).start();
    }

    public void updateDeliveryStatus(Transport transport, DeliveryStatus status){
        synchronized (this.activeTransports) {
            transport.setStatus(status);
            if(status == DeliveryStatus.COMPLETED || status == DeliveryStatus.CANCELLED){
                this.activeTransports.remove(transport);
            }
        }
    }

    public void showDeliverySummary(){
        synchronized (this.activeTransports){
            System.out.println("Deliveries: ");
            for (Transport transport : this.activeTransports) {
                System.out.println(transport.getType() + transport.getStatus());
            }
        }
    }

}