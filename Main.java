public class Main {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Smartphone", 500);
        Product product3 = new Product("Headphones", 50);

        // Create a customer
        Customer customer = new Customer("John Doe");

        // Add products to the shopping cart
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(product1, 2);
        shoppingCart.addProduct(product2, 1);
        shoppingCart.addProduct(product3, 3);

        // Place an order
        int orderId = customer.placeOrder(shoppingCart);

        // Display order details
        customer.displayOrder(orderId);
    }
}
