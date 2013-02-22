
public class FakeDatabase {

    private Customer[] customers = {
        new Customer("100", "John", "Smith"),
        new Customer("200", "Sally", "Jones"),
        new Customer("300", "Bob", "Clementi")
    };
    
    private Product[] products = {
        new Product("A101", "Baseball Hat", 19.95, new VariableRateDiscount(0.15)),
        new Product("B205", "Men's Dress Shirt", 35.50, new QuantityDiscount(.10, 5)),
        new Product("C222", "Women's Socks", 9.50, new NoDiscount())
    };

    // Find a customer in the array by its id.
    // Returns null if not found.
    public final Customer findCustomer(final String custId) {
        Customer customer = null;
        for (Customer c : customers) {
            if (custId.equals(c.getId())) {
                customer = c;
                break;
            }
        }

        return customer;
    }

    // Find a product in the array by its id.
    // Returns null if not found.
    public final Product findProduct(final String prodId) {
        Product product = null;
        for (Product p : products) {
            if (prodId.equals(p.getId())) {
                product = p;
                break;
            }
        }

        return product;
    }
}