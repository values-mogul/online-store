import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String name;
    private Map<Integer, Order> orders = new HashMap<>();
    private static int orderIdCounter = 1;

    public Customer(String name) {
        this.name = name;
    }

    public int placeOrder(ShoppingCart shoppingCart) {
        int orderId = orderIdCounter++;
        Order order = new Order(orderId, shoppingCart);
        orders.put(orderId, order);
        return orderId;
    }

    public void displayOrder(int orderId) {
        Order order = orders.get(orderId);
        if (order != null) {
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Products:");
            for (Map.Entry<Product, Integer> entry : order.getShoppingCart().getProducts().entrySet()) {
                System.out.println(entry.getKey().getName() + ": " + entry.getValue());
            }
            System.out.println("Total: $" + order.getShoppingCart().calculateTotal());
        } else {
            System.out.println("Order with ID " + orderId + " not found.");
        }
    }
}
