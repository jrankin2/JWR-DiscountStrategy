
import java.util.HashMap;
import java.util.Map;

/**
 * Provides a way to find customers from a customer id input, and products from
 * a product id input.
 * @version 1.0
 * @author Joe Rankin
 */
public class FakeDatabase implements InformationStrategy{
    
    private Map<String, Customer> customers = new HashMap<String, Customer>();
    private Map<String, Product> products = new HashMap<String, Product>();
    
    /*
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
    */
    public FakeDatabase(){
        //populate the "databases"...
        customers.put("C100", new Customer("C100", "John", "Smith"));
        customers.put("C200", new Customer("C200", "Sally", "Jones"));
        customers.put("C300", new Customer("C300", "Bob", "Clementi"));
        
        products.put("A101", new Product("A101", "Baseball Hat", 19.95, new VariableRateDiscount(0.15)));
        products.put("A102", new Product("A102", "Men's Dress Shirt", 35.50, new QuantityDiscount(.10, 5)));
        products.put("A103", new Product("A103", "Women's Socks", 9.50, new NoDiscount()));
        
    }

    // Find a customer in the array by its id.
    // Returns null if not found.
    public final Customer findCustomer(final String custId) {
        if(custId == null){
            throw new IllegalArgumentException();
        }
        
        if(!customers.containsKey(custId)){
            return null;
        } else{
            return customers.get(custId);
        }
        
        /*
        Customer customer = null;
        for (Customer c : customers) {
            if (custId.equals(c.getId())) {
                customer = c;
                break;
            }
        }

        return customer;
        */
    }

    // Find a product in the array by its id.
    // Returns null if not found.
    public final Product findProduct(final String prodId) {
        if(prodId == null){
            throw new IllegalArgumentException();
        }
        
        if(!products.containsKey(prodId)){
            return null;
        } else{
            return products.get(prodId);
        }
        
        /*
        Product product = null;
        for (Product p : products) {
            if (prodId.equals(p.getId())) {
                product = p;
                break;
            }
        }

        return product;
        */
    }
}