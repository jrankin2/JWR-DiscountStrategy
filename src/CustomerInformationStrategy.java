/**
 * Strategy whose implementations provide a way to find customers by providing
 * a customer id.
 * @version 1.0
 * @author Joe Rankin
 */
public interface CustomerInformationStrategy {
    
    public abstract Customer findCustomer(String customerId);
    
}
