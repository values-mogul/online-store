public class Order {
    private int orderId;
    private ShoppingCart shoppingCart;

    public Order(int orderId, ShoppingCart shoppingCart) {
        this.orderId = orderId;
        this.shoppingCart = shoppingCart;
    }

    public int getOrderId() {
        return orderId;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}
