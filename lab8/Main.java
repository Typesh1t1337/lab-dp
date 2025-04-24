package lab8;

public class Main {
    public static void main(String[] args) {
        PDFOrderParser parser = new PDFOrderParser();
        Box root = parser.parsePdfToOrder("products.pdf");
        printTree(root, "");
        System.out.println("\ntotal price:" + root.getTotalPrice());

        OrderContext order = new OrderContext();

        System.out.println("start: " + order.getStatus());
        order.nextState();
        System.out.println("next: " + order.getStatus());
        order.nextState();
        System.out.println("next: " + order.getStatus());
        order.cancel();
        order.nextState();
        System.out.println("res: " + order.getStatus());
    }

    public static void printTree(OrderComponent component, String indent) {
        System.out.println(indent + "- " + component.getName() + " ($" + component.getTotalPrice() + ")");
        if (component instanceof Box) {
            for (OrderComponent child : ((Box) component).getChildComponent()) {
                printTree(child, indent + "  ");
            }
        }
    }

}
