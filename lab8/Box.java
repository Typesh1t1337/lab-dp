package lab8;

import java.util.*;

public class Box implements OrderComponent{
    private String name;
    private List<OrderComponent> childComponent = new ArrayList<>();

    public Box(String name) {
        this.name = name;
    }

    public void add(OrderComponent orderComponent) {
        childComponent.add(orderComponent);
    }

    @Override
    public double getTotalPrice(){
        return childComponent.stream().mapToDouble(OrderComponent::getTotalPrice).sum();
    }

    @Override
    public String getName() {
        return name;
    }

    public List<OrderComponent> getChildComponent() {
        return childComponent;
    }
}
