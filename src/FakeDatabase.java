public class FakeDatabase implements InformationStrategy{
    
    private Customer[] customers = {
        new Customer("C100", "John", "Smith"),
        new Customer("C200", "Sally", "Jones"),
        new Customer("C300", "Bob", "Clementi")
    };
    
    private Product[] products = {
        new Product("A101", "Baseball Hat", 19.95, new VariableRateDiscount(0.15)),
        new Product("A102", "Men's Dress Shirt", 35.50, new QuantityDiscount(.10, 5)),
        new Product("A103", "Women's Socks", 9.50, new NoDiscount())
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